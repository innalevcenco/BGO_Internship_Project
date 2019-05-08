@UI @test
Feature: Test of searching functionality

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'ilevcenco' username and 'Idiotin@153' password


  Scenario Outline: User is able to send the message to another user
    Given user is on the home page
    When user clicks on 'Logo' button
    Then dropdown list is displaeyed
    When user clicks on the 'Messages' link
    Then user is redirected to the inbox page
    When user clicks on the 'new message' link
    Then user is redirected on the 'Send Message' page
    When user enters '<receivers>', '<theme>' and '<message>'
    And user clicks on 'Send' button
    Then '<message>' is displaeyed on current page
    Examples:
      | receivers | theme            | message      |
      | ilevcenco | theme of message | message text |
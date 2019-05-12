#@UI @test @IL
#Feature: Test of send messages functionality
#
#  Background:
#    Given user is login on 'https://www.kinopoisk.ru/' with 'ilevcenco' username and 'ILoveTesting' password
#
#  Scenario Outline: User is able to send the message to another user
#    Given home page is open
#    When user clicks on 'Logo' button
#    Then dropdown list is displayed
#    When user clicks on 'Messages' link
#    Then user is redirected to the inbox page
#    When user clicks on the 'new message' link
#    Then user redirects on the 'Send Message' page
#    When user enters '<receivers>' and '<message>'
#    And user clicks on 'Send' button
#    Then '<message>' is displayed on current page
#    Examples:
#      | receivers      | message      |
#      | ariadnaciuvaga | message text |
#
#  Scenario: User is disable to send the message without user
#    Given home page is open
#    When user clicks on 'Logo' button
#    Then dropdown list is displayed
#    When user clicks on 'Messages' link
#    Then user is redirected to the inbox page
#    When user clicks on the 'new message' link
#    Then user redirects on the 'Send Message' page
#    When user clicks on 'Send' button
#    Then send button is disable
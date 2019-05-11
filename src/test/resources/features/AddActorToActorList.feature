#@UI @test
#Feature: Add actor to List
#
#  Background:
#    Given user is login on 'https://www.kinopoisk.ru/' with 'ilevcenco' username and 'Idiotin@153' password
#
#  Scenario Outline: User search the actor and add them to the actor list
#    Given home page is open
#    When user searches for '<actor>'
#    And user clicks on the 'HomeSearch' button
#    Then the list of actors is displayed
#    When user clicks on the first link
#    Then user is redirected on the Actor '<actor>' page
#    When user clicks on the 'Actors' folder
#    Then folder 'Актёры' appears on the page
#    Examples:
#      | actor         |
#      | Jeremy Renner |
#      | Hugh Laurie   |
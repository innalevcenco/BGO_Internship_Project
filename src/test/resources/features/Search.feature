@UI @test
Feature: Test of searching functionality

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'ilevcenco' username and 'Idiotin@153' password

  Scenario Outline: User is able to search movies using advanced filter
    Given user is on the home page
    When user clicks on 'Advanced Filter' button
    Then 'Advanced filter' page is displayed
    When user fills 'Actor' field with '<actor>' name
    And user select '<country>' country
    And user clicks on the 'Search' button
    Then the list of the films is displayed
    When user clicks on the first name film link
    Then film page is displayed
    When user clicks on the 'Favorites Films' button
    Then 'Favorites films' button is marked
    Examples:
      | actor             | country |
      | Robert Downey Jr. | USA     |
      | María Valverde    | Spain   |


  Scenario Outline: User search the actor and add them to the actore list
    Given user is on the home page
    When user fills 'Search' field with <actor> name
    And user clicks on 'Search' button
    Then the list of actors is displayed
    When user clicks on the 'Actor name' link
    Then user is redirected on the 'actor' page
    When user clicks on the 'Actors' list
    Then actor category is marked
    Examples:
      | actor         |
      | Jeremy Renner |
      | Hugh Laurie   |
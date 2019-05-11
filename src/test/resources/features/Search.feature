@UI @test
Feature: Test of searching functionality

  Scenario Outline: User is able to search movies using advanced filter
    Given home page is open
    When user clicks on 'Advanced Filter' button
    Then 'Advanced filter' page is displayed
    When user fills field with '<actor>' name
    And user select '<country>' country
    And user clicks on the 'Search' button
    Then the list of the films is displayed
#    When user clicks on the first name film link
#    Then film page is displayed
#    When user clicks on the 'Favorites Films' button
#    Then 'Favorites films' button is marked
    Examples:
      | actor             | country |
      | Robert Downey Jr. | 3       |
#      | María Valverde    | 15      |

#  Scenario Outline: User search the actor and add them to the actor list
#    Given home page is open
#    When user fills 'Search' field with <actor> name
#    And user clicks on 'Search' button
#    Then the list of actors is displayed
#    When user clicks on the 'Actor name' link
#    Then user is redirected on the 'actor' page
#    When user clicks on the 'Actors' list
#    Then actor category is marked
#    Examples:
#      | actor         |
#      | Jeremy Renner |
#      | Hugh Laurie   |
@functional
Feature: Add items in the lists

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'ariadnaciuvaga' username and 'abc12345' password

  @aciuvaga
  Scenario Outline: The new added movie is displayed in the 'will watch' folder
    Given home page is open
    And user searches for '<movieTitle>'
    And user clicks on 'Search' button
    And user clicks on the first link
    And user clicks on 'Will watch' button from movie page
    And user clicks on profile button
    When user clicks on 'Movies' button
    Then <movieTitle> film is displayed in the Will watch list
    And user deletes the film from 'Will watch' list
    Examples:
      | movieTitle |
      | Beast      |

  @acastravet
  Scenario: Add the random chosed movie to favourite list
    Given user accesses the random movie search feature
    And user chooses a period of years
    And user adds a country
    And user adds a genre
    Then user clicks on random movie search button
    Then movie is displayed
    And user clicks on the movie title
    And user clicks on favourite button
    Then the movie is added to favourite list

  @acastravet
  Scenario: Filter the weekend result table to display the most profitable movie and add it to watch later list
    Given user accesses the weekend results
    And user chosses to see the results in dollars
    And user filters table descendently for all profits
    Then user accesses the first listed movie
    And user clicks on watch later
    Then movie is added to watch later

  @ilevcenco
  Scenario Outline: User searches the actor and add them to the actor list
    Given home page is open
    When user searches for '<actor>'
    And user clicks on the 'HomeSearch' button
    Then the list of actors is displayed
    When user clicks on the first link
    Then user redirected on the '<actor>' page
    When user clicks on the 'Actors' folder
    Then folder 'Актёры' appears on the page
    Examples:
      | actor         |
      | Jeremy Renner |
      | Hugh Laurie   |
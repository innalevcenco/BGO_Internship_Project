Feature: Add list and movies in the lists

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password

  @test
  Scenario Outline: The new added trailer movie is displayed in the I will watch list
    Given home page is open
    When user searches for <Title>
    And user clicks on 'Search' button
    And user clicks on the first link
    And user clicks on 'Will watch' folder
    Then movie is saved in 'Will watch' folder
    When user clicks on profile button
    And user clicks on Movies button
    Then new added film is displayed in the Will watch list
    Examples:
      | Title |
      | Lost  |
#      | Beast |


  @test
  Scenario: Create new list with seen movies and add check mark for rated or viewed movies to be deleted
    Given home page is open
    When user clicks on 'Will watch' button
    And user clicks on 'create folder' button
    And user clicks on the created 'New folder'
    And user write the movie name The Intouchables
    And user chooses first movie field under search bar
    And user clicks on the check mark for adding movie in 'new folder' list
    And user clicks on the check mark for'automatically remove watched movies'
    And user clicks on 'Save' button
    Then all modifications are saved in 'New folder'



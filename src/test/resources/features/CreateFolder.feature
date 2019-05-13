@functional
Feature: Add items in the lists

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password

  @aciuvaga
  Scenario: Create folder and add movies in that by searching in the search field
    Given home page is open
    And user clicks on 'Will watch' button
    And user clicks on 'create folder' button
    And user clicks on the created 'New folder'
    And user write the movie name Intouchables
    And user chooses first movie field under search bar
    And user clicks on the checkbox for adding movie in 'new folder' list
    And user clicks on the checkbox for'automatically remove watched movies'
    When user clicks on 'Save' button
    Then the Intouchables movie is saved in the created folder
    And user clicks on 'Remove' folder button
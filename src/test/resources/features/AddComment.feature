@functional
Feature: Add comment to a news article

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password

#  @aciuvaga
#  Scenario:Comment on a news article
#    Given user accesses news page
#    And user clicks on a date from the calendar
#    And user accesses the first article
#    When article is displayed
#    Then user writes the comment "Текст:" textfield
#    And user clicks "отправить" button
#    Then the comment is added

#  @aciuvaga
#  Scenario: New comment is added to a specified movie
#    Given home page is open
#    When user clicks on 'Advanced Filter' button
#    And user clicks on 'country' field
#    And user select 'Russia' field
#    And user clicks on 'genre' field
#    And user chooses 'comedy' option
#    And user clicks on the checkbox
#    And user clicks on the 'Search' button
#    And user clicks on the first link
#    Then movie page is displayed
#    And user clicks on 'Note' button from displayed movie
#    And user fills 'Note' field
#    And user clicks on 'Save' note button
#    Then new note is displayed
#    When user clicks on 'Will watch' button
#    And user clicks on 'Note' folder
#    Then the new comment is displayed on the 'Note' folder
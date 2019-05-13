@test
Feature: Add comment to the movie

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password

#  @acastravet
#  Scenario:Comment on a news article
#    Given user accesses news page
#    And user clicks on a date from the calendar
#    And user accesses the first article
#    When article is displayed
#    Then user writes the comment "Текст:" textfield
#    And user clicks "отправить" button
#    Then the comment is added

  @aciuvaga
  Scenario Outline: New note is added to the movie
    Given home page is open
    And user clicks on 'Advanced Filter' button
    And user select '<country>' country
    And user clicks on 'genre' field
    And user chooses 'an option' from option field
    And user clicks on the checkbox
    And user clicks on the 'Search' button
    And user clicks on the first link
    And user clicks on 'Note' button
    And user fills 'Note' field with: <note>
    When user clicks on 'Save' note button
    Then <note> is added to the movie
    And user clicks on 'Remove' button
    Examples:
      | country | note                         |
      | Россия  | I will watch this film later |


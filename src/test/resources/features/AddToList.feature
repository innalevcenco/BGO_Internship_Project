Feature: Add list and movies in the lists

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password

  @test
  Scenario Outline: The new added trailer movie is displayed in the I will watch list
    Given home page is open
    When user searches for <title>
    And user clicks on the Search button
    Then movie details are displayed
    When user clicks on will watch button
    Then movie is saved in will watch list
    When user clicks on profile button
    And user clicks on Фильмы button
    Then new added film is displayed first in the Буду смотреть list
    Examples:
      | title |
      | Lost  |
      | Beast |
#
#  @test
#  Scenario: Create new list with seen movies and add check mark for rated or viewed movies to be deleted
#    Given home page is open
#    When user clicks on 'Буду смотреть' button on the top, at the right side
#    And user clicks on 'новая папка' field  and write the folder name 'the best movies'
#    Then the new folder is displayed
#    When user clicks on 'the best movies' folder
#    And user clicks on search field and searches for The Intouchables movie
#    And choose wanted movie
#    Then specified movie is displayed
#    When user checks the check mark for adding movie in 'the best movies' list
#    And user checks the check mark for'автоматически удалять из папки оцененные или просмотренные фильмы'
#    And user clicks on 'cохранить' button
#    Then all modifications are saved in 'the best movie' folder






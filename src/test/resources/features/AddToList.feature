Feature: Add list and movies in the lists

  Background:
    Given Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password

  @test
  Scenario Outline: The new added trailer movie is displayed in the I will watch list
    Given home page is open
    When user searches for <title> movie
    And user clicks on 'search' button
    Then search results are  displayed
    When user clicks on the first link 'movie'
    Then movie details are displayed
    When user clicks on 'heart' button for adding the movie in 'Буду смотреть' list
    Then movie is saved in 'Любимые фильмы' list
    When clicks on 'profile' button
    And clicks on 'Фильмы' button
    Then new added film is displayed first in the 'Любимые фильмы' list
    Examples:
      | title |
      | Lost  |
      | Beast |


  Scenario: Create new list with seen movies and add check mark for rated or viewed movies to be deleted
    Given home page is open
    When user clicks on 'Буду смотреть' button on the top, at the right side
    And user clicks on 'новая папка' field  and write the folder name 'the best movies'
    Then the new folder is displayed
    When user clicks on 'the best movies' folder
    And user clicks on search field and searches for The Intouchables movie
    And choose wanted movie
    Then specified movie is displayed
    When user checks the check mark for adding movie in 'the best movies' list
    And user checks the check mark for'автоматически удалять из папки оцененные или просмотренные фильмы'
    And user clicks on 'cохранить' button
    Then all modifications are saved in 'the best movie' folder






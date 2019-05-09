#@test
#Feature: Add comment to the movie
#
#  Background:
#    Given user is login on 'https://www.kinopoisk.ru/' with 'alexandrugrama' username and 'cablu21' password
#
#  Scenario: New comment is added to a specified movie
#    Given home page is open
#    When user clicks on 'Advanced filter' button
#    And user clicks on country field '+ страна:'
#    And user chooses 'CШA'
#    And user clicks on genre field '+ жанр:'
#    And user chooses 'комедия' and check 'комедия' mark
#    And user clicks on 'поиск' button
#    Then search results are  displayed
#    When user clicks on the chosen 'movie'
#    Then movie page is displayed
#    When user adds a comment to the movie filling 'Текст:' and 'Заголовок:' fields
#    And user clicks on review type field 'тип рецензии'
#    And user chooses positive field 'положительная'
#    And user clicks on submit button отправитъ'
#    Then the new changes are saved
#    When user clicks on 'profile' button on the top, at the right side
#    And user clicks on 'alexandrugrama' button
#    Then the new comment is displayed on the customer account
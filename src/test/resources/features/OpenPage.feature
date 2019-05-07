Feature: Web searching

  Background:
    Given the user logs in

  @test
  Scenario Outline: The new added trailer movie is displayed in the favorite list
    Given user searches for <title> movie
    And search results are  displayed
    When user adds last search film in favorite list
    Then new added film is displayed in the list
    Examples:
      | title |
      | Lost  |
#      | Beast |

  Scenario: New comment is added to a specified movie
    Given user searches for a film by filling all fields from Расширенный поиск
    And search results are displayed
    And  user opens movie details
    When user adds a comment to the movie
    Then the new comment is displayed on the customer account

  Scenario: Wrong payment details are not accepted
    Given user navigates to Aфиша
    And user navigates to График премъер
    And user chooses movie
      | name       | date   | time  |
      | Джон Уик 3 | May 20 | 18:50 |
    And user chooses a free random place
    And user opens payment details
    When user adds wrong card number and holder name
    Then the message <Сервис временно недоступен> is displayed






@functional
Feature: Test of searching functionality

  Background:
    Given user is login on 'https://www.kinopoisk.ru/' with 'ilevcenco' username and 'ILoveTesting' password

  @ilevcenco
  Scenario Outline: User is able to search movies using advanced filter
    Given home page is open
    When user clicks on 'Advanced Filter' button
    Then 'Advanced filter' page is displayed
    When user fills field with '<actor>' name
    And user select '<country>' country
    And user enters '<year>' year
    And user clicks on the 'Search' button
    Then the list of the films is displayed
    When user clicks on the first link
    Then user redirected on the '<country>' page
    Examples:
      | actor             | country | year |
      | Robert Downey Jr. | США     | 2008 |
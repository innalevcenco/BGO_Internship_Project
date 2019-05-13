$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddToList.feature");
formatter.feature({
  "line": 2,
  "name": "Add movies to lists",
  "description": "",
  "id": "add-movies-to-lists",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@functional"
    }
  ]
});
formatter.before({
  "duration": 7293314000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is login on \u0027https://www.kinopoisk.ru/\u0027 with \u0027alexandrugrama\u0027 username and \u0027cablu21\u0027 password",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.kinopoisk.ru/",
      "offset": 18
    },
    {
      "val": "alexandrugrama",
      "offset": 51
    },
    {
      "val": "cablu21",
      "offset": 81
    }
  ],
  "location": "LoginSteps.userLogin(String,String,String)"
});
formatter.result({
  "duration": 10099971900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add the random chosed movie to watch favourite list",
  "description": "",
  "id": "add-movies-to-lists;add-the-random-chosed-movie-to-watch-favourite-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@aciuvaga"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user accesses the random movie search feature",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user chooses a period of years",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user adds a country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user adds a genre",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on random movie search button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "movie is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on the movie title",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on favourite button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the movie is added to favourite list",
  "keyword": "Then "
});
formatter.match({
  "location": "RandomMovieSearchSteps.userAccessesTheRandomMovieSearchFeature()"
});
formatter.result({
  "duration": 7099829100,
  "status": "passed"
});
formatter.match({
  "location": "RandomMovieSearchSteps.userChoosesAPeriodOfYears()"
});
formatter.result({
  "duration": 294255300,
  "status": "passed"
});
formatter.match({
  "location": "RandomMovieSearchSteps.userAddsACountry()"
});
formatter.result({
  "duration": 253410100,
  "status": "passed"
});
formatter.match({
  "location": "RandomMovieSearchSteps.userAddsAGenre()"
});
formatter.result({
  "duration": 435619100,
  "status": "passed"
});
formatter.match({
  "location": "RandomMovieSearchSteps.userClicksOnTheSearchButton()"
});
formatter.result({
  "duration": 74081500,
  "status": "passed"
});
formatter.match({
  "location": "RandomMovieSearchSteps.movieIsDisplayed()"
});
formatter.result({
  "duration": 30387168500,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of all elements located by By.xpath: //*[@id\u003d\"page\"]/div[3]/div[3]/div/div[2]/div[1]/div[1]/a (tried for 30 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EN32088\u0027, ip: \u0027192.168.1.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\aciuvaga\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55142}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: daef0e0a5dd2d663b10dad21f0b68e1b\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:234)\r\n\tat pages.CommonActions.waitVisibility(CommonActions.java:32)\r\n\tat steps.RandomMovieSearchSteps.movieIsDisplayed(RandomMovieSearchSteps.java:57)\r\n\tat ✽.Then movie is displayed(AddToList.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RandomMovieSearchSteps.userClicksOnTheMovieTitle()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RandomMovieSearchSteps.userClicksOnWatchLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RandomMovieSearchSteps.theMovieIsAddedToWatchLaterList()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5577043500,
  "status": "passed"
});
formatter.before({
  "duration": 4648508800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is login on \u0027https://www.kinopoisk.ru/\u0027 with \u0027alexandrugrama\u0027 username and \u0027cablu21\u0027 password",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.kinopoisk.ru/",
      "offset": 18
    },
    {
      "val": "alexandrugrama",
      "offset": 51
    },
    {
      "val": "cablu21",
      "offset": 81
    }
  ],
  "location": "LoginSteps.userLogin(String,String,String)"
});
formatter.result({
  "duration": 12813768600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 19,
      "value": "#  @aciuvaga"
    },
    {
      "line": 20,
      "value": "#  Scenario Outline: The new added trailer movie is displayed in the \u0027will watch\u0027 folder"
    },
    {
      "line": 21,
      "value": "#    Given home page is open"
    },
    {
      "line": 22,
      "value": "#    When user searches for \u003cTitle\u003e"
    },
    {
      "line": 23,
      "value": "#    And user clicks on \u0027Search\u0027 button"
    },
    {
      "line": 24,
      "value": "#    And user clicks on the first link"
    },
    {
      "line": 25,
      "value": "#    And user clicks on \u0027Will watch\u0027 folder"
    },
    {
      "line": 26,
      "value": "#    Then movie is saved in \u0027Will watch\u0027 folder"
    },
    {
      "line": 27,
      "value": "#    When user clicks on profile button"
    },
    {
      "line": 28,
      "value": "#    And user clicks on Movies button"
    },
    {
      "line": 29,
      "value": "#    Then new added film is displayed in the Will watch list"
    },
    {
      "line": 30,
      "value": "#    Examples:"
    },
    {
      "line": 31,
      "value": "#      | Title |"
    },
    {
      "line": 32,
      "value": "#      | Lost  |"
    },
    {
      "line": 33,
      "value": "#      | Beast |"
    }
  ],
  "line": 36,
  "name": "Filter the weekend result table to display the most profitable movie and add it to watch later list",
  "description": "",
  "id": "add-movies-to-lists;filter-the-weekend-result-table-to-display-the-most-profitable-movie-and-add-it-to-watch-later-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@aciuvaga"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user accesses the weekend results",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "user chosses to see the results in dollars",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user filters table descendently for all profits",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user accesses the first listed movie",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user clicks on watch later",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "movie is added to watch later",
  "keyword": "Then "
});
formatter.match({
  "location": "WeekendResultsMovieChooseSteps.userAccessesTheWeekendResults()"
});
formatter.result({
  "duration": 7702818800,
  "status": "passed"
});
formatter.match({
  "location": "WeekendResultsMovieChooseSteps.userChoosesToSeeInDollars()"
});
formatter.result({
  "duration": 2405027700,
  "status": "passed"
});
formatter.match({
  "location": "WeekendResultsMovieChooseSteps.userFiltersTableDescendentlyForAllProfits()"
});
formatter.result({
  "duration": 2662464200,
  "status": "passed"
});
formatter.match({
  "location": "WeekendResultsMovieChooseSteps.userAccessesTheFirstListedMovie()"
});
formatter.result({
  "duration": 3307478700,
  "status": "passed"
});
formatter.match({
  "location": "WeekendResultsMovieChooseSteps.userClicksOnWatchLater()"
});
formatter.result({
  "duration": 191724000,
  "status": "passed"
});
formatter.match({
  "location": "WeekendResultsMovieChooseSteps.movieIsAddedToWatchLater()"
});
formatter.result({
  "duration": 7904401400,
  "status": "passed"
});
formatter.after({
  "duration": 6174294700,
  "status": "passed"
});
});
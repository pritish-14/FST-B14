@Activity1_1
Feature: First Test

  @SmokeTest
  Scenario: Opening the webpage using the selenium
    Given User is on the google home page
    When User types in cheese and hits enter
    Then Show how many search results displays
    And Close the browser


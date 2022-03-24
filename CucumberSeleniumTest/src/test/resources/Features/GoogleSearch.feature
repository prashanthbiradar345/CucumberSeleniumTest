Feature: feature to test google Search Functionality

  Scenario: Validate if google Search is working
    Given Browser is open
    And user is on google search Page
    When user enters a text in search box
    And hits enter
    Then user is navigated to the search results

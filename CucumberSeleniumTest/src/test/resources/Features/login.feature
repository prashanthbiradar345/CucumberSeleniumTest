#Author: PUB
#date
#description
Feature: Feature to test  login functionality

  Scenario: Check login Successful with valid credentials
  
    Given User  on a login page
    When User enters username and password
    And clicks on a login button
    Then user is navigated to the Home page
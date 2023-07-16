#Author
#Date
#Description 
@smokefeature
Feature: Check the login functionality
@smoketest
  Scenario: Check the login is successful with the valid credentials
    Given User is on login page
    When User enters username and password
    And Hit on login button
    Then User is navigated to the home page


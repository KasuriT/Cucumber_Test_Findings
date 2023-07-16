#Author
#Date
#Description
Feature: Test Login Functionality

  Scenario Outline: Verify that user can login with valid credentials
    Given Open the new Browser
    And User is on Web login page
    When Enter <username> and <password>
    And Hit Enter button
    Then User navigated to the home page

    Examples: 
      | username  | password |
      | Raghav    |    12345 |
      | Ele       |    12345 |
      

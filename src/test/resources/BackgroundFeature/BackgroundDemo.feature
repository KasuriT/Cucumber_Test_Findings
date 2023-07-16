Feature: Check homw page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Check logout link
    When User click on welcome link
    Then logout link is dispayed

  Scenario: Verify quick launch toolbar is present
    When User clicks on dashboard link
    Then quick launch toolbar is displayed

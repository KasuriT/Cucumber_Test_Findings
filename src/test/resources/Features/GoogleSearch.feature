Feature: Feature to test google search functionality

  Scenario: Validate whether google search is working
  
    Given Browser is open
    And User is on google search page
    When User enters text in search box
    And hit enter
    Then user is navigated to the search result

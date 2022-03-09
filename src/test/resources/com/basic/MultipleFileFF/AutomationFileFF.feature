Feature: Checking credentials on Automation site
  As user u need to enter credentials on this site

  Scenario: Enters credentials
    Given User need to be on automation webpage
    When User enters first name
    And User enters last name
    And Close opened automation page


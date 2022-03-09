@Important
Feature: Check credentials on Facebook with parameters

  @Smoke
  Scenario: Validating email field1
    Given User need to be on Facebook login page
    When User enter email "goliathus@gmail.com"
    Then Checks if email "goliathus@gmail.com" is correct
    And  Close opened browser

  @Smoke @Regression
  Scenario: Validate create user multiple fields2
    Given User need to be on Facebook login page
    When User enters user email "davidus@yahoo.com"
    And User enters password "hellokitty"
    Then User checks if email "davidus@yahoo.com" is present
    And User checks if password "hellokitty" is present
    And Close opened browser

  Scenario: Validate create user multiple fields3
    Given User need to be on Facebook login page
    When User enters user email "davidus@yahoo.com"
    And User enters password "hellokitty"
    Then User checks if email "davidus@yahoo.com" is present
    And User checks if password "hellokitty" is present
    And Close opened browser

  @Regression
  Scenario: Validate create user multiple fields4
    Given User need to be on Facebook login page
    When User enters user email "davidus@yahoo.com"
    And User enters password "hellokitty"
    Then User checks if email "davidus@yahoo.com" is present
    And User checks if password "hellokitty" is present
    And Close opened browser

  @Smoke
  Scenario: Validate create user multiple fields5
    Given User need to be on Facebook login page
    When User enters user email "davidus@yahoo.com"
    And User enters password "hellokitty"
    Then User checks if email "davidus@yahoo.com" is present
    And User checks if password "hellokitty" is present
    And Close opened browser
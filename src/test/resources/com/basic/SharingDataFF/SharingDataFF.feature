Feature: Check credentials on Facebook with parameters

  Background: Launching Facebooks login page
    Given User need to be on Facebook login page

  Scenario: Validating email field

    When User enter email "goliathus@gmail.com"
    Then Checks if email "goliathus@gmail.com" is correct

  Scenario: Validate create user multiple fields

    When User enters user email "davidus@yahoo.com"
    And User enters password "hellokitty"
    Then User checks if email "davidus@yahoo.com" is present
    And User checks if password "hellokitty" is present


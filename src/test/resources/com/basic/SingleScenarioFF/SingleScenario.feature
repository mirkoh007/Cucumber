Feature: Check credentials on Facebook

  Scenario: Validating email field
    Given User need to be on Facebooks login page
    When User enter email
    Then Checks if email is correct
    And Close browser
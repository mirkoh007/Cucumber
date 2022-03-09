Feature: Create account on Facebook and check credentials

  Scenario: Validating First name field
    Given User need to be on Facebook login page
    When User enters user email
    And User enters password
    Then  User checks if email is present
    And close browser


  Scenario: Validate create user multiple fields
    Given User need to be on Facebook login page
    When User enters user email
    And User enters password
    Then User checks if email is present
    And User checks if password is present
    And close browser

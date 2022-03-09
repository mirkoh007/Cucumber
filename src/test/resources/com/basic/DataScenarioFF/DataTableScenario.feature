Feature: Entering credentials from data table

  Background: User must be on Facebook


  Scenario: Validating email field
    Given User need to be on Facebook login page
    When User enter following data
      | email               | password       |  |
      | tomhanks@gmail.com  | davincicode    |  |
      | jackrayan@nsa.com   | operationblack |  |
      | miloscvarkov@gsp.rs | drzavniposo    |  |

    And  Close opened browser



 # Scenario: Validate create user multiple fields

  #  When User enters user email "davidus@yahoo.com"
   # And User enters password "hellokitty"
   # Then User checks if email "davidus@yahoo.com" is present
   # And User checks if password "hellokitty" is present
   # And Close opened browser

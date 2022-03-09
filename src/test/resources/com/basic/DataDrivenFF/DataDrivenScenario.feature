Feature: Entering credentials from data table

  Scenario Outline: Validating email field
    Given User need to be on Facebook login page
    When User enters email "<email>"
    And User enters password "<password>"
    Then User checks if email "<email>" is present
    And User checks if password "<password>" is present
    And  Close opened browser

    Examples: For credentials
      | email                        | password      |  |
      | tomhanks@gmai.com            | davincicode   |  |
      | milosobilic@yahoo.com        | murat         |  |
      | djuradjbrankovic@hotmail.com | musakesedjija |  |

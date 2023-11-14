Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "Jon5551156oe123"
    And I enter a valid Email address "ffd15g@example.com"
    And I enter a valid Password "joho4515353fgdgfdg67e@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page

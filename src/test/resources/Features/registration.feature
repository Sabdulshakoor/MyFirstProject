Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "Jon5D6v354356oe123"
    And I enter a valid Email address "jo5hn6654535oe@example.com"
    And I enter a valid Password "joho4535353567e@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page

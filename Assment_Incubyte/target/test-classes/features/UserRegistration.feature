 
Feature: User Registration
  To access the platform, users need to create an account.

  Scenario: Successful user registration
    Given I am on the Create New Customer Account page
    When I enter First Name, Last Name, Email, Password, and Confirm Password
    And I submit the sign-up form
    Then I should see a confirmation message
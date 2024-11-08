  
Feature: User Login
  After registering, users should be able to log in using their credentials.

  Scenario: Successful user login
    Given I am on the login page
    When I enter the newly created Email and Password
    And I submit the login form
    Then I should be logged into my account successfully
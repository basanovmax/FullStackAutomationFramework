Feature: Verify Login functionality

  Scenario: Verify user can login into the application
    Given user open website
    When user login with valid credentials username "login.username" and password "login.password"
    Then verify user is navigated to homepage


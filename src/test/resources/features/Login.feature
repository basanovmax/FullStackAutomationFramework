Feature: Verify Login functionality

  Scenario: Verify user can login into the application
    Given user open website
    When user enter the username "login.username" and password "login.password"
    Then verify user is navigated to homepage

  Scenario: Verify user can create new checking account
    Given user open website
    When user login with valid credentials username "login.username" and password "login.password"
    Then verify user is navigated to homepage
    When user click on checking tab
    And click on New Checking button
    Then verify new checking account page is displayed
    When user enters new checking account details
    And click on submit button on new checking account page
    Then verify view checking account page is displayed
    And verify account creation success message is displayed

  Scenario: Verify user can create new savings account
    Given user open website
    When user login with valid credentials username "login.username" and password "login.password"
    Then verify user is navigated to homepage
    When user click on savings tab
    And click on New Savings button
    Then verify new savings account page is displayed
    When user enters new savings account details
    And click on submit button on new savings account page
    Then verify view savings account page is displayed
    And verify account creation success message is displayed

  Scenario: Verify user can create deposit money to the account
    Given user open website
    When user login with valid credentials username "login.username" and password "login.password"
    Then verify user is navigated to homepage
    When user click on Deposit tab
    Then verify deposit into account page is displayed
    When user select account from the dropdown
    And enter the deposit amount
    And click on submit button on a deposit page
    Then verify view checking account page is displayed
    And verify deposit entry is displayed in the transaction history
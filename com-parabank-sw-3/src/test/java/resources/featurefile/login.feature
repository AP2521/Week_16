Feature: Login Fearture
  As a User want to check login functionality


  Scenario: User should login successfully with valid credentials
    Given User is on Home page
    When I enter username "anish362"
    And I enter password "ab133"
    And I click on login button
    And I should login successfully and see "Accounts Overview"
    And I click on logout button
    Then I should logout successfully and see "Customer Login"

  Scenario Outline: User should not login and verify error message
    Given User is on Home page
    When I enter username "<Username>"
    And I enter password "<Password>"
    And I click on login button
    Then I should see error message "<Error>"

    Examples:
      | Username | Password | Error  |
      | abc123   | 123      | The username and password could not be verified. |
      | abc124   | 123      | The username and password could not be verified. |
      | abc123   | 124      | The username and password could not be verified. |

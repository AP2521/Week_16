Feature: Register Fearture
  As a User want to check register functionality

  Scenario: User should register successfully
    Given User is on Homepage
    When I click on Registerbutton
    And I enter firstname "Anish"
    And I enter lastname "Patel"
    And I enter streetname in address "123phx"
    And I enter cityname in address "Phoenix"
    And I enter state in address "AZ"
    And I enter zipcode in address "85035"
    And I enter phonenumber "123456789"
    And I enter SSN "12345678"
    And I enter Username
    And I enter Password "ab133"
    And I enter ConfirmPassword "ab133"
    And I click on register button
    Then I verify account created text "Your account was created successfully. You are now logged in."

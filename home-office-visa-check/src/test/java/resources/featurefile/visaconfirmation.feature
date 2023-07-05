Feature: Visa Confirmation Fearture
  As a User want to check Visa Confirmation functionality


  Scenario: User should Visa Confirmation successfully
    Given User is on Home page
    When I click on Start Button
    And I select Nationality "Australia"
    And I click on continue button
    And I select reason for visit "Tourism or visiting family and friends"
    And I click on continue button
    Then I should get result and see "You will not need a visa to come to the UK"


  Scenario: User should Visa Confirmation successfully
    Given User is on Home page
    When I click on Start Button
    And I select Nationality "Chile"
    And I click on continue button
    And I select reason for visit "Work, academic visit or business"
    And I click on continue button
    And I select Duration of stay "longer than 6 months"
    And I click on continue button
    And I select Job type"Health and care professional"
    And I click on continue button
    Then I should get result and see "You need a visa to work in health and care"


  Scenario: User should Visa Confirmation successfully
    Given User is on Home page
    When I click on Start Button
    And I select Nationality "India"
    And I click on continue button
    And I select reason for visit "Join partner or family for a long stay"
    And I click on continue button
    And I select Immigration status "Yes"
    And I click on continue button
    Then I should get result and see "You’ll need a visa to join your family or partner in the UK"
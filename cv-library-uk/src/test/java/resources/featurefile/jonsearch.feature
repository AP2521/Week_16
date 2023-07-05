Feature: Job Search Fearture
  As a User want to check Job Search functionality

  @smoke
  Scenario: User should Search Job successfully
    Given User is on Job search page
    When I enter jobTitle "Tester"
    And I enter location "Harrow"
    And I select distance "5 miles"
    And I click on search more option
    And I enter minimum salary "30000"
    And I enter maximum salary "500000"
    And I select salary type "Per annum"
    And I select job type "Permanent"
    And I click on find job
    Then I should search job successfully and see "Permanent Tester jobs in Harrow"

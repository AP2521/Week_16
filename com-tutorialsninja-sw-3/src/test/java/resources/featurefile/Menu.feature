Feature: Select Menu Item Fearture
  As a User want to Select Menu Item functionality

  Scenario Outline: User should Select Menu Item successfully
    Given User is on Home page
    When I Select Menu Items "<Menu>"
    And I Select Show All Items "<Show All Items>"
    Then I verify menu item text "<Text>"

    Examples:
      | Menu                | Show All Items              | Text                |
      | Desktops            | Show AllDesktops            | Desktops            |
      | Laptops & Notebooks | Show AllLaptops & Notebooks | Laptops & Notebooks |
      | Components          | Show AllComponents          | Components          |

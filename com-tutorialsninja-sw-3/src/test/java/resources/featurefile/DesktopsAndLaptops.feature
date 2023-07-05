Feature: Check DeskTops and Laptops menu Fearture
  As a User want to Check DeskTops and Laptops functionality

  Scenario: User should be able Check Desktops functionality
    Given I am on HomePage
    When I click on menu item "Desktops"
    And I click Show all menu item button "Show AllDesktops"
    And I click on sort by order "Name (A - Z)"
    And I Select Product "HP LP3065"
    And I verify Product text "HP LP3065"
    And I select Delivery Date "2022-11-30"
    And I enter Quantity "1"
    And I click on Add to cart button
    And I click on Shopping Cart
    And I verify product text in Cart "HP LP3065"
    And I verify Delivery Date "Delivery Date:2022-11-30"
    And I verify modelno. "Product 21"
    And I click on currency change "£Pound Sterling"
    Then I verify Total Amount "£74.73"

  Scenario: User should be able Check Laptops and Notebooks functionality
    Given I am on HomePage
    When I click on menu item "Laptops & Notebooks"
    And I click Show all menu item button "Show AllLaptops & Notebooks"
    And I click on sort by order "Price (High > Low)"
    And I Select Product "MacBook"
    And  I verify Product text "MacBook"
    And I click on Add to cart button
    And I click on Shopping Cart
    And I verify product text in Cart "MacBook"
    And I verify modelno. "Product 16"
    And I Edit quantity "2"
    And I Update Quantity
    And I verify quantity update text
    And I click on currency change "£Pound Sterling"
    Then I verify Total Amount "£737.45"
Feature: Menu Management

  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" and price $20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add the second menu item
    Given I have a menu item with name "Cucumber Salad" and price 10
    When I add that menu item
    Then Menu Item with name "Cucumber Salad" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add the third menu item
    Given I have a menu item with name "Chicken sandwich" and price 10
    When I add that menu item
    Then Menu Item with name "Chicken sandwich" should be added
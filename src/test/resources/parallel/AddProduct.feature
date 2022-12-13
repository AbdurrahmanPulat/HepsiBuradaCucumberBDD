Feature: CartPage Feature


@Smoke

  Scenario: Add product to cart
    Given user is on Home Page
    Given user types "Laptop" in the search box
    When user click submit button
    And user selects product
    And user switch tab
    And user adds product to cart
    And user checks the cart
    Then user goes to cart
    And user confirms cart
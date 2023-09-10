Feature: Remove Products From Cart

  Scenario: testing Remove Products From Cart functionality
    Given Launch browser
    And Navigate to url http automationexercise.com
    When Verify that home page is visible successfully
    And Add products to cart
    And Verify that cart page is displayed
    Then Click X button corresponding to particular product
    And Verify that product is removed from the cart

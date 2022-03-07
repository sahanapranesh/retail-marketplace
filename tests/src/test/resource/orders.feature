Feature: Operations with respect to orders on the website

  Scenario: As an existing customer I must be able to place orders
    Given I am an existing customer
    When I add 10 units of "Cookies" to my shopping cart
    And place an order
    And make the payment
    Then the order status must be "ORDERED"
    And I must be given an estimated delivery date

  Scenario: As an existing customer I must be able to see the correct order status
    Given I am an existing customer
    When I add 17 units of "Chocolates" to my shopping cart
    And place an order
    And the payment fails
    Then the order status must be "PAYMENT_PENDING"

  Scenario: As an existing customer I must be able to remove items from the cart
    Given I am an existing customer
    When I add 17 units of "Chocolates" to my shopping cart
    And I remove 10 units of "Chocolates" from my shopping cart
    And place an order
    Then the order status must be "ORDERED"
    And the quantity of items ordered should be 7
    And I must be given an estimated delivery date

  Scenario: As an existing customer I must be able to cancel my order
    Given I am an existing customer
    When I add 17 units of "Chocolates" to my shopping cart
    And place an order
    And make the payment
    And I cancel the order
    Then the order status must be "CANCELLED"
    And I should receive a refund of the order amount

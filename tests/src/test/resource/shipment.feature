Feature: Operations related to shipments

  Scenario: As a customer I should be able to receive an order from the storefront
    Given I am a customer
    When I place an order
    And I select the "New shop" storefront to pick up my order
    Then I should be able to receive the order at the store

  Scenario: As a customer I should be able to receive an order at my address
    Given I am a customer
    When I place an order
    And select my "home" address for delivery
    Then the order should be delivered at my preferred address

  Scenario: As a customer I should be able to receive an order over email
    Given I am a customer
    When I place an order
    And choose to receive the order over my email address
    Then the order should be delivered successfully

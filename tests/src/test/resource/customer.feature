Feature: Add a new customer

  Scenario: A customer should be able to sign up
    Given I am a new customer
    When I enter my username as "test45" and password as "password"
    When I enter my firstname as "Sahana" and lastname as "Pranesh"
    And I enter my first line of address as "No 10" and second line as "Malleswaram"
    And I enter my country as "India" and postcode as "560003"
    And I enter my payments mode as "Card" and number as 767676767
    Then I must be allowed to use the platform

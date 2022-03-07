Feature: Operations available for an admin user

  Scenario: As an admin user I must be able to add a storefront
    Given I am an admin user
    When I login to the platform
    And add a new storefront with the name "Pickup store"
    And the first line of address as "No 189, 10th cross"
    And the second line of address as "Sanjaynagar"
    And the postcode as "560009"
    And the country as "India"
    Then the storefront must be added successfully

    Scenario: As an admin user I must be able to register a delivery agent
      Given I am an admin user
      When I login to the platform
      And add a new delivery partner with name as "Sahana"
      And email as "sahana.78@klkk.com"
      And phone number as "9007767559"
      Then the delivery partner must be registered

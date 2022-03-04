Feature: Build a catalog

  Scenario Outline: As an admin user I should be able to add a product category
    Given As an admin user
    When I add a <category>
    Then the category must be added
    Examples:
      | category     |
      | "Food"       |
      | "Stationery" |

  Scenario Outline: As an admin user I should be able to add a product to the catalog
    Given As an admin user
    When I add <quantity> quantities of <product> costing <cost> to the <category>
    Then the product must be added
    Examples:
      | quantity | product   | cost   | category |
      | 3        | "Cookies" | "10.0" | "Food"   |

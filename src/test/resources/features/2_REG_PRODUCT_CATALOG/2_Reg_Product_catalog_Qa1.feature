@product_catalog
Feature: product_catalog_Test_cases
  I want to use this template for my feature file

  Background: Navigate to the website
    Given Navigate to the "<website name>" e-commerce website.

  @Tc_04 @Validate_View_static_top_menu
  Scenario Outline: 04_Validate View static top menu
    Given Navigate to the "<website name>" e-commerce website.
    And Click the link and its ccessible and clickable
    When Upon clicking on the link it should redirect the user to the registration web page.
    And The static top menu is visible and accessible in every page  "Your Store"  Website.
    And Locate and click on the "catagories" option in the static top menu.
    Then Upon clicking the static top menu its responsive and usable on desktop and mobile devices.
    And Confirm the "<Menu option>" page loads successfully.

    Examples: 
      | Website Name | Menu Option |
      | Your Store   | Desktop     |
      | Quaafox.com  | cameras     |

  @Tc_05 @Validate_Access_product_catalog
  Scenario: 05_Validate Access product catalog
    And The "product catalog" option is visible and labeled correctly.
    When Click on the product catalog option in the static top menu.
    And Confirm the product catalog page loads successfully.
    And Confirm the “product catalog”  button and navigate users to the product catalog page directly.

  @Tc_06 @Validate_Browse_through_product_catalog
  Scenario Outline: 06_Validate Access Browse through product catalog
    When The user is on the homepage
    And The user clicks on the product catalog option in the static top menu
    And The product catalog displays all available products on the website
    And Each product includes accurate details such as "<name>", "<price>", and "<description>"
    And The catalog is organized with appropriate categories
    And The user verifies that filters are available and functional
    And Clicking on a category displays only the relevant products
    And Applying a filter displays only the products matching the selected criteria
    And The user navigates back and forth between categories, filters, and search results
    Then The navigation should be smooth without errors or glitches

    Examples: 
      | name            | price   | description                               |
      | iPod Nano       | $122.00 | Its the small iPod with one very big idea: video. |
      | MacBook         | $602.00 | Intel Core 2 Duo processor                |
      | iPod Nano       | $122.00 | Video in your pocket.                     |

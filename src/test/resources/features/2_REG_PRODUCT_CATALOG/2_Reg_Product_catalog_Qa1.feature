
@product_catalog
Feature: product_catalog_Test_cases
  I want to use this template for my feature file
  

  @Tc_04   @Validate_View_static_top_menu 
  Scenario Outline:04_Validate View static top menu "
    Given Navigate to the "<website name>" e-commerce website.
    And Click the link and its ccessible and clickable
    When Upon clicking on the link it should redirect the user to the registration web page.
    And The static top menu is visible and accessible in every page  "Your Store"  Website. 
    And Locate and click on the "Product Catalog" option in the static top menu.
    Then Upon clicking the static top menu its responsive and usable on desktop and mobile devices.
    And Confirm the "<Menu option>" page loads successfully.
    
  Examples:
   | Website Name  | Menu Option      |
   | Your Store    | Product Catalog  |

 
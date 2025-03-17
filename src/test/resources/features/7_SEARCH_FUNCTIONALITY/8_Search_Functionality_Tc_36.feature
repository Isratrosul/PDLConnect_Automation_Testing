@Search_Functionality
Feature: Search_Functionality_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_36 @Validate_"Sorting_the_search_results_by_name,_price_or_rating"
  Scenario: Validate Sorting the search results by name, price or rating
    Given Perform a search using either keyword or category search to generate a results page
    When Locate the Sort By drop-down menu on the search results page
    Then Verify that the Sort By menu is visible
    Then Click the drop-down and check for available sorting options Name (A-Z)
    And Click the drop-down and check for available sorting options Name (Z-A)
    And Click the drop-down and check for available sorting options Price (Low-High)
    And Click the drop-down and check for available sorting options Price (High-Low)
    And Click the drop-down and check for available sorting options Rating (Highest)
    And Select a sorting option Price (Low-High) from the drop-down
    
    Then Verify that the search results are updated accordingly
    Then Confirm that the products are now sorted in ascending order by price
    Then Repeat for other sorting options to ensure each one sorts the results correctly
    Then Ensure that during and after sorting, each product listing still displays an image, name, and price
    

    Examples: 
      | Name | Price | Rating |
      |      |       |        |
      |      |       |        |

@SearchFunctionality
Feature: Search Functionality Test Cases
  I want to verify the search functionality on the website.

Background: Navigate to the Website
    Given Navigate to the website’s home page

  @TC_34 @Validate_Search_Functionality
  Scenario: Verify Search Functionality Works Correctly
    Then Locate the search box.
    When Enter the text string "laptop" in the search box.
    Then Verify that the search box accepts the text input.
    When Enter a text string with leading and trailing spaces.
    And Click the search button.
    Then Confirm that clicking the search button initiates a search.
    And Upon clicking, the search results page loads.
    Then Confirm that the search results display relevant products containing "Laptop".
    
     @TC_35 @Validate_Search_With_Category_Filter
  Scenario: Verify Search Functionality with Category Selection
    Then Locate the drop-down menu for product categories.
    And Confirm that the drop-down menu is visible and clickable.
    When Click the drop-down menu and ensure that all available categories are displayed.
    Then Select the "Laptops & Notebooks" category.
    And Enter the keyword "laptop" in the search box.
    When Click the search button.
    Then Confirm that the search results display products that are both relevant to "laptop" and belong to the "Laptops & Notebooks" category.
    
    
    
    
    
    
    
    

@Static_Header
Feature: Static_Header_Test_cases
  I want to use this template for my feature file

  Background: 
    Given Navigate to registration "static header"  "URL" link .

  @Tc_07 @Validate_Static_Header_Visibility
  Scenario: 07_validate Static Header Visibility
    And Scroll down the page to check if the static header remains visible at the top.
    When Ensure that the header is present on the homepage and other pages.
    And Check that the header does not disappear when scrolling down the page.

  @Tc_08 @Validate_Switching_Currency
  Scenario Outline: 08_validate Static Header switching currencys
    And I locate the currency selector dropdown in the header or relevant section
    When I click on the currency dropdown to view available options
    Then I select a different "<Currency>"
    And I ensure product prices are updated to reflect the selected currency
    Then I check if the page reloads or updates the content without errors after selecting the currency

    Examples: 
      | Currency       |
      | Us Dollar      |
      | Pound Sterling |
      | Euro           |
      | JPY            |

  @Tc_09 @Validate_Contacts_Are_Accessible
  Scenario Outline: 09_validate Contacts Are Accessible
    And I locate the Contact option in the header or footer.
    When I click on the Contact option.
    Then I ensure that the "<Contact Option>" page displays the required "<Field>":
    And I check if the contact form (if present) is functional.
    Then I ensure the page is accessible on different "<Devices>":

    Examples: 
      | Field        | Contact Option | Devices |
      | Phone number | Contact        | Desktop |
      | Email        | Contact form   | Mobile  |
      | Enquiry      | Contact Us     | Tablet  |
      |              | Help Center    | Desktop |

  @Tc_10 @Validate_Viewing_My_Account
  Scenario Outline: 10_Validate Viewing My Account
    And I Log in with "<valid credentials>"
    When I Locate and click on "My Account"
    Then I ensure the "My Account" page displays correct user details
    And I check if the "Edit Profile" option is available

    Examples: 
      | email               | password   |
      | teamaqa35@gmail.com | teamA1234@ |

  @Tc_11 @validate_Managing_My_Wishlist
  Scenario Outline: 11_validate  Managing My Wishlist
    And I navigate to the managing My Wishlist URL
    When I log in to the account with "<Email>" and "<Password>"
    Then I click on "My Wishlist"
    And I add "<Item>" to the wishlist
    Then I remove "<Item>" from the wishlist
    When I verify item count updates

    Examples: 
      | Email               | Password   | Item       |
      | teamaqa35@gmail.com | teamA1234@ | iMac       |
      |                     |            | Nikon D300 |
 
  @Tc_12 @Validate_Accessing_My_Shopping_Cart
  Scenario: 12_validate Accessing My Shopping Cart
    And I Log in to the account.
    When I Click on the "Shopping Cart" icon.
    Then Verify items are displayed in the cart
    And Ensure the cart icon reflects the correct item count.
    Then I  Check that the user can proceed to checkout from the cart page.

  @Tc_13 @Validate_Check_out_option
  Scenario: 13_validate Check out option
    And  I Log in to the account with user information
    When I Click on  "Shopping Cart" icon
    Then I Click on the "Proceed to Checkout" button
    And I Ensure that the checkout page displays billing and shipping options
    Then I Check if the user can enter billing and shipping information
    And I Verify the "Complete Purchase" button is visible and functional

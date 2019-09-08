Feature: Shopping cart end to end test.
Description: Purpose of this feature is to test end to end integration.

Scenario: Customer places an successful order.


Given user is on the shopping portal
When user selects the product
And  user add the product to cart
And  user clicks the proceed checkout button
And  user selects the new product
And  user adds other product to cart
Then user proceeds with checkout action
Then user proceeds from summary page 
Then User logs into the application with valid credentials
Then user performs checkout operation from address page
Then user accepts the terms AND performs checkout from shipping page
Then user selects the payment method
Then user confirms the order from payment page
Then validate the order confirmation.
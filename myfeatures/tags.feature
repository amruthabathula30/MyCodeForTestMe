Feature: Understanding of tags
@Smoke @Sanity
Scenario: Login validation on flipkart
Given User launched the flipkart page
Then Provided the valid credentials
@Regression
Scenario: User access to items in the portal
Given user searching the prod with code
Then user able to add it to cart
@Smoke
Scenario: User access to remove the cart
Given user able to see the items count on cart
Then user decides to remove an item
@Sanity
Scenario: User wanted to track the order
Given user has active order
Then user verifies the status of the order 

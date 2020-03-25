Feature: DemoWebShop
In order to Buy Products
As a E-commerce Customer
i want to acess the Application
Background:
Given  I have a browser with demowebshop application

Scenario: Selecting a category
When I click on electronis 
And  clcik on cell phones
Then application has to redirect to page with title as 'Demo Web Shop. Cell phones'

Scenario:  selecting product
When  I click on electronis 
And  clcik on cell phones 
And I click on product
Then application has to redirect to page with title  'Demo Web Shop. Smartphone' 

Scenario: adding to wishlist
When   I click on electronis 
And  clcik on cell phones 
And I click on product
And I add a product to the wishlist
 Then  the product must be visible in the wishlist

Scenario: adding to cart
When   I click on electronis 
And  clcik on cell phones 
And I click on product
And I add a product to the cart
 Then  the product must be visible in the cart

 Scenario: view added item and checkout 
When   I click on electronis 
And  clcik on cell phones 
And I click on product
And I add a product to the cart
And click on shopping cart
#Then  app has to redirect to page with title ass 'Demo Web Shop. Shopping Cart' 
Then chechout is clicked
 
 Scenario: Checkout
 When   I click on electronis 
And  clcik on cell phones 
And I click on product
And I add a product to the cart
And click on shopping cart
And chechout is clicked
 And I enter <emailaddress> as 'mouniechinta67@gmail.com' and password  as 'mounica'
Then I  must able to checkout the product that i added in the wishlisted
 
 
# Scenario: To get Details of the order
#When I order  anything
#Then I can be able to get details of the order
 
# Scenario: signingup for newsletter
# When I click on Sign up for our newsletter and enter my <emailaddress> as 'mouniechinta67@gmail.com'
# Then click on subscribe  I must  able to reccive a message as thankyou for signingup
# 
# Scenario: Submitting community poll
# When  I slect the option as 'excellent'
#Then the vote must be validated I must be able to see the votes for all options

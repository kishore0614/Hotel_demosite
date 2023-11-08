Feature: Hotal Booking Automated

Scenario: User Login into Application
Given User Launch the url
When User Enter the Username
And User Enter the Password  
And User Click the Login
Then Next page shown (Page02)


Scenario: User Search Hotel

When User enter Location
And User enter Select Hotal Type
And User enter Room type
And User Click Search 
Then Next Page Shown (Page03)


Scenario: User Select the Hotal

When User click the Checkbox
And User click the Continue
Then Next Page Shown (Page04)


Scenario: User Book Hotel

When User Enter the Firstname
And User enter Lastname
And User enter Address
And User enter Credit Card Number
And User Select Credit Card Type
And User enter Expiry month
And User enter Expiry year
And User enter CVV Number
And User Click Booknow

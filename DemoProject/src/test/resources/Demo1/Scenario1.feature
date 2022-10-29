Feature: Facebook login
As a FB user , I want to enter uername & password

Scenario: Verify Gmail login
Given navigate to gmail page
When user logged in using username as "arg1" and password as "arg2"
Then render home page


Scenario: Check FB login
Given navigate to FB page and clicked on homepage
When user should check account
Then closed browser
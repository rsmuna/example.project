Feature: Facebook sign up
In order to verify search
as a uger 
i want to Facebook sign up 

@fbsignup_happypath


Scenario Outline:

Given user visits facebook url
When user will enter "<First name>" and"<Last name>" and valid "<email address>" and "<new password>"
Then user will be select dropdown Month and dropdown Day and dropdown Year


Examples:
|First name| Last name| email address   |new password|
|Amy       | Bari     |esdy@gmail.com   |class@2020  |
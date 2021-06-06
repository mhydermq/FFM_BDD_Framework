Feature: FFM OT member should be able to login through valid credentials to the FFM platform

Scenario Outline: FFM OT member should login

Given I should be able to view the login panel
When I should be able to give "<email>" and "<password>"
And I should be able to click on the login button
Then I should be able to view the FFM platform

#Test data
Examples:
|email              |password|
|test@mail.com      |123456  |
|something@email.com|123456  |
|ytr@mail.com       |123456  |
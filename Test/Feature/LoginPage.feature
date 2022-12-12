Feature: Login page validation

Background:
Given user is on amazon page

Scenario Outline: Login functionality validation
Given user is on login page
When user enter "<username>" and "<password>"
And user clicks on login button
Then user verify the successful login

Examples:
|username|password|
|ganeshpriyan02@gmail.com|123456|
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Verifying the Home Page of FreeCRM

Background: 
Given: User is logged in
And: Use is in Home page


Scenario: Verify user can navigate to the Contact page

When: User clicks Contact Option 
Then: Verify user navigated to Contact page 
And: Verify Contact Header is Displayed

Scenario: Verify user can navigate to the Calendar page


When: User clicks Calendar Option 
Then: Verify user navigated to Calendar page







 
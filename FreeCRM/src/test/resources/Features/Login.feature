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
@tag
Feature: Login feature

  Background: 
    Given The application is launched
    When User clicks the Login button

  Scenario: Verify Login page in  Free CRM
    Then Verify the Login page have all fields

  Scenario Outline: Login to the CRM app using credentials
    When User enters the <Userid> and <password>
    And User clicks the Login button
    Then Verify user is navigated to the Home page

    Examples: 
      | Userid              | password |
      | k.viji.91@gmail.com | V!j!@1#2 |
      | k.viji.91@gmail.com | V!j!@1#2 |
      | k.viji.91@gmail.com | V!j!@1#2 |

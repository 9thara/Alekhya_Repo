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
Feature: Verifying Contact Page

  @tag1
  Scenario Outline: Verify USer navigates to the contact page
    Given The application is launched
    And User navigates to the Login page
    When User enters the <userid> and <password>
    And User clicks the Login button
    Then Verify user is navigated to the Home page
    When User clicks the Contact button
    Then User navigates to the Contact page

    Examples: 
      | userid              | password |
      | k.viji.91@gmail.com | V!j!@1#2 |

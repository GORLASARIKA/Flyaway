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
Feature: Title of your feature
  I want to use this template for my feature file

    @tag1
    Scenario: User opens Application
    Given user has opened chrome browser 
    Then user has opened application page
   @tag1
    Scenario: User can register
    Given user opens register page
    Then user provides details to register
  @tag1
    Scenario: User opens login page
    Given user clicks on login 
    When user provide name and password
    Then user logs in
   @tag1
    Scenario: User books the tickets
    Given user opens a home page 
    When user selects the source and destination 
    And user submit the details
    And user books the flight
    Then user makes the paymet
  @tag1
    Scenario: User can view bookings
    Given user views the bookings
    Then user logout from application
  
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

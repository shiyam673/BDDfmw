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
Feature: Searchbox



  @smoke
  Scenario Outline: Verify Searchbox is Working fine in homepage.
    Given User navigate to the homepage
    When User Pass inputs<search> to the search field
      | search      | decor       | homefurnish |
      
     Then Verify it takes to the corresponding search results page.
    And Verify user can able to pass pincode <pincode>

    Examples: 
    
      | pincode   |
      |  600044   |
      |  600017   |

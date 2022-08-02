# Language: en

  Feature: Login operations
    Scenario: Login to the web
      Given that "user" has opened the web site
      When he fills the login form
      Then he should access to his account
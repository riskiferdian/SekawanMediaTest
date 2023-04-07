@Test
  Feature: login feature
    Scenario: login with valid username and password
      Given User already open APS website
      When Input username "candidat"
      And Input password "password123"
      And Click login button
      Then User already logged in
@Test
  Feature: import data
    @ImportData
    Scenario:
      Given User already open APS website
      When Input username "candidat"
      And Input password "password123"
      And Click login button
      Then User already logged in
      When User click pemilih tetap button
      And Click dropdown button
      And Click import excel
      And Input file import
      Then Click upload button
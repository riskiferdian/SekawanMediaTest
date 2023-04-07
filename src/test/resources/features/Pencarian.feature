@Test
  Feature: pencarian
    @Pencarian
    Scenario: pencarian dengan nama
      Given User already open APS website
      When Input username "candidat"
      And Input password "password123"
      And Click login button
      Then User already logged in
      When User click pemilih tetap button
      And Input nama "Gina" on search field and click enter
      Then System show nama should be "Gina"
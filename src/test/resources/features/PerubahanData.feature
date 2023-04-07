@Test
  Feature: perubahan data
    @PerubahanData
    Scenario: ubah data nama dan alamat menggunakan random string
      Given User already open APS website
      When Input username "candidat"
      And Input password "password123"
      And Click login button
      Then User already logged in
      When User click pemilih tetap button
      And Click edit button
      And Update nama with add a random string
      And Update alamat with add a random string
      And Click simpan button

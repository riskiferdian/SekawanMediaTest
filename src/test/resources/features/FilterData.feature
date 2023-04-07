@Test
  Feature: filter data
    @FilterData
    Scenario Outline: fungsional filter data
      Given User already open APS website
      When Input username "candidat"
      And Input password "password123"
      And Click login button
      Then User already logged in
      When User click pemilih tetap button
      And Click filter data button
      Then Verify pop up filter data
      And Click provinsi
      And Input nama provinsi "<provinsi>"
      And Click kota atau kabupaten
      And Input nama kota atau kabupaten "<kota>"
      And Click kecamatan
      And Input nama kecamatan "<kecamatan>"
      And Click nama kelurahan
      And Input nama kelurahan "<kelurahan>"
      And Click nama TPS
      And Input nama TPS "<tps>"
      And Click apply button
      Then Verify filtered data tps "<verify tps>"

    Examples:
      | provinsi | kota          | kecamatan | kelurahan  | tps  | verify tps |
      | Bengkulu | Rejang Lebong | Curup     | Jalan Baru | Baru | Baru       |
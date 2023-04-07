@Test
  Feature: penambahan
    @Penambahan
    Scenario: Penambahan data pemilih
      Given User already open APS website
      When Input username "candidat"
      And Input password "password123"
      And Click login button
      Then User already logged in
      When User click pemilih tetap button
      And Click tambah button
      And Input no KK "2508182706889991"
      And Input NIK "2508182705889996"
      And Input nama "Riski Ferdian"
      And Input alamat "jalan merdeka 45"
      And Input RT "04"
      And Input RW "18"
      And Click kelurahan
      And Input kelurahan name "Dusun Curup"
      And Input tempat lahir "Jember"
      And Input tanggal lahir "16041998"
      And Input jenis kelamin
      And Click status perkawinan
      And Input status perkawinan "P"
      And Click caleg
      And Input caleg "Dummy"
      And Click TPS
      And Input TPS "Testing 3 TPS"
      And Choose status
      Then Click simpan button
@medunna
  Feature:Medunna Login
    @admin
    Scenario: Medunna Admin Girisi
      Given admin "medunnaUrl" anasayfasinda
      Then admin profil sembolune tiklar
      Then admin singIn sekmesi tiklar
      Then user gecerli "adminUsername" ve "adminPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @staff
    Scenario: Medunna Staff Girisi
      Given staff "medunnaUrl" anasayfasinda
      Then staff profil sembolune tiklar
      Then staff singIn sekmesi tiklar
      Then user gecerli "PersonelUsername" ve "PersonelPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @doktor
    Scenario: Medunna Doktor Girisi
      Given doktor "medunnaUrl" anasayfasinda
      Then doktor profil sembolune tiklar
      Then doktor singIn sekmesi tiklar
      Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @patient
    Scenario: Medunna Patient Girisi
      Given patient "medunnaUrl" anasayfasinda
      Then patient profil sembolune tiklar
      Then patient singIn sekmesi tiklar
      Then user gecerli "HastaUsername" ve "HastaPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @user
    Scenario: Medunna User Girisi
      Given user "medunnaUrl" anasayfasinda
      Then user user sembolune tiklar
      Then user singIn sekmesi tiklar
      Then user gecerli "newUsername" ve "newUserPassword" ile giris yapar
      Then user sing in butonuna tiklar






@medunna
  Feature:Medunna Login
    @admin
    Scenario: Medunna Admin Girisi
      Given user "medunnaUrl" anasayfasinda
      Then profil sembolune tiklar
      Then singIn sekmesi tiklar
      Then user gecerli "adminUsername" ve "adminPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @staff
    Scenario: Medunna Staff Girisi
      Given user "medunnaUrl" anasayfasinda
      Then profil sembolune tiklar
      Then singIn sekmesi tiklar
      Then user gecerli "PersonelUsername" ve "PersonelPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @doktor
    Scenario: Medunna Doktor Girisi
      Given user "medunnaUrl" anasayfasinda
      Then profil sembolune tiklar
      Then singIn sekmesi tiklar
      Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @patient
    Scenario: Medunna Patient Girisi
      Given user "medunnaUrl" anasayfasinda
      Then profil sembolune tiklar
      Then singIn sekmesi tiklar
      Then user gecerli "HastaUsername" ve "HastaPassword" ile giris yapar
      Then user sing in butonuna tiklar

    @user
    Scenario: Medunna User Girisi
      Given user "medunnaUrl" anasayfasinda
      Then user user sembolune tiklar
      Then user singIn sekmesi tiklar
      Then user gecerli "newUsername" ve "newUserPassword" ile giris yapar
      Then user sing in butonuna tiklar






Feature: US011 My Appointments Doktor tarafindan duzenlenebilmeli

  @us011
  Scenario: TC001 Doktor Create or Edit an Appointment sayfasina ulasabilmeli

    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "160942" id nolu hastasinin Edit buttonuna tiklar
    And Doktor Create or Edit an Appointment sayfasinin acildigini test eder
    And Doktor Sayfayi kapatir

  Scenario: TC002 Doktor güncellenen hastanın bilgilerini görebilmeli

    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then Doktor Guncellenen "160536" hastasinin ID, Start DateTime, End DateTime, Status, Physician, Patient gurundugunu dogrular
    And Doktor Sayfayi kapatir

  Scenario: TC003 Doktor  Anamnesis, Treatment ve Diagnosis alanlarını doldurması zorunludur

    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "160944" id nolu hastasinin Edit buttonuna tiklar
    And Doktor Anamnesis, Treatment, Diagnosis'e veri girildigini dogrular
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.
    And Doktor Sayfayi kapatir


  Scenario: TC004 Prescription ve Description bos birakilabilmeli
    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "160942" id nolu hastasinin Edit buttonuna tiklar
    Then Doktor Prescription, Description veri girilmedigini dogrular
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.
    And Doktor Sayfayi kapatir

  Scenario: TC005 Prescription ve Description doldurulabilmeli
    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "160942" id nolu hastasinin Edit buttonuna tiklar
    Then Doktor Prescription, Description veri girisi yapildigini dogrular
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.
    And Doktor Sayfayi kapatir

  Scenario Outline: TC006 Status doktor tarafindan PENDING, COMPLETED veya CANCELLED olarak secilebilmeli
    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    Then Doktor Status'a "<istenenDurum>" secebildigini test eder
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.
    And Doktor Sayfayi kapatir

    Examples:
      | istenenDurum |
      | PENDING      |
      | COMPLETED    |
      | CANCELLED    |

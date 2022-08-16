Feature: US011 My Appointments Doktor tarafindan duzenlenebilmeli

  @us011
  Scenario: TC001 Doktor Create or Edit an Appointment sayfasina ulasabilmeli

    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    And Doktor Create or Edit an Appointment sayfasinin acildigini test eder

  Scenario: TC002 Doktor güncellenen hastanın bilgilerini görebilmeli

    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then Doktor Guncellenen "175894" hastasinin ID, Start DateTime, End DateTime, Status, Physician, Patient gurundugunu dogrular

  Scenario: TC003 Doktor  Anamnesis, Treatment ve Diagnosis alanlarını doldurması zorunludur

    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    And Doktor Anamnesis, Treatment, Diagnosis'e veri girildigini dogrular
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.


  Scenario: TC004 Prescription ve Description bos birakilabilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    Then Doktor Prescription, Description veri girilmedigini dogrular
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.

  Scenario: TC005 Prescription ve Description doldurulabilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    Then Doktor Prescription, Description veri girisi yapildigini dogrular
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.

  Scenario Outline: TC006 Status doktor tarafindan PENDING, COMPLETED veya CANCELLED olarak secilebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then Doktor My Pages menusunden My Appointments butonunu tiklar
    Then  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    Then Doktor Status'a "<istenenDurum>" secebildigini test eder
    And Doktor Save buttonuna tiklar
    And Doktor kayit yapildigini test eder.

    Examples:
      | istenenDurum |
      | PENDING      |
      | COMPLETED    |
      | CANCELLED    |

@us12
Feature: US012 Doktor test isteyebilmeli

  Scenario: TC001 Doktor test isteyebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    And Doktor My Pages menusunden My Appointments butonunu tiklar
    And  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    When Doktor Request A Test buttonuna tiklar
    And Doktor "Potassium" tik atar
    And Doktor Save buttonuna tiklar
    Then Doktor Test kaydinin yapildigini test eder.

  Scenario: TC002 Test Items Sayfasinda "Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin" secenekleri olmali

    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    And Doktor My Pages menusunden My Appointments butonunu tiklar
    And  Doktor "175894" id nolu hastasinin Edit buttonuna tiklar
    When Doktor Request A Test buttonuna tiklar
    And Doktor Test Items Sayfasinda Glucose , Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin oldugunu dogrular
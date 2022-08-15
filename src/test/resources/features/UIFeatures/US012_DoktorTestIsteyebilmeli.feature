@us12
Feature: US012 Doktor test isteyebilmeli

  Scenario: TC001 Doktor test isteyebilmeli
    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    And Doktor My Pages menusunden My Appointments butonunu tiklar
    And  Doktor "160942" id nolu hastasinin Edit buttonuna tiklar
    When Doktor Request A Test buttonuna tiklar
    And Doktor "Potassium" tik atar
    And Doktor Save buttonuna tiklar
    Then Doktor Test kaydinin yapildigini test eder.
    And Doktor Sayfayi kapatir

  Scenario: TC002 Test Items Sayfasinda "Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin" secenekleri olmali

    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    And doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    And Doktor My Pages menusunden My Appointments butonunu tiklar
    And  Doktor "160942" id nolu hastasinin Edit buttonuna tiklar
    When Doktor Request A Test buttonuna tiklar
    And Doktor Test Items Sayfasinda Glucose , Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin oldugunu dogrular
    And Doktor Sayfayi kapatir
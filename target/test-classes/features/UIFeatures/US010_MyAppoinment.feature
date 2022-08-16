@smokeTest
Feature: US10_My Appointments for Physician(Doctor) and Validate appoinments with API and DB

  @US10
  Scenario: TC001_User (doctor) can see their appointments list and time slots on My Appointments

    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    Then doktor My Appointments sekmesine tiklar
    Then Doktor  appointments list  gorebildigini test eder
    Then Doktor  time slots gorebildigini test eder
    And Doktor patient id, start date, end date, status bilgilerini gorebildigini test eder
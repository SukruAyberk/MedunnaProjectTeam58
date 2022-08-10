Feature: US014 Doktor Edit Inpatient islemleri yapabilmeli
  Background:Ortak adimlar
    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    Then doktor singIn butonuna tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    Then doktor My Inpatients sekmesine tiklar
    And doktor sayfayi kapatir

  @us014tc001
  Scenario: TC001 Doktor yatili hastalara ait bilgileri goruntuleyebilmeli
    And doktor hastalara ait bilgilerini goruntuler

  @us014TC002
  Scenario: TC002 Doktor status kismini guncellenebilmeli
    And  doktor My Inpatients sayfasinda Edit e tiklar
    And  doktor status menusunu gunceller




















Feature: US014 Doktor Edit Inpatient islemleri yapabilmeli
  Background:Ortak adimlar
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




















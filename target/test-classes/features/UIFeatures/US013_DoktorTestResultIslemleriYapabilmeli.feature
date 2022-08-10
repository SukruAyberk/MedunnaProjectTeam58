Feature: US013 Doktor Test Result islemleri yapabilmeli
  Background:
    Then doktor My Pages menusune tiklar
    And doktor My Appointments sekmesine tiklar
    And doktor My Appointments sayfasindaki Edit butonuna tiklar
    And doktor sayfayi kapatir

    @us013tc001
  Scenario: TC001 Doktor hastalarin test sonuc bilgilerini gorebilmeli

    Then doktor Show Result butonuna tiklar
    And doktor View Result butonuna tiklar
    And doktor hastaya ait bilgileri gorur



  Scenario: TC002 Doktor Request Impatient isteğinde bulunabilmeli
    Then doktor Request Inpatient isteginde bulunur


Feature: US013 Doktor Test Result islemleri yapabilmeli
@us013
  Scenario: TC001 Doktor hastalarin test sonuc bilgilerini gorebilmeli
    Given kullanici Url'e gider
    Then kullanici profil simgesine tiklar
    Then kullanici sing in butonuna tiklar
    Then kullanici gecerli username ve password ile giris yapar
    Then kullanici My Pages menusune tiklar
    And kullanici My Appointments sekmesine tiklar
    And kullaici My Appointments sayfasindaki Edit butonuna tiklar
    Then kullanici Show Result butonuna tiklar
    And kullanici View Result butonuna tiklar
    And kullanici hastaya ait bilgileri gorur

  Scenario: TC002 Doktor Request Impatient isteğinde bulunabilmeli
    Given kullanici Url'e gider
    Then kullanici profil simgesine tiklar
    Then kullanici sing in butonuna tiklar
    Then kullanici gecerli username ve password ile giris yapar
    Then kullanici My Pages menusune tiklar
    And kullanici My Appointments sekmesine tiklar
    And kullaici My Appointments sayfasindaki Edit butonuna tiklar


Feature: US013 Doktor Test Result islemleri yapabilmeli

  @us013tc001
  Scenario: TC001 Doktor hastalarin test sonuc bilgilerini gorebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    And doktor My Appointments sekmesine tiklar
    And doktor My Appointments sayfasindaki Edit butonuna tiklar
    Then doktor Show Result butonuna tiklar
    And doktor View Result butonuna tiklar
    And doktor hastaya ait bilgileri gorur


  @us013tc002
  Scenario: TC002 Doktor Request Impatient isteğinde bulunabilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    And doktor My Appointments sekmesine tiklar
    And doktor My Appointments sayfasindaki Edit butonuna tiklar
    Then doktor Request Inpatient isteginde bulunur


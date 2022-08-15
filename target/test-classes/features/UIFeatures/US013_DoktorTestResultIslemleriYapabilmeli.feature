Feature: US013 Doktor Test Result islemleri yapabilmeli
    @us013tc001
  Scenario: TC001 Doktor hastalarin test sonuc bilgilerini gorebilmeli
    Given doktor "medunnaUrl" anasayfasinda
    Then doktor profil sembolune tiklar
    Then doktor singIn sekmesi tiklar
    Then doktor gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then doktor sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    And doktor My Appointments sekmesine tiklar
    And doktor My Appointments sayfasindaki Edit butonuna tiklar
    Then doktor Show Result butonuna tiklar
    And doktor View Result butonuna tiklar
    And doktor hastaya ait bilgileri gorur


  @us013tc002
  Scenario: TC002 Doktor Request Impatient isteğinde bulunabilmeli
    Then doktor Request Inpatient isteginde bulunur


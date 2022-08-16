Feature: US014 Doktor Edit Inpatient islemleri yapabilmeli

  @us014tc001
  Scenario: TC001 Doktor yatili hastalara ait bilgileri goruntuleyebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    Then doktor My Inpatients sekmesine tiklar
    And doktor hastalara ait bilgilerini goruntuler

  @us014TC002
  Scenario: TC002 Doktor status kismini guncellenebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    Then doktor My Inpatients sekmesine tiklar
    And  doktor My Inpatients sayfasinda Edit e tiklar
    And  doktor status menusunu gunceller

  @us014tc003
  Scenario: TC003 Doktor rezerve edilmis odayı güncelleyebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then doktor My Pages menusune tiklar
    Then doktor My Inpatients sekmesine tiklar
    And  doktor My Inpatients sayfasinda Edit e tiklar
    Then doktor rezerve edilmis odayı günceller





























@smokeTest
Feature: US004 Giris Sayfasi Erisimi

  @us004tc001
  Scenario: TC001 Kullanici Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And user gecerli "newUsername" ve "newUserPassword" ile giris yapar
    And singin butonuna basar
    And giris yaptigini dogrular

  @us004tc002
  Scenario: TC002 Admin Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And user gecerli "adminUsername" ve "adminPassword" ile giris yapar
    And singin butonuna basar
    And giris yaptigini dogrular

  @us004tc003
  Scenario: TC003 Doktor Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And user gecerli "Doctorsername" ve "DoctorPassword" ile giris yapar
    And singin butonuna basar
    And giris yaptigini dogrular

  @us004tc004
  Scenario: TC004 Personel Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And user gecerli "PersonelUsername" ve "PersonelPassword" ile giris yapar
    And singin butonuna basar
    And giris yaptigini dogrular

  @us004tc005
  Scenario: TC005 Hasta Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And user gecerli "HastaUsername" ve "HastaPassword" ile giris yapar
    And singin butonuna basar
    And giris yaptigini dogrular




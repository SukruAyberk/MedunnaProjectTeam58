Feature: US004 Giris Sayfasi Erisimi

  @us004tc001
  Scenario: TC001 Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn butonuna tiklar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And user gecerli "UserUsername" ve "UserPassword" ile giris yapar
    And user sing in butonuna tiklar
    And giris yaptigini dogrular




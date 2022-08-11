Feature: US004 Giris Sayfasi Erisimi

  @us004tc001
  Scenario: TC001 Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given kullanici "medunnaUrl" anasayfasinda
    Then kullanici user sembolune basar
    And kullanici sing in butonuna basar
    And beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And gecerli username "UserUsername" girer
    And gecerli password "UserPassword" girer
    And singin butonuna basar
    And giris yaptigini dogrular




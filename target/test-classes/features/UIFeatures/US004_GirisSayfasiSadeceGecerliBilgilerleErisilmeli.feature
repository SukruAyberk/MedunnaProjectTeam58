Feature: US004 Giris Sayfasi Erisimi

  @us004
  Scenario: TC01 Giris sayfasi sadece geceli bilgilerle erisilebilir olmali
    Given kullanici "medunnaUrl" anasayfasinda
    Then kullanici user sembolune basar
    And kullanici "sing in" butonuna basar
    And Beni hatirla secenegi oldugu kontrol eder
    And Did you forget your password secenegi oldugu kontrol eder
    And Cancel butonu oldugu kontrol eder
    And "kullanici adi" ve "password" girer
    And giris yapar
    And giris yaptigini dogrular


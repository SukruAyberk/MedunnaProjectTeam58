Feature: US003 Password Strength

  @us003
  Scenario: TC001 Password Strength seviyesinin degistigi gorulmeli
    Given kullanici "medunnaUrl" anasayfasinda
    Then kullanici user sembolune basar
    And kullanici register butonuna basar
    And kucuk harf eklenince password strength kontrol eder
    And buyuk harf eklenince password strength kontrol eder
    And sayi eklenince password strength kontrol eder
    And ozel karakter password strength kontrol eder
    And password uzunlugu en az 7 oldugunu kontrol eder

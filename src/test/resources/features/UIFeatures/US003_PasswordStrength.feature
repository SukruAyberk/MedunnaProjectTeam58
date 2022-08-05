Feature: US003 Password Strength

  @us003
  Scenario: TC01 Password Strength seviyesinin degistigi gorulmeli
    Given kullanici "medunnaUrl" anasayfasinda
    Then kullanici user sembolune basar
    And kullanici "register" butonuna basar
    And password strength seviyesinin degistigini kontrol eder

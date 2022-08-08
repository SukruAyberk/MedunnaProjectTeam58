Feature: US004 Giris Sayfasi Erisimi

  @us004tc002
  Scenario Outline:
    Given kullanici "medunnaUrl" anasayfasinda
    Then kullanici user sembolune basar
    And kullanici sing in butonuna basar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And singin butonuna basar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username            | password            |
      | UserUsername        | UserInvalidPassword |
      | UserInvalidUsername | UserPassword        |
      | UserInvalidUsername | UserInvalidPassword |

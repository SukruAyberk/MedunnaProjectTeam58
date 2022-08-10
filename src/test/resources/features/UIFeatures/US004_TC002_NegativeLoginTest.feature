Feature: US004 Giris Sayfasi Erisimi

  @us004tc002
  Scenario Outline:
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn butonuna tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And user sing in butonuna tiklar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username            | password            |
      | UserUsername        | UserInvalidPassword |
      | UserInvalidUsername | UserPassword        |
      | UserInvalidUsername | UserInvalidPassword |

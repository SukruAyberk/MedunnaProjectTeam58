Feature: US003 Password Strength

  @us003
  Scenario Outline: TC001 Password uzunlugu 7den kucukse Password Strength seviyesinin degistigi gorulmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    And kullanici register butonuna basar
    And kucuk harf "<kucukharf>" eklenince password strength kontrol eder
    And buyuk harf "<buyukharf>" eklenince password strength kontrol eder
    And "<sayi>" eklenince password strength kontrol eder
    And ozel karakter "<ozelkarakter>" password strength kontrol eder

    Examples:
      | kucukharf | buyukharf | sayi | ozelkarakter |
      | a         | A         | 5    | *            |
      | aa        | AA        | 55   | *            |
      | aaa       | AAA       | 5    | *            |
      | aaaa      | AAAA      | 5    | *            |

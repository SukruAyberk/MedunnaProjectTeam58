@us004negative
Feature: US004 Giris Sayfasi Erisimi

  @us004tc006
  Scenario Outline: TC006 Kullanici Giris sayfasi gecersiz bilgilerle erisilemez
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And singin butonuna basar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username            | password            |
      | newUsername         | UserInvalidPassword |
      | UserInvalidUsername | newUserPassword     |
      | UserInvalidUsername | UserInvalidPassword |

  @us004tc007
  Scenario Outline: TC007 Admin Giris sayfasi gecersiz bilgilerle erisilemez
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And singin butonuna basar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username             | password             |
      | adminUsername        | adminInvalidPassword |
      | adminInvalidUsername | adminPassword        |
      | adminInvalidUsername | adminInvalidPassword |

  @us004tc008
  Scenario Outline: TC008 Doktor Giris sayfasi gecersiz bilgilerle erisilemez
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And singin butonuna basar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username              | password              |
      | Doctorsername         | DoctorInvalidPassword |
      | DoctorInvalidUsername | DoctorPassword        |
      | DoctorInvalidUsername | DoctorInvalidPassword |

  @us004tc009
  Scenario Outline: TC009 Personel Giris sayfasi gecersiz bilgilerle erisilemez
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And singin butonuna basar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username                | password                |
      | PersonelUsername        | PersonelInvalidPassword |
      | PersonelInvalidUsername | PersonelPassword        |
      | PersonelInvalidUsername | PersonelInvalidPassword |

  @us004tc010
  Scenario Outline: TC010 Hasta Giris sayfasi gecersiz bilgilerle erisilemez
    Given user "medunnaUrl" anasayfasinda
    Then user user sembolune tiklar
    And user singIn sekmesi tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And singin butonuna basar
    And sayfaya giris yapilamadigini test eder
    Examples:
      | username             | password             |
      | HastaUsername        | HastaInvalidPassword |
      | HastaInvalidUsername | HastaPassword        |
      | HastaInvalidUsername | HastaInvalidPassword |

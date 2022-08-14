
@US001-US002
Feature: Registration Ozelligi


  @US001_UIRegistration
  Scenario: TC001 kullanici gecerli bilgiler ile kayit olabilmeli
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna geçerli bir "SSN" numarasi girer
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusuna geçerli bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici Registitaion Saved yazisinin gorunur oldugunu dogrular

  Scenario: TC002 kullanici gecersiz SSN ile kayit olamamali
      Given Kullanici Medunna ana sayfasina gider
      And Kullanici Register butonuna tiklar
      And Kullanici SSN kutusuna geçersiz bir "SSN" numarasi girer
      And Kullanici firstname kutusuna geçerli bir "firstname" girer
      And Kullanici lastname kutusuna geçerli bir "lastname" girer
      And Kullanici username kutusuna geçerli bir "username" girer
      And Kullanici email kutusuna geçerli bir "email" girer
      And Kullanici password kutusuna geçerli bir "password" girer
      Then Kullanici register butonuna tıklar
      Then Kullanici SSN hata mesajinin gorunur oldugunu dogrular

  Scenario: TC003 kullanici bos SSN ile kayit olamamali
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusunu bos birakir
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusuna geçerli bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici bos SSN hata mesajinin gorunur oldugunu dogrular

  Scenario: TC004 kullanici bos firtsname ile kayit olamamali
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna geçerli bir "SSN" numarasi girer
    And Kullanici firstname kutusunu bos birakir
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusuna geçerli bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici bos firstname hata mesajinin gorunur oldugunu dogrular

  Scenario: TC005 kullanici bos lastname ile kayit olamamali
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna geçerli bir "SSN" numarasi girer
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusunu bos birakir
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusuna geçerli bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici bos lastname hata mesajinin gorunur oldugunu dogrular

  Scenario: TC006 kullanici dokuz ile baslayan SSN ile kayit olabilmeli
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna dokuz ile başlayan bir "SSN" numarasi girer
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusuna geçerli bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici Registitaion Saved yazisinin gorunur oldugunu dogrular
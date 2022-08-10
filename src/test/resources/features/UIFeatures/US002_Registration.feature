
@US001-US002
Feature:US002


  Scenario:TC001
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

  Scenario:TC002
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna geçerli bir "SSN" numarasi girer
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusunu bos birakir
    And Kullanici email kutusuna geçerli bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici bos username hata mesajinin gorunur oldugunu dogrular

  Scenario:TC003
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

  Scenario:TC004
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna geçerli bir "SSN" numarasi girer
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusunu bos birakir
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici bos email hata mesajinin gorunur oldugunu dogrular

  Scenario:TC005
    Given Kullanici Medunna ana sayfasina gider
    And Kullanici Register butonuna tiklar
    And Kullanici SSN kutusuna geçerli bir "SSN" numarasi girer
    And Kullanici firstname kutusuna geçerli bir "firstname" girer
    And Kullanici lastname kutusuna geçerli bir "lastname" girer
    And Kullanici username kutusuna geçerli bir "username" girer
    And Kullanici email kutusuna gecersiz bir "email" girer
    And Kullanici password kutusuna geçerli bir "password" girer
    Then Kullanici register butonuna tıklar
    Then Kullanici gecersiz email hata mesajinin gorunur oldugunu dogrular
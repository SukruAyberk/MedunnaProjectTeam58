Feature: User Setting sayfadasında duzenleme yapabilmeli

  Scenario: TC001 User bilgileri "firstname, lastname and email" girerken doldurulan kullanıcı bilgileri olmalı

    Given user "medunnaUrl" anasayfasinda
    And user user sembolune tiklar
    And user singIn sekmesi tiklar
    And user gecerli "newUsername" ve "newUserPassword" ile giris yapar
    And user sing in butonuna tiklar
    Then user accont menu-ye tiklar
    Then user Setting bolumune tiklar
    Then user Setting sayfasını dogrular
    Then firstname lastname email bilgilerini dogrular
    And user sayfayı kapatır



  Scenario: TC002 "Firstname" update seçeneği olmalı

    Given user "medunnaUrl" anasayfasinda
    And user user sembolune tiklar
    And user singIn sekmesi tiklar
    And user gecerli "newUsername" ve "newUserPassword" ile giris yapar
    And user sing in butonuna tiklar
    Then user accont menu-ye tiklar
    Then user Setting bolumune tiklar
    Then user yeni firstname-ni su sekilde girer "elvina"
    Then save butonuna tiklar
    Then user sonucu dogrular
    And user sayfayı kapatır



  Scenario: TC003 "Lastname" update seçeneği olmalı

    Given user "medunnaUrl" anasayfasinda
    And user user sembolune tiklar
    And user singIn sekmesi tiklar
    And user gecerli "newUsername" ve "newUserPassword" ile giris yapar
    And user sing in butonuna tiklar
    Then user accont menu-ye tiklar
    Then user Setting bolumune tiklar
    Then user yeni lastname-ni su sekilde girer "ozturk"
    Then save butonuna tiklar
    Then user sonucu dogrular
    And user sayfayı kapatır



  Scenario:TC004 "E-mail" update seçeneği olmalı

    Given user "medunnaUrl" anasayfasinda
    And user user sembolune tiklar
    And user singIn sekmesi tiklar
    And user gecerli "newUsername" ve "newUserPassword" ile giris yapar
    And user sing in butonuna tiklar
    Then user accont menu-ye tiklar
    Then user Setting bolumune tiklar
    Then user yeni email-i su sekilde girer "elvinaozturk@gmail.com"
    Then save butonuna tiklar
    Then user sonucu dogrular
    And user sayfayı kapatır
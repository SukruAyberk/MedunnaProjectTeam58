@smokeTest
Feature: Medunna sitesinden randevu alma

  @us005tc001
  Scenario: Kullanici gecerli bilgilerle randevu olusturabilmeli
    Given user "medunnaUrl" anasayfasinda
    Then Kullanici Make an Appointment butonuna tiklar
    And kullanici Make an Appointment bolumune gittigini dogrular
    And Kullanici First Name kismini bos birakamadigini gorur
    And Kullanici Last Name kismini bos birakamadigini gorur
    And Kullanici SSN kismini bos birakamadigini gorur
    And Kullanici Mail kismini bos birakamadigini gorur
    And Kullanici Phone kismini bos birakamadigini gorur

  @us005tc002
  Scenario: Kullanici gecerli bilgilerle randevu olusturabilmeli
    Given user "medunnaUrl" anasayfasinda
    Then Kullanici tekrar Make an Appointment butonuna tiklar
    And kullanici tekrar Make an Appointment bolumune gittigini dogrular
    And Kullanici First Name kismina random bir karakter girer
    And Kullanici Last Name kismina random bir karakter girer
    And Kullanici SSN kismina kayıtlı bir ssn girer
    And Kullanici Mail kismina random bir mail girer
    And Kullanici Phone kismina 3. ve 6. rakamdan sonra "-" olan 10 haneli bir telefon numarasi girer
    And Kullanici "Send an Appoinment Request" butonuna tiklayarak randevu alir
    And Kullanici çıkan kaydınız oluşturuldu mesajını görerek kaydı tamamlar

  @us005tc003
  Scenario: patient aldigi randevuyu goruntuleyebilmeli
    Given user "medunnaUrl" anasayfasinda
    Then profil sembolune tiklar
    Then singIn sekmesi tiklar
    Then user gecerli "HastaUsername" ve "HastaPassword" ile giris yapar
    Then user sing in butonuna tiklar
    Then patient "My pages" butonuna tiklar
    Then patient "my appointment" butonuna tiklayar
    Then patient "Appointment" basliginda randevularini goruntuler





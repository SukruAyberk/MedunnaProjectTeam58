Feature: US009 Staff hasta bilgilerini görebilmeli düzenleyebilmeli ve silememelidir.

Background:
Given staff "medunnaUrl" anasayfasinda
Then staff profil sembolune tiklar
Then staff singIn sekmesi tiklar
Then staff gecerli "PersonelUsername" ve "PersonelPassword" ile giris yapar
Then staff sing in butonuna tiklar
Then staff My Pages menusune tiklar
And staff Search Patient butonunu tiklar

  @us009tc01
  Scenario: TC001 Staff hasta bilgilerini gorebilmeli

    Then  staff Search Patient sekmesinde hasta bilgilerini gorur


  @us009tc02
  Scenario: TC002 Staff butun hasta bilgilerini duzenleyebilmeli

    Then  staff Search Patient sekmesinde hasta bilgilerini gorur
    And staff hastanin yanindaki edit butonuna tiklar
    And staff hasta bilgilerinin duzenlenebilir oldugunu test eder


  @us009tc03
  Scenario: TC003 Staff SSN'ye gore yeni bir basvuru sahibi arayabilmeli ve bilgileri gorebilmeli

    Then  staff Search Patient sekmesinde hasta bilgilerini gorur
    And staff SSN kismina hasta SSN bilgisi girer
    And staff ilgili hastanin yanindaki view butonuna tiklar
    And staff kayit bilgilerinin gorunur oldugunu test eder


  @us009tc06
  Scenario: TC006 Staff hasta bilgisi silebilmeli
    Then  staff Search Patient sekmesinde hasta bilgilerini gorur
    And staff hastanin yanindaki edit butonuna tiklar
    And staff hasta bilgilerinin silinebilir oldugunu test eder
    And staff kayit bilgilerini siler ve save butonuna tiklar
    And staff bilgilerin silinip silinmedigini test eder


  @us009tc07
  Scenario: TC007 Staff hasta silememeli

    Then  staff Search Patient sekmesinde hasta bilgilerini gorur
    And staff hastalarin silinmedigini test eder


  @us009tc08
  Scenario: TC008 Staff hastaları SSN kimliklerine gore arayabilmeli

    And staff 'Patient SSN' butonunu tiklar
    And staff 'Patient SSN' kutusundan SSN kimliklere göre arar
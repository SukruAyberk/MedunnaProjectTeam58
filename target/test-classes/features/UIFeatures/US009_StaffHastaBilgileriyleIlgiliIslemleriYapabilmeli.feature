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
  Scenario: TC001 Staff hasta bilgilerini görebilmeli

    Then  staff Search Patient sekmesinde hasta bilgilerini gorur




  @us009tc02
  Scenario: TC002 Staff bütün hasta bilgilerini düzenleyebilmeli




  @us009tc03
  Scenario: TC003 Staff SSN'ye göre yeni bir başvuru sahibi arayabilmeli ve bilgileri görebilmeli




  @us009tc06
  Scenario: TC006 Staff hasta bilgisi silebilmeli




  @us009tc07
  Scenario: TC007 Staff hasta silememeli




  @us009tc08
  Scenario: TC008 Staff hastaları SSN kimliklerine göre arayabilmeli
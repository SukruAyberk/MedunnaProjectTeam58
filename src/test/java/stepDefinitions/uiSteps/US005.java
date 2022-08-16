package stepDefinitions.uiSteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EmrePage;
import utilities.ReusableMethods;


public class US005 {
    EmrePage emre = new EmrePage();

    String hastaAdi = "HastaTeam58Ad";
    String hastaSoyAdi = "HastaTeam58SoyAd";
    String kayitlissn = "586-06-4185";
    String mail = "team58@gmail.com";
    String hastaTel = "1231231234";


    @Then("Kullanici Make an Appointment butonuna tiklar")
    public void kullanici_kullanici_make_an_appointment_butonuna_tiklar() {
        emre.makeAppointmentButton.click();

    }

    @Then("kullanici Make an Appointment bolumune gittigini dogrular")
    public void kullanici_make_an_appointment_bolumune_gittigini_dogrular() {

        Assert.assertTrue(emre.makeAppointmentPage.isDisplayed());

        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici First Name kismini bos birakamadigini gorur")
    public void kullanici_first_name_kismini_bos_birakamadigini_gorur() {

        emre.firstNameButton.sendKeys(" " + Keys.TAB);
        Assert.assertTrue(emre.firstNameIsntEmpty.isDisplayed());


    }

    @Then("Kullanici Last Name kismini bos birakamadigini gorur")
    public void kullanici_last_name_kismini_bos_birakamadigini_gorur() {

        emre.lastNameButton.sendKeys(" " + Keys.TAB);
        Assert.assertTrue(emre.lastNameIsntEmpty.isDisplayed());

    }

    @Then("Kullanici SSN kismini bos birakamadigini gorur")
    public void kullanici_ssn_kismini_bos_birakamadigini_gorur() {
        emre.ssnButton.sendKeys(" " + Keys.TAB);
        Assert.assertTrue(emre.ssnButtonIsntEmpty.isDisplayed());

    }

    @Then("Kullanici Mail kismini bos birakamadigini gorur")
    public void kullanici_mail_kismini_bos_birakamadigini_gorur() {
        emre.emailButton.sendKeys(" " + Keys.TAB);
        Assert.assertTrue(emre.emailButtonIsntEmpty.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Phone kismini bos birakamadigini gorur")
    public void kullanici_phone_kismini_bos_birakamadigini_gorur() {
        emre.phoneButton.sendKeys(" " + Keys.TAB);
        Assert.assertTrue(emre.phoneButtonIsntEmpty.isDisplayed());
    }
    //____________________________SECOND SCENARIO START______________________________


    @Then("Kullanici tekrar Make an Appointment butonuna tiklar")
    public void kullanici_tekrar_make_an_appointment_butonuna_tiklar() {
        emre.makeAppointmentButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("kullanici tekrar Make an Appointment bolumune gittigini dogrular")
    public void kullanici_tekrar_make_an_appointment_bolumune_gittigini_dogrular() {
        emre.makeAppointmentPage.isDisplayed();
        String expectedAppoinmentTitle = "Make an Appointment";
        String actualTitle = emre.actualAppointmentTitle.getText();

    }

    @Then("Kullanici First Name kismina random bir karakter girer")
    public void kullanici_first_name_kismina_random_bir_karakter_girer() {
        emre.firstNameButton.sendKeys(hastaAdi + Keys.TAB);

    }

    @Then("Kullanici Last Name kismina random bir karakter girer")
    public void kullanici_last_name_kismina_random_bir_karakter_girer() {
        emre.lastNameButton.sendKeys(hastaSoyAdi + Keys.TAB);

    }

    @Then("Kullanici SSN kismina kayıtlı bir ssn girer")
    public void kullanici_ssn_kismina_kayitli_bir_ssn_girer() {
        emre.ssnButton.sendKeys(kayitlissn + Keys.TAB);

    }

    @Then("Kullanici Mail kismina random bir mail girer")
    public void kullanici_mail_kismina_random_bir_mail_girer() {
        emre.emailButton.sendKeys(mail + Keys.TAB);

    }

    @Then("Kullanici Phone kismina {int}. ve {int}. rakamdan sonra {string} olan {int} haneli bir telefon numarasi girer")
    public void kullanici_phone_kismina_ve_rakamdan_sonra_olan_haneli_bir_telefon_numarasi_girer(Integer int1, Integer int2, String string, Integer int3) {
        emre.phoneButton.sendKeys(hastaTel);
    }

    @Then("Kullanici {string} butonuna tiklayarak randevu alir")
    public void kullanici_butonuna_tiklayarak_randevu_alir(String string) {
        emre.sendAnRequestButton.click();
        ReusableMethods.waitFor(3);

    }

    @Then("Kullanici çıkan kaydınız oluşturuldu mesajını görerek kaydı tamamlar")
    public void kullanici_cikan_kaydiniz_olusturuldu_mesajini_gorerek_kaydi_tamamlar() {
        Assert.assertTrue(emre.appointmentAlertMessage.isDisplayed());
    }

    @Then("patient {string} butonuna tiklar")
    public void patient_butonuna_tiklar(String string) {
        emre.myPagesButton.click();
        ReusableMethods.waitFor(3);

    }

    @Then("patient {string} butonuna tiklayar")
    public void patient_butonuna_tiklayar(String string) {
        emre.myAppointmentsButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("patient {string} basliginda randevularini goruntuler")
    public void patient_basliginda_randevularini_goruntuler(String string) {
        Assert.assertTrue(emre.appointmentHeaderTitle.isDisplayed());
        ReusableMethods.waitFor(2);
        emre.showTestButtons.click();
    }
}

/*package stepDefinitions.uiSteps;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.EmrePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.function.Function;


public class US005 {
    EmrePage emre = new EmrePage();
    SoftAssert softassert = new SoftAssert();
    WebDriver driver = new ChromeDriver();

    String hastaAdi="HastaTeam58Ad";
    String hastaSoyAdi="HastaTeam58SoyAd";
    String kayitlissn="586-06-4185";
    String mail="team58@gmail.com";
    String hastaTel="1231231234";





    @Then("Kullanici Make an Appointment butonuna tiklar")
    public void kullanici_kullanici_make_an_appointment_butonuna_tiklar() {
        emre.makeAppointmentButton.click();

    }
    @Then("kullanici Make an Appointment bolumune gittigini dogrular")
    public void kullanici_make_an_appointment_bolumune_gittigini_dogrular() throws InterruptedException {

        emre.makeAppointmentPage.isDisplayed();

        Thread.sleep(2000);
    }

    @Then("Kullanici First Name kismini bos birakamadigini gorur")
    public void kullanici_first_name_kismini_bos_birakamadigini_gorur() {

        emre.firstNameButton.sendKeys(" "+ Keys.TAB);
        emre.firstNameIsntEmpty.isDisplayed();


    }
    @Then("Kullanici Last Name kismini bos birakamadigini gorur")
    public void kullanici_last_name_kismini_bos_birakamadigini_gorur() {

        emre.lastNameButton.sendKeys(" "+Keys.TAB);
        emre.lastNameIsntEmpty.isDisplayed();

    }
    @Then("Kullanici SSN kismini bos birakamadigini gorur")
    public void kullanici_ssn_kismini_bos_birakamadigini_gorur() {
        emre.ssnButton.sendKeys(" "+Keys.TAB);
        emre.ssnButtonIsntEmpty.isDisplayed();

    }
    @Then("Kullanici Mail kismini bos birakamadigini gorur")
    public void kullanici_mail_kismini_bos_birakamadigini_gorur() throws InterruptedException {
        emre.emailButton.sendKeys(" "+Keys.TAB);
        emre.emailButtonIsntEmpty.isDisplayed();
        Thread.sleep(2000);
    }
    @Then("Kullanici Phone kismini bos birakamadigini gorur")
    public void kullanici_phone_kismini_bos_birakamadigini_gorur() {
        emre.phoneButton.sendKeys(" "+Keys.TAB);
        emre.phoneButtonIsntEmpty.isDisplayed();
    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }
    //____________________________SECOND SCENARIO START______________________________




    @Then("Kullanici tekrar Make an Appointment butonuna tiklar")
    public void kullanici_tekrar_make_an_appointment_butonuna_tiklar() throws InterruptedException {
        emre.makeAppointmentButton.click();
        Thread.sleep(1000);

    }
    @Then("kullanici tekrar Make an Appointment bolumune gittigini dogrular")
    public void kullanici_tekrar_make_an_appointment_bolumune_gittigini_dogrular() {
        emre.makeAppointmentPage.isDisplayed();
        String expectedAppoinmentTitle = "Make an Appointment";
        String actualTitle= emre.actualAppointmentTitle.getText();
        softassert.assertEquals(expectedAppoinmentTitle,actualTitle,"beklenen yazı ile aktif yazı aynı");

    }
    @Then("Kullanici First Name kismina random bir karakter girer")
    public void kullanici_first_name_kismina_random_bir_karakter_girer() {
        emre.firstNameButton.sendKeys(hastaAdi+Keys.TAB);

    }
    @Then("Kullanici Last Name kismina random bir karakter girer")
    public void kullanici_last_name_kismina_random_bir_karakter_girer() {
        emre.lastNameButton.sendKeys(hastaSoyAdi+Keys.TAB);

    }
    @Then("Kullanici SSN kismina kayıtlı bir ssn girer")
    public void kullanici_ssn_kismina_kayitli_bir_ssn_girer() {
        emre.ssnButton.sendKeys(kayitlissn+Keys.TAB);

    }
    @Then("Kullanici Mail kismina random bir mail girer")
    public void kullanici_mail_kismina_random_bir_mail_girer() {
        emre.emailButton.sendKeys(mail+Keys.TAB);

    }
    @Then("Kullanici Phone kismina {int}. ve {int}. rakamdan sonra {string} olan {int} haneli bir telefon numarasi girer")
    public void kullanici_phone_kismina_ve_rakamdan_sonra_olan_haneli_bir_telefon_numarasi_girer(Integer int1, Integer int2, String string, Integer int3) {
        emre.phoneButton.sendKeys(hastaTel);
    }
    @Then("Kullanici {string} butonuna tiklayarak randevu alir")
    public void kullanici_butonuna_tiklayarak_randevu_alir(String string) throws InterruptedException {
        emre.sendAnRequestButton.click();
        Thread.sleep(3000);

    }
    @Then("Kullanici çıkan kaydınız oluşturuldu mesajını görerek kaydı tamamlar")
    public void kullanici_cikan_kaydiniz_olusturuldu_mesajini_gorerek_kaydi_tamamlar() {

        emre.appointmentAlertMessage.isDisplayed();
    }
}*/

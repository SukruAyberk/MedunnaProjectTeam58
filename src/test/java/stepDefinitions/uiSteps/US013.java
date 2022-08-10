package stepDefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.CigdemAPage;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;

public class US013 {
    OrtakLocatePages ortakLocatePages=new OrtakLocatePages();
    CigdemAPage cigdemAPage=new CigdemAPage();

    @Given("kullanici Url'e gider")
    public void kullanici_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("kullanici profil simgesine tiklar")
    public void kullanici_profil_simgesine_tiklar() throws InterruptedException {
       ortakLocatePages.profilSimgesi.click();
       Thread.sleep(2000);
    }

    @Then("kullanici sing in butonuna tiklar")
    public void kullanici_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInSekmesi1.click();
        Thread.sleep(2000);
    }

    @Then("kullanici gecerli username ve password ile giris yapar")
    public void kullanici_gecerli_username_ve_password_ile_giris_yapar() throws InterruptedException {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("Doctorusername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("Doctorpassword"));
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
    }

    @Then("kullanici My Pages menusune tiklar")
    public void kullanici_my_pages_menusune_tiklar() throws InterruptedException {
      ortakLocatePages.myPagesButonu.click();
      Thread.sleep(2000);
    }

    @Then("kullanici My Appointments sekmesine tiklar")
    public void kullanici_my_appointments_sekmesine_tiklar() throws InterruptedException {
        ortakLocatePages.myAppointmentsButonu.click();
        Thread.sleep(2000);
    }

    @Then("kullaici My Appointments sayfasindaki Edit butonuna tiklar")
    public void kullaici_my_appointments_sayfasindaki_edit_butonuna_tiklar() throws InterruptedException {
        cigdemAPage.appointmentEditButonu.click();
        Thread.sleep(2000);
    }

    @Then("kullanici Show Result butonuna tiklar")
    public void kullanici_show_result_butonuna_tiklar() throws InterruptedException {
        cigdemAPage.showTestResultButonu.click();
        Thread.sleep(2000);
    }

    @Then("kullanici View Result butonuna tiklar")
    public void kullanici_view_result_butonuna_tiklar() throws InterruptedException {
        cigdemAPage.viewResultButonu.click();
        Thread.sleep(2000);
    }

    @Then("kullanici hastaya ait bilgileri gorur")
    public void kullanici_hastaya_ait_bilgileri_gorur() {

    }
}

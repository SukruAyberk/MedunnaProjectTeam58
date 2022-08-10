package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;
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
        ortakLocatePages.signInButton1.click();
        Thread.sleep(2000);
    }

    @Then("kullanici gecerli username ve password ile giris yapar")
    public void kullanici_gecerli_username_ve_password_ile_giris_yapar() throws InterruptedException {
        ortakLocatePages.usernameBox.sendKeys("cigdemgurbuz");
        ortakLocatePages.passwordBox.sendKeys("1qaz2wsx.C");
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


    @Then("kullanici Request Inpatient isteginde bulunur")
    public void kullaniciRequestInpatientIstegindeBulunur() throws InterruptedException {
        cigdemAPage.requestInpatientButonu.click();
        cigdemAPage.inpatientMessage.isDisplayed();

       // Thread.sleep(4000);
       // String expectedText="InPatient request already done for this appointment";
       // String actualText= Driver.getDriver().switchTo().alert().getText();
//
       // Assert.assertEquals(expectedText, actualText,"Yatili hasta isteginde bulunuldu");
    }

    @And("doktor hastaya ait bilgileri gorur")
    public void doktorHastayaAitBilgileriGorur() {
        cigdemAPage.idList.isEmpty();
        cigdemAPage.nameList.isEmpty();
        cigdemAPage.defaultMaxValueList.isEmpty();
        cigdemAPage.defaultMinValueList.isEmpty();
        cigdemAPage.testList.isEmpty();
        cigdemAPage.descriptionList.isEmpty();
        cigdemAPage.dateList.isEmpty();
    }

    @And("doktor View Result butonuna tiklar")
    public void doktorViewResultButonunaTiklar() throws InterruptedException {
        cigdemAPage.viewResultButonu.click();
        Thread.sleep(2000);

    }

    @Then("doktor Show Result butonuna tiklar")
    public void doktorShowResultButonunaTiklar() throws InterruptedException {
        cigdemAPage.showTestResultButonu.click();
        Thread.sleep(2000);
    }
}

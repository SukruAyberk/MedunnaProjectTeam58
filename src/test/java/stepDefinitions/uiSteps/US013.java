package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.CigdemAPage;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US013 {
    OrtakLocatePages ortakLocatePages = new OrtakLocatePages();
    CigdemAPage cigdemAPage = new CigdemAPage();
    Actions action = new Actions(Driver.getDriver());

    @Then("doktor My Pages menusune tiklar")
    public void doktor_my_pages_menusune_tiklar() throws InterruptedException {
        ortakLocatePages.myPagesButonu.click();
        Assert.assertTrue(cigdemAPage.myPagesDogrulama.isDisplayed());

    }

    @Then("doktor My Appointments sekmesine tiklar")
    public void doktor_my_appointments_sekmesine_tiklar() throws InterruptedException {
        ortakLocatePages.myAppointmentsButonu.click();
        Assert.assertTrue(cigdemAPage.appointmentYazisi.isDisplayed());
        Thread.sleep(2000);
    }

    @Then("doktor My Appointments sayfasindaki Edit butonuna tiklar")
    public void doktor_my_appointments_sayfasindaki_edit_butonuna_tiklar() {
        ReusableMethods.waitForClickablility(cigdemAPage.appointmentEditButonu, 15);
        cigdemAPage.appointmentEditButonu.click();

    }

    @Then("doktor Request Inpatient isteginde bulunur")
    public void doktor_request_ınpatient_isteginde_bulunur() {
        cigdemAPage.requestInpatientButonu.click();
        Assert.assertTrue(cigdemAPage.inpatientMessage.isDisplayed());
    }

    @And("doktor hastaya ait bilgileri gorur")
    public void doktorHastayaAitBilgileriGorur() {
        String expectedHastaBilgileri = "ID Name Result Default Min. Value Default Max. Value Test Description Date";
        String actuelHastaBilgileri = cigdemAPage.hastaBilgileri.getText();
        Assert.assertEquals(expectedHastaBilgileri, actuelHastaBilgileri);
    }

    @And("doktor View Result butonuna tiklar")
    public void doktorViewResultButonunaTiklar() throws InterruptedException {
        cigdemAPage.viewResultButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(cigdemAPage.testResultYazisi.isDisplayed());

    }

    @Then("doktor Show Result butonuna tiklar")
    public void doktorShowResultButonunaTiklar() throws InterruptedException {
        ReusableMethods.waitForClickablility(cigdemAPage.showTestResultButonu, 15);
        Thread.sleep(2000);
        cigdemAPage.showTestResultButonu.click();
        Assert.assertTrue(cigdemAPage.testsYazisi.isDisplayed());
    }
}
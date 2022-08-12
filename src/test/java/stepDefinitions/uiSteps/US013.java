package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.CigdemAPage;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US013 {
    OrtakLocatePages ortakLocatePages=new OrtakLocatePages();
    CigdemAPage cigdemAPage=new CigdemAPage();
    Actions action = new Actions(Driver.getDriver());
    @Then("doktor My Pages menusune tiklar")
    public void doktor_my_pages_menusune_tiklar() throws InterruptedException {
        ortakLocatePages.myPagesButonu.click();
        cigdemAPage.myPagesDogrulama.isDisplayed();

    }
    @Then("doktor My Appointments sekmesine tiklar")
    public void doktor_my_appointments_sekmesine_tiklar() throws InterruptedException {
        ortakLocatePages.myAppointmentsButonu.click();
        cigdemAPage.appointmentYazisi.isDisplayed();
        Thread.sleep(2000);
    }
    @Then("doktor My Appointments sayfasindaki Edit butonuna tiklar")
    public void doktor_my_appointments_sayfasindaki_edit_butonuna_tiklar()  {
        ReusableMethods.waitForClickablility(cigdemAPage.appointmentEditButonu,15);
        
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(0,600)");
        //js.executeScript("arguments[0].click();", cigdemAPage.appointmentEditButonu);
        
        String expectedUrl="https://medunna.com/appointment-update/160944";
        String actuelUrl =Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
    }
    @Then("doktor sayfayi kapatir")
    public void doktor_sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Then("doktor Request Inpatient isteginde bulunur")
    public void doktor_request_ınpatient_isteginde_bulunur() {
        cigdemAPage.requestInpatientButonu.click();
        cigdemAPage.inpatientMessage.isDisplayed();
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
        String hastaBilgileri=cigdemAPage.hastaBilgileri.getText();
        System.out.println("hastaBilgileri = " + hastaBilgileri);
    }

    @And("doktor View Result butonuna tiklar")
    public void doktorViewResultButonunaTiklar() throws InterruptedException {
        cigdemAPage.viewResultButonu.click();
        Thread.sleep(2000);
        cigdemAPage.testResultYazisi.isDisplayed();

    }

    @Then("doktor Show Result butonuna tiklar")
    public void doktorShowResultButonunaTiklar() throws InterruptedException {
        cigdemAPage.showTestResultButonu.click();
        Thread.sleep(2000);
        cigdemAPage.testsYazisi.isDisplayed();
    }
}


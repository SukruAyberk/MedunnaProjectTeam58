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

    @Then("doktor My Pages menusune tiklar")
    public void doktor_my_pages_menusune_tiklar() {
        ortakLocatePages.myPagesButonu.click();
    }
    @Then("doktor My Appointments sekmesine tiklar")
    public void doktor_my_appointments_sekmesine_tiklar() {
        ortakLocatePages.myAppointmentsButonu.click();
    }
    @Then("doktor My Appointments sayfasindaki Edit butonuna tiklar")
    public void doktor_my_appointments_sayfasindaki_edit_butonuna_tiklar() {
        cigdemAPage.appointmentEditButonu.click();
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

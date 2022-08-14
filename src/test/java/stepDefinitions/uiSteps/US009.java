package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ErvaPage;
import pages.OrtakLocatePages;

import static utilities.ReusableMethods.waitFor;

public class US009 {
    OrtakLocatePages ortakLocatePages= new OrtakLocatePages();
    ErvaPage ervaPage= new ErvaPage();

    @Then("staff My Pages menusune tiklar")
    public void staff_my_pages_menusune_tiklar() { ortakLocatePages.myPagesButonu.click();
    }

    @And("staff Search Patient butonunu tiklar")
    public void staffSearchPatientButonunuTiklar() {
        ervaPage.searchPatientButonu.click();
        waitFor(5);
    }

    @Then("staff Search Patient sekmesinde hasta bilgilerini gorur")    //Buna bak
    public void staffSearchPatientSekmesindeHastaBilgileriniGorur() {
        Assert.assertTrue(ervaPage.patientDatenList.size() > 0);
    }

    @And("staff hastanin yanindaki edit butonuna tiklar")
    public void staffHastaninYanindakiEditButonunaTiklar() {
        ervaPage.editButonu.click();
    }

    @And("staff hasta bilgilerinin duzenlenebilir oldugunu test eder")
    public void staffHastaBilgilerininDuzenlenebilirOldugunuTestEder() {
//?
    }

    @And("staff SSN kismina hasta SSN bilgisi girer")
    public void staffSSNKisminaHastaSSNBilgisiGirer() {
        ervaPage.ssnKismi.sendKeys("668834231");
    }

    @And("staff ilgili hastanin yanindaki view butonuna tiklar")
    public void staffIlgiliHastaninYanindakiViewButonunaTiklar() {
        ervaPage.viewButonu.click();
    }

    @And("staff kayit bilgilerinin gorunur oldugunu test eder")
    public void staffKayitBilgilerininGorunurOldugunuTestEder() {
        ervaPage.kayitBilgileri.isDisplayed();
    }
}

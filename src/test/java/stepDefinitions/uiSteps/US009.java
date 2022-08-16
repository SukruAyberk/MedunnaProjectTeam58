package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ErvaPage;
import pages.OrtakLocatePages;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US009 {
    OrtakLocatePages ortakLocatePages = new OrtakLocatePages();
    ErvaPage ervaPage = new ErvaPage();

    @Then("staff My Pages menusune tiklar")
    public void staff_my_pages_menusune_tiklar() {
        ortakLocatePages.myPagesButonu.click();
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
        waitFor(5);
    }

    @And("staff hasta bilgilerinin duzenlenebilir oldugunu test eder")
    public void staffHastaBilgilerininDuzenlenebilirOldugunuTestEder() {
        waitFor(5);
        Assert.assertTrue(ervaPage.id.isEnabled());
        Assert.assertTrue(ervaPage.firstName.isEnabled());
        Assert.assertTrue(ervaPage.lastname.isEnabled());
        Assert.assertTrue(ervaPage.birthDate.isEnabled());
        Assert.assertTrue(ervaPage.email.isEnabled());
        Assert.assertTrue(ervaPage.phone.isEnabled());
        Assert.assertTrue(ervaPage.gender.isEnabled());
        Assert.assertTrue(ervaPage.bloodGroup.isEnabled());
        Assert.assertTrue(ervaPage.adress.isEnabled());
        Assert.assertTrue(ervaPage.description.isEnabled());
        Assert.assertTrue(ervaPage.user.isEnabled());
        Assert.assertTrue(ervaPage.country.isEnabled());
        Assert.assertTrue(ervaPage.stateCity.isEnabled());
        waitFor(5);
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

    @And("staff hasta bilgilerinin silinebilir oldugunu test eder")
    public void staffHastaBilgilerininSilinebilirOldugunuTestEder() {
        ervaPage.firstName.clear();
        ervaPage.lastname.clear();
        ervaPage.birthDate.clear();
        ervaPage.email.clear();
        ervaPage.phone.clear();
        ervaPage.gender.clear();
        ervaPage.bloodGroup.clear();
        ervaPage.adress.clear();
        ervaPage.description.clear();
        ervaPage.user.clear();
        ervaPage.country.clear();
        ervaPage.stateCity.clear();
        waitFor(5);
    }

    @And("staff kayit bilgilerini siler ve save butonuna tiklar")
    public void staffKayitBilgileriniSilerVeSaveButonunaTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ervaPage.saveButonu.click();
        waitFor(5);
    }

    @And("staff bilgilerin silinip silinmedigini test eder")
    public void staffBilgilerinSilinipSilinmediginiTestEder() {

    }

    @And("staff hastalarin silinmedigini test eder")
    public void staffHastalarinSilinmediginiTestEder() {
    }
}

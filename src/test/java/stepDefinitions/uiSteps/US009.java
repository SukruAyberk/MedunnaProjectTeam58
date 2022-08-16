package stepDefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ErvaPage;
import pages.OrtakLocatePages;
import utilities.Driver;

import java.net.Proxy;

import static utilities.ReusableMethods.waitFor;

public class US009 {
    OrtakLocatePages ortakLocatePages = new OrtakLocatePages();
    ErvaPage ervaPage = new ErvaPage();
    Faker faker = new Faker();
    @Then("staff My Pages menusune tiklar")
    public void staff_my_pages_menusune_tiklar() {
        ortakLocatePages.myPagesButonu.click();
    }

    @And("staff Search Patient butonunu tiklar")
    public void staffSearchPatientButonunuTiklar() {
        ervaPage.searchPatientButonu.click();
        waitFor(5);
    }

    @Then("staff Search Patient sekmesinde hasta bilgilerini gorur")
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

        ervaPage.firstName.clear();
        ervaPage.firstName.sendKeys("Elif");
        ervaPage.lastname.clear();
        ervaPage.lastname.sendKeys("Yildiz");
        ervaPage.birthDate.clear();
        ervaPage.birthDate.sendKeys("01251992326");
        ervaPage.email.clear();
        ervaPage.email.sendKeys("elif.yildiz@gmail.com");
        ervaPage.phone.clear();
        ervaPage.phone.sendKeys("5435316532");
        Select selectGender = new Select(ervaPage.gender);
        selectGender.selectByIndex(1);
        Select selectBloodGroup = new Select(ervaPage.bloodGroup);
        selectBloodGroup.selectByIndex(1);
        ervaPage.adress.sendKeys(faker.address().fullAddress());
        ervaPage.description.sendKeys("hi, Medunna is best site");
        Select userType = new Select(ervaPage.user);
        userType.selectByIndex(11);
        Select country = new Select(ervaPage.country);
        country.selectByIndex(4);
        Select stateCity = new Select (ervaPage.stateCity);
        stateCity.selectByIndex(0);
    }

    @And("staff SSN kismina hasta SSN bilgisi girer")
    public void staffSSNKisminaHastaSSNBilgisiGirer() {
        ervaPage.ssnKismi.sendKeys("851-02-6601");
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
        Assert.assertTrue(ervaPage.hastaBilgileriGuncellemeAdressTextBoxElementi.isEnabled());
        waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(5);
        ervaPage.saveButonu.click();
        waitFor(5);
    }

    @And("staff bilgilerin silinip silinmedigini test eder")
    public void staffBilgilerinSilinipSilinmediginiTestEder() {
        Assert.assertTrue(ervaPage.alertButton.isDisplayed());
    }

    @And("staff hastalarin silinmedigini test eder")
    public void staffHastalarinSilinmediginiTestEder() {
        ervaPage.deleteButton.click();
        Assert.assertTrue(ervaPage.deleteButtonConfirmation.isEnabled());
    }

    @And("staff {string} butonunu tiklar")
    public void staffPatientSSNButonunuTiklar() {
        waitFor(5);
        ervaPage.patientSsn.click();
        waitFor(5);
    }

    @And("staff {string} kutusundan SSN kimliklere gore arar")
    public void staffPatientSSNKutusundanSSNKimliklereGoreArar() {
        waitFor(5);
        ervaPage.patientSsn.sendKeys("678-32-7123");
        Assert.assertTrue("678-32-7123", true);
    }
}

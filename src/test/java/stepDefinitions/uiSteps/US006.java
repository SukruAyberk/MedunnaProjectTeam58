package stepDefinitions.uiSteps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ElvinaPage;
import utilities.ReusableMethods;

public class US006 {
    static ElvinaPage elvinaPage = new ElvinaPage();
    // static OrtakLocatePages ortakLocatePages = new OrtakLocatePages();


    @Then("user accont menu-ye tiklar")
    public void userAccontMenuYeTiklar() {
        ReusableMethods.waitForClickablility(elvinaPage.accountMenu, 15);
        elvinaPage.accountMenu.click();


    }

    @Then("user Setting bolumune tiklar")
    public void userSettingBolumuneTiklar() {
        elvinaPage.settingButonu.click();

    }

    @Then("user Setting sayfasını dogrular")
    public void userSettingSayfasınıDogrular() {
        ReusableMethods.waitForVisibility(elvinaPage.settingsForUserText, 4);

    }

    @Then("firstname lastname email bilgilerini dogrular")
    public void firstnameLastnameEmailBilgileriniDogrular() {
        ReusableMethods.waitForClickablility(elvinaPage.firstnameUpdate, 4);


    }

    @Then("user yeni firstname-ni su sekilde girer {string}")
    public void userYeniFirstnameNiSuSekildeGirer(String string) throws InterruptedException {
        Thread.sleep(2000);
        elvinaPage.firstnameUpdate.clear();
        elvinaPage.firstnameUpdate.sendKeys(string);


    }

    @Then("save butonuna tiklar")
    public void saveButonunaTiklar() throws InterruptedException {
        Thread.sleep(2000);
        elvinaPage.saveButonu.click();

    }

    @Then("user sonucu dogrular")
    public void userSonucuDogrular() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(elvinaPage.settingsForUserText.isDisplayed());

    }

    @Then("user yeni lastname-ni su sekilde girer {string}")
    public void userYeniLastnameNiSuSekildeGirer(String string) {

        elvinaPage.lastnameUpdate.clear();
        elvinaPage.lastnameUpdate.sendKeys(string);

    }

    @Then("user yeni email-i su sekilde girer {string}")
    public void userYeniEmailISuSekildeGirer(String string) {
        elvinaPage.eMailUpdate.clear();
        elvinaPage.eMailUpdate.sendKeys(string);
    }
}

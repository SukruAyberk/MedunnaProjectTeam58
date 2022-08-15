package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ElvinaPage;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;

public class US006 {
    static ElvinaPage elvinaPage = new ElvinaPage();
    static OrtakLocatePages ortakLocatePages = new OrtakLocatePages();

    @Given("user {string} anasayfasinda")
    public void user_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
        String expectedUrl = "https://medunna.com/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actuelUrl);
    }

    @Then("user user sembolune tiklar")
    public void user_user_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
        ortakLocatePages.userDropdownDogrulama.isDisplayed();
    }

    @Then("user singIn sekmesi tiklar")
    public void user_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
        ortakLocatePages.signInYazisi.isDisplayed();
    }

    @Then("user gecerli {string} ve {string} ile giris yapar")
    public void user_gecerli_ve_ile_giris_yapar(String newUsername, String newUserPassword) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("newUsername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("newUserPassword"));
    }

    @Then("user sing in butonuna tiklar")
    public void user_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
        ortakLocatePages.userGirisiDogrulama.isDisplayed();
    }

    @Then("user accont menu-ye tiklar")
    public void userAccontMenuYeTiklar() {
        Driver.waitAndClick(elvinaPage.accountMenu);


    }

    @Then("user Setting bolumune tiklar")
    public void userSettingBolumuneTiklar() {
       elvinaPage.settingButonu.click();

    }

    @Then("user Setting sayfasını dogrular")
    public void userSettingSayfasınıDogrular() {
        Driver.waitForVisibility(elvinaPage.settingsForUserText,4);

    }

    @Then("firstname lastname email bilgilerini dogrular")
    public void firstnameLastnameEmailBilgileriniDogrular() {
        Driver.waitForVisibility(elvinaPage.firstnameUpdate,4);


    }

    @And("user sayfayı kapatır")
    public void userSayfayıKapatır() {
        Driver.closeDriver();

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
        elvinaPage.settingsForUserText.isDisplayed();

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

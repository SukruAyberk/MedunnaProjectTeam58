package stepDefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OrtakClass {
    OrtakLocatePages ortakLocatePages = new OrtakLocatePages();

    @Then("profil sembolune tiklar")
    public void admin_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        ReusableMethods.waitFor(2);
    }

    @Then("singIn sekmesi tiklar")
    public void admin_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
    }

    @Then("staff singIn sekmesi tiklar")
    public void staff_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
    }

    //doktor girisi
    @Given("doktor {string} anasayfasinda")
    public void doktor_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
        String expectedUrl = "https://medunna.com/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actuelUrl);
    }

    @Then("doktor profil sembolune tiklar")
    public void doktor_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        ReusableMethods.waitFor(2);
    }

    @Then("doktor singIn sekmesi tiklar")
    public void doktor_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
    }

    @Then("doktor sing in butonuna tiklar")
    public void doktor_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        ReusableMethods.waitFor(2);
    }

    //user girisi
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
        ReusableMethods.waitFor(2);
    }

    @Then("user singIn sekmesi tiklar")
    public void user_sing_in_sekmesi_tiklar() {
        ReusableMethods.waitForVisibility(ortakLocatePages.signInButton1, 15);
        ortakLocatePages.signInButton1.click();
        ReusableMethods.waitForVisibility(ortakLocatePages.signInYazisi, 15);
    }

    @Then("user gecerli {string} ve {string} ile giris yapar")
    public void user_gecerli_ve_ile_giris_yapar(String username, String password) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty(username));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.waitFor(2);
    }

    @Then("user sing in butonuna tiklar")
    public void user_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        ReusableMethods.waitFor(2);
    }


}

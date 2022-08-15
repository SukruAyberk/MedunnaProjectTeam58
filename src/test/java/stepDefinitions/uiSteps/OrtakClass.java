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

    //Admin girisi
    @Given("admin {string} anasayfasinda")
    public void admin_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
        String expectedUrl = "https://medunna.com/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actuelUrl);
    }

    @Then("admin profil sembolune tiklar")
    public void admin_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
        ortakLocatePages.userDropdownDogrulama.isDisplayed();
    }

    @Then("admin singIn sekmesi tiklar")
    public void admin_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
        ortakLocatePages.signInYazisi.isDisplayed();
    }

    //staff girisi
    @Given("staff {string} anasayfasinda")
    public void staff_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(2000);
        String expectedUrl = "https://medunna.com/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actuelUrl);
    }

    @Then("staff profil sembolune tiklar")
    public void staff_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
        ortakLocatePages.userDropdownDogrulama.isDisplayed();
    }

    @Then("staff singIn sekmesi tiklar")
    public void staff_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
        ortakLocatePages.signInYazisi.isDisplayed();
    }

    @Then("staff sing in butonuna tiklar")
    public void staff_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
        ortakLocatePages.staffGirisiDogrulama.isDisplayed();
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
        Thread.sleep(2000);
        ortakLocatePages.userDropdownDogrulama.isDisplayed();
    }

    @Then("doktor singIn sekmesi tiklar")
    public void doktor_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
        ortakLocatePages.signInYazisi.isDisplayed();
    }

    @Then("doktor sing in butonuna tiklar")
    public void doktor_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
        ortakLocatePages.doktorGirisiDogrulama.isDisplayed();
    }

    //hasta  girisi
    @Given("patient {string} anasayfasinda")
    public void patient_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
        String expectedUrl = "https://medunna.com/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actuelUrl);
    }

    @Then("patient profil sembolune tiklar")
    public void patient_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
        ortakLocatePages.userDropdownDogrulama.isDisplayed();
    }

    @Then("patient singIn sekmesi tiklar")
    public void patient_sing_in_sekmesi_tiklar() {
        ortakLocatePages.signInButton1.click();
        ortakLocatePages.signInYazisi.isDisplayed();
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
        Thread.sleep(2000);
        ortakLocatePages.userDropdownDogrulama.isDisplayed();
    }

    @Then("user singIn sekmesi tiklar")
    public void user_sing_in_sekmesi_tiklar() {
        ReusableMethods.waitForVisibility(ortakLocatePages.signInButton1, 15);
        ortakLocatePages.signInButton1.click();
        ReusableMethods.waitForVisibility(ortakLocatePages.signInYazisi, 15);
        ortakLocatePages.signInYazisi.isDisplayed();
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
        Thread.sleep(2000);
        ortakLocatePages.userGirisiDogrulama.isDisplayed();
    }


}

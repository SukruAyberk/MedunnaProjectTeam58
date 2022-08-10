package stepDefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;

public class OrtakClass {
    OrtakLocatePages ortakLocatePages=new OrtakLocatePages();
    //Admin girisi
    @Given("admin {string} anasayfasinda")
    public void admin_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
        String expectedUrl="https://medunna.com/";
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
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
    @Then("admin gecerli {string} ve {string} ile giris yapar")
    public void admin_gecerli_ve_ile_giris_yapar(String adminUsername, String adminPassword) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("adminUsername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @Then("admin sing in butonuna tiklar")
    public void admin_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
        ortakLocatePages.adminGirisDogrulama.isDisplayed();
    }

    //staff girisi
    @Given("staff {string} anasayfasinda")
    public void staff_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(2000);
        String expectedUrl="https://medunna.com/";
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
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
    @Then("staff gecerli {string} ve {string} ile giris yapar")
    public void staff_gecerli_ve_ile_giris_yapar(String PersonelUsername, String PersonelPassword) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("PersonelUsername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("PersonelPassword"));
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
        String expectedUrl="https://medunna.com/";
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
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
    @Then("doktor gecerli {string} ve {string} ile giris yapar")
    public void doktor_gecerli_ve_ile_giris_yapar(String Doctorsername, String DoctorPassword) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("Doctorsername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("DoctorPassword"));
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
        String expectedUrl="https://medunna.com/";
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
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
    @Then("patient gecerli {string} ve {string} ile giris yapar")
    public void patient_gecerli_ve_ile_giris_yapar(String HastaUsername, String HastaPassword) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("HastaUsername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("HastaPassword"));
    }
    @Then("patient sing in butonuna tiklar")
    public void patient_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
        ortakLocatePages.hastaGirisiDogrulama.isDisplayed();
    }

    //user girisi
    @Given("user {string} anasayfasinda")
    public void user_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
        String expectedUrl="https://medunna.com/";
        String actuelUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
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


}

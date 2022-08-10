package stepDefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    }
    @Then("admin profil sembolune tiklar")
    public void admin_profil_sembolune_tiklar() throws InterruptedException {
       ortakLocatePages.profilSimgesi.click();
       Thread.sleep(2000);
    }
    @Then("admin singIn butonuna tiklar")
    public void adminSingInButonunaTiklar() {
        ortakLocatePages.signInButton1.click();
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
    }

    //staff girisi
    @Given("staff {string} anasayfasinda")
    public void staff_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(2000);
    }
    @Then("staff profil sembolune tiklar")
    public void staff_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
    }
    @Then("staff singIn butonuna tiklar")
    public void staff_sing_ın_butonuna_tiklar() {
      ortakLocatePages.signInButton1.click();
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
    }

    //doktor girisi
    @Given("doktor {string} anasayfasinda")
    public void doktor_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
    }
    @Then("doktor profil sembolune tiklar")
    public void doktor_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
    }
    @Then("doktor singIn butonuna tiklar")
    public void doktorSingInButonunaTiklar() {
        ortakLocatePages.signInButton1.click();
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
    }

    //hasta  girisi
    @Given("patient {string} anasayfasinda")
    public void patient_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
    }
    @Then("patient profil sembolune tiklar")
    public void patient_profil_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
    }
    @Then("patient singIn butonuna tiklar")
    public void patientSingInButonunaTiklar() {
        ortakLocatePages.signInButton1.click();
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
    }

    //user girisi
    @Given("user {string} anasayfasinda")
    public void user_anasayfasinda(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        Thread.sleep(2000);
    }
    @Then("user user sembolune tiklar")
    public void user_user_sembolune_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
    }
    @Then("user singIn butonuna tiklar")
    public void userSingInButonunaTiklar() {
        ortakLocatePages.signInButton1.click();
    }
    @Then("user gecerli {string} ve {string} ile giris yapar")
    public void user_gecerli_ve_ile_giris_yapar(String UserInvalidUsername, String UserInvalidPassword) {
        ortakLocatePages.usernameBox.sendKeys(ConfigReader.getProperty("UserInvalidUsername"));
        ortakLocatePages.passwordBox.sendKeys(ConfigReader.getProperty("UserInvalidPassword"));
    }
    @Then("user sing in butonuna tiklar")
    public void user_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
    }


}

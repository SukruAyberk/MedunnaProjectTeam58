package stepDefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.RecepTPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001 {
    RecepTPage recepPage = new RecepTPage();
    Faker fake;


    @Given("Kullanici Medunna ana sayfasina gider")
    public void kullanici_medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Kullanici Register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        recepPage.girisDropdown.click();
        recepPage.registerButton.click();
        ReusableMethods.waitFor(3);

    }

    @Given("Kullanici SSN kutusuna geçerli bir {string} numarasi girer")
    public void kullanici_ssn_kutusuna_geçerli_bir_numarasi_girer(String SSN) {
        SSN = ReusableMethods.createSSN();
        recepPage.ssnTextBox.sendKeys(SSN);


    }

    @Given("Kullanici firstname kutusuna geçerli bir {string} girer")
    public void kullanici_firstname_kutusuna_geçerli_bir_girer(String firstname) {
        fake = new Faker();
        firstname = fake.name().firstName();
        recepPage.firstNameTextBox.sendKeys(firstname);
    }

    @Given("Kullanici lastname kutusuna geçerli bir {string} girer")
    public void kullanici_lastname_kutusuna_geçerli_bir_girer(String lastname) {
        fake = new Faker();
        lastname = fake.name().lastName();
        recepPage.lastNameTextBox.sendKeys(lastname);
    }

    @Given("Kullanici username kutusuna geçerli bir {string} girer")
    public void kullanici_username_kutusuna_geçerli_bir_girer(String username) {
        fake = new Faker();
        username = fake.name().username();
        recepPage.userNameTextBox.sendKeys(username);
    }

    @Given("Kullanici email kutusuna geçerli bir {string} girer")
    public void kullanici_email_kutusuna_geçerli_bir_girer(String email) {
        fake = new Faker();
        email = fake.internet().emailAddress();
        recepPage.emailTextBox.sendKeys(email);
    }

    @Given("Kullanici password kutusuna geçerli bir {string} girer")
    public void kullanici_password_kutusuna_geçerli_bir_girer(String password) {
        recepPage.firstPasswordTextBox.sendKeys(ConfigReader.getProperty("UserPassword"));
        recepPage.secondPasswordTextBox.sendKeys(ConfigReader.getProperty("UserPassword"));
    }

    @Then("Kullanici register butonuna tıklar")
    public void kullanici_register_butonuna_tıklar() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", recepPage.registerSubmitButton);
    }

    @Then("Kullanici Registitaion Saved yazisinin gorunur oldugunu dogrular")
    public void kullanici_registitaion_saved_yazisinin_gorunur_oldugunu_dogrular() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(recepPage.successMessageToastContainer.isDisplayed());
    }

    @Given("Kullanici SSN kutusuna geçersiz bir {string} numarasi girer")
    public void kullanici_ssn_kutusuna_geçersiz_bir_numarasi_girer(String invalidSSN) {
        invalidSSN = "123456789";
        recepPage.ssnTextBox.sendKeys(invalidSSN);
    }

    @Then("Kullanici SSN hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_ssn_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorInvalidSsnMessage.isDisplayed());
    }

    @Given("Kullanici SSN kutusunu bos birakir")
    public void kullanici_ssn_kutusunu_bos_birakir() {
        recepPage.ssnTextBox.sendKeys("");
    }

    @Then("Kullanici bos SSN hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_ssn_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorBlankSsnMessage.isDisplayed());
    }

    @Given("Kullanici firstname kutusunu bos birakir")
    public void kullanici_firstname_kutusunu_bos_birakir() {
        recepPage.firstNameTextBox.sendKeys("");
    }

    @Then("Kullanici bos firstname hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_firstname_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorFirstNameMessage.isDisplayed());
    }

    @Given("Kullanici lastname kutusunu bos birakir")
    public void kullanici_lastname_kutusunu_bos_birakir() {
        recepPage.lastNameTextBox.sendKeys("");
    }

    @Then("Kullanici bos lastname hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_lastname_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorLastNameMessage.isDisplayed());
    }

    @Given("Kullanici username kutusunu bos birakir")
    public void kullanici_username_kutusunu_bos_birakir() {
        recepPage.userNameTextBox.sendKeys("");
    }

    @Then("Kullanici bos username hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_username_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorBlankUsernameMessage.isDisplayed());
    }

    @Given("Kullanici email kutusunu bos birakir")
    public void kullanici_email_kutusunu_bos_birakir() {
        recepPage.emailTextBox.sendKeys("");
    }

    @Then("Kullanici bos email hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_email_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorBlankEmailMessage.isDisplayed());
    }

    @Given("Kullanici email kutusuna gecersiz bir {string} girer")
    public void kullanici_email_kutusuna_gecersiz_bir_girer(String invalidEmail) {
        invalidEmail = "medunna.com";
        recepPage.emailTextBox.sendKeys(invalidEmail);
    }

    @Then("Kullanici gecersiz email hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_gecersiz_email_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorInvalidEmailMessage.isDisplayed());
    }


    @And("Kullanici SSN kutusuna dokuz ile başlayan bir {string} numarasi girer")
    public void kullaniciSSNKutusunaDokuzIleBaşlayanBirNumarasiGirer(String SSN) {
        SSN = ReusableMethods.invalidSSN();
        recepPage.ssnTextBox.sendKeys(SSN);

    }
}

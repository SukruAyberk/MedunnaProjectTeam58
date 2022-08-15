package stepDefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.RecepTPage;
import utilities.Driver;

public class US002 {
    RecepTPage recepPage = new RecepTPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Kullanici email kutusunu bos birakir")
    public void kullanici_email_kutusunu_bos_birakir() {
        js.executeScript("arguments[0].scrollIntoView(true);", recepPage.emailTextBox);
        recepPage.emailTextBox.sendKeys("");
    }

    @Then("Kullanici bos email hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_email_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorBlankEmailMessage.isDisplayed());
    }

    @Given("Kullanici email kutusuna gecersiz bir {string} girer")
    public void kullanici_email_kutusuna_gecersiz_bir_girer(String invalidEmail) {
        invalidEmail = "medunna.com";
        js.executeScript("arguments[0].scrollIntoView(true);", recepPage.emailTextBox);
        recepPage.emailTextBox.sendKeys(invalidEmail);
    }

    @Then("Kullanici gecersiz email hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_gecersiz_email_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorInvalidEmailMessage.isDisplayed());
    }

    @Given("Kullanici username kutusunu bos birakir")
    public void kullanici_username_kutusunu_bos_birakir() {
        js.executeScript("arguments[0].scrollIntoView(true);", recepPage.userNameTextBox);
        recepPage.userNameTextBox.sendKeys("");
    }
    @Then("Kullanici bos username hata mesajinin gorunur oldugunu dogrular")
    public void kullanici_bos_username_hata_mesajinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(recepPage.errorBlankUsernameMessage.isDisplayed());
    }
}

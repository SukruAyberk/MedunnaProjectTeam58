package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AyberkPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US004 {

    AyberkPage ayberk = new AyberkPage();

    @Then("kullanici sing in butonuna basar")
    public void kullanici_sing_in_butonuna_basar() {
        ayberk.sing_in_button1.click();
    }

    @Then("beni hatirla secenegi oldugu kontrol eder")
    public void beni_hatirla_secenegi_oldugu_kontrol_eder() {
        Assert.assertTrue(ayberk.rememberMe_checkbox.isEnabled());
    }


    @Then("Did you forget your password secenegi oldugu kontrol eder")
    public void did_you_forget_your_password_secenegi_oldugu_kontrol_eder() {
        Assert.assertTrue(ayberk.did_you_forget_your_password_button.isEnabled());
    }

    @Then("Cancel butonu oldugu kontrol eder")
    public void cancel_butonu_oldugu_kontrol_eder() {
        Assert.assertTrue(ayberk.cancel_button.isEnabled());
    }

    @Then("giris yaptigini dogrular")
    public void giris_yaptigini_dogrular() {
        ReusableMethods.waitForClickablility(ayberk.userTeam58_symbol, 15);
        ayberk.userTeam58_symbol.click();
        Assert.assertTrue(ayberk.sing_out_button.isEnabled());
        ayberk.sing_out_button.click();
    }

    @And("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        ReusableMethods.waitForVisibility(ayberk.giris_yapilamadi_mesaji, 10);
        Assert.assertTrue(ayberk.giris_yapilamadi_mesaji.isDisplayed());
    }


    @And("gecersiz username {string} girer")
    public void gecersizUsernameGirer(String username) {
        ayberk.email.sendKeys(ConfigReader.getProperty(username));

    }

    @And("gecersiz password {string} girer")
    public void gecersizPasswordGirer(String password) {
        ayberk.password.sendKeys(ConfigReader.getProperty(password));
    }

    @And("singin butonuna basar")
    public void singinButonunaBasar() {
        ayberk.sing_in_button2.click();
    }
}

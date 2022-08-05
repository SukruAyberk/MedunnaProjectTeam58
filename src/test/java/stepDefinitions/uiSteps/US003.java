package stepDefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class US003 {

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
    @Then("kullanici user sembolune basar")
    public void kullanici_user_sembolune_basar() {

    }
    @Then("kullanici {string} butonuna basar")
    public void kullanici_butonuna_basar(String string) {

    }
    @Then("password strength seviyesinin degistigini kontrol eder")
    public void password_strength_seviyesinin_degistigini_kontrol_eder() {

    }

}

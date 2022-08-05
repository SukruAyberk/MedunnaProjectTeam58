package stepDefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AyberkPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US003 {

    AyberkPage ayberk = new AyberkPage();
    Faker faker = new Faker();

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("kullanici user sembolune basar")
    public void kullanici_user_sembolune_basar() {
        ayberk.user_symbol.click();
    }
    @Then("kullanici {string} butonuna basar")
    public void kullanici_butonuna_basar(String string){
        ayberk.register_button.click();
    }
    @Then("password strength seviyesinin degistigini kontrol eder")
    public void password_strength_seviyesinin_degistigini_kontrol_eder() {
        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String expectedStrengthBar1 = "background-color: rgb(255, 0, 0);";
        

    }

}

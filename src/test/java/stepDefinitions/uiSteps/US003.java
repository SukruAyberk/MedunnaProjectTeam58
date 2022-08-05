package stepDefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.AyberkPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class US003 {

    AyberkPage ayberk = new AyberkPage();
    Faker faker = new Faker();

    String password;
    String kucuk;
    String buyuk;
    String sayi;
    String ozel;

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("kullanici user sembolune basar")
    public void kullanici_user_sembolune_basar() {
        ayberk.user_symbol.click();
    }

    @Then("kullanici {string} butonuna basar")
    public void kullanici_butonuna_basar(String string) {
        ayberk.register_button.click();
    }

    @Then("kucuk harf eklenince password strength kontrol eder")
    public void kucuk_harf_eklenince_password_strength_kontrol_eder() throws InterruptedException {
        kucuk = faker.name().firstName().toLowerCase();
        ayberk.new_password_textbox.sendKeys(kucuk);

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");
        String expectedStrengthBar1 = "background-color: rgb(255, 0, 0);";
        String expectedStrengthBar2 = "background-color: rgb(221, 221, 221);";
        String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
        String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
        String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
        softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
        softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
        softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
        softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
        softAssert.assertAll();

        Thread.sleep(2000);
        System.out.println("Küçük eklenmiş: " + kucuk);
    }

    @Then("buyuk harf eklenince password strength kontrol eder")
    public void buyuk_harf_eklenince_password_strength_kontrol_eder() throws InterruptedException {
        buyuk = faker.name().firstName().toUpperCase();
        ayberk.new_password_textbox.sendKeys(buyuk);

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");
        String expectedStrengthBar1 = "background-color: rgb(255, 153, 0);";
        String expectedStrengthBar2 = "background-color: rgb(255, 153, 0);";
        String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
        String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
        String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
        softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
        softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
        softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
        softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
        softAssert.assertAll();

        Thread.sleep(2000);
        System.out.println("Büyük eklenmiş: " + kucuk + buyuk);
    }

    @Then("sayi eklenince password strength kontrol eder")
    public void sayi_eklenince_password_strength_kontrol_eder() throws InterruptedException {
        sayi = "356";
        ayberk.new_password_textbox.sendKeys(sayi);

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");
        String expectedStrengthBar1 = "background-color: rgb(153, 255, 0);";
        String expectedStrengthBar2 = "background-color: rgb(153, 255, 0);";
        String expectedStrengthBar3 = "background-color: rgb(153, 255, 0);";
        String expectedStrengthBar4 = "background-color: rgb(153, 255, 0);";
        String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
        softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
        softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
        softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
        softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
        softAssert.assertAll();

        Thread.sleep(2000);
        System.out.println("Sayı eklenmiş: " + kucuk + buyuk + sayi);
    }

    @Then("ozel karakter password strength kontrol eder")
    public void ozel_karakter_password_strength_kontrol_eder() throws InterruptedException {
        ozel = "*";
        ayberk.new_password_textbox.sendKeys(ozel);

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");
        String expectedStrengthBar1 = "background-color: rgb(0, 255, 0);";
        String expectedStrengthBar2 = "background-color: rgb(0, 255, 0);";
        String expectedStrengthBar3 = "background-color: rgb(0, 255, 0);";
        String expectedStrengthBar4 = "background-color: rgb(0, 255, 0);";
        String expectedStrengthBar5 = "background-color: rgb(0, 255, 0);";


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
        softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
        softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
        softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
        softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
        softAssert.assertAll();

        Thread.sleep(2000);
        System.out.println("Özel eklenmiş: " + kucuk + buyuk + sayi + ozel);
    }

    @Then("password uzunlugu en az {int} oldugunu kontrol eder")
    public void password_uzunlugu_en_az_oldugunu_kontrol_eder(Integer expectedPasswordLength) {
        password = kucuk + buyuk + sayi + ozel;
        System.out.println("Son hal: " + password);
        int actualPasswordLength = password.length();
        System.out.println(actualPasswordLength);
        Assert.assertTrue(actualPasswordLength >= expectedPasswordLength);
    }


}

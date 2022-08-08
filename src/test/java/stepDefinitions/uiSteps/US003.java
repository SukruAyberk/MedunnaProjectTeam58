package stepDefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.AyberkPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US003 {

    AyberkPage ayberk = new AyberkPage();
    Faker faker = new Faker();

    String password = "";
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

    @And("kullanici register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
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

        Thread.sleep(1000);
        System.out.println("kucuk eklenmiş: " + kucuk);

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

        Thread.sleep(1000);
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

        Thread.sleep(1000);
        System.out.println("Sayı eklenmiş: " + kucuk + buyuk + sayi);
    }

    @Then("ozel karakter password strength kontrol eder")
    public void ozel_karakter_password_strength_kontrol_eder() {
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

    @And("kucuk harf {string} eklenince password strength kontrol eder")
    public void kucukHarfEklenincePasswordStrengthKontrolEder(String kucukHarf) throws InterruptedException {
        kucuk = kucukHarf;
        password += kucuk;
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

        Thread.sleep(1000);
        System.out.println("kucuk eklenmiş: " + password);

        //Scenariou outline ile yap
        //A, AA, AAA, AAAA, AAAAA, AAAAAA, AAAAAAA
        //5, 55, 555, 5555, 55555, 555555, 5555555
        //-, --, ---, ----, -----, ------, -------
        //Aşağıdaki durumlar için if else ile yap durumları kontrol et daha dinamik olur

        /*
        1. durum
        aA5-

        2. durum
        aaAA55-

        3. durum
        aaaAAA5-

        4. durum
        aaaaAAAA5-

        Bu 5 durum yeterli

         */


    }

    @And("buyuk harf {string} eklenince password strength kontrol eder")
    public void buyukHarfEklenincePasswordStrengthKontrolEder(String buyukHarf) throws InterruptedException {
        buyuk = buyukHarf;
        password += buyuk;
        ayberk.new_password_textbox.sendKeys(buyuk);

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");

        SoftAssert softAssert = new SoftAssert();

        if (password.length() < 7) {
            String expectedStrengthBar1 = "background-color: rgb(255, 0, 0);";
            String expectedStrengthBar2 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
            softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
            softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
            softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
            softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
            softAssert.assertTrue(password.length() < 7);
        } else if (password.length() >= 7) {
            String expectedStrengthBar1 = "background-color: rgb(255, 153, 0);";
            String expectedStrengthBar2 = "background-color: rgb(255, 153, 0);";
            String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
            softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
            softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
            softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
            softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
            softAssert.assertTrue(password.length() >= 7);
        }
        softAssert.assertAll();

        Thread.sleep(1000);
        System.out.println("buyuk eklenmiş: " + password);

    }

    @And("{string} eklenince password strength kontrol eder")
    public void eklenincePasswordStrengthKontrolEder(String sayii) throws InterruptedException {
        sayi = sayii;
        password += sayi;
        ayberk.new_password_textbox.sendKeys(sayi);

        SoftAssert softAssert = new SoftAssert();

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");

        if (password.length() < 7) {
            String expectedStrengthBar1 = "background-color: rgb(255, 0, 0);";
            String expectedStrengthBar2 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
            softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
            softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
            softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
            softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
            softAssert.assertTrue(password.length() < 7);
        } else if (password.length() >= 7) {
            String expectedStrengthBar1 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar2 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar3 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar4 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
            softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
            softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
            softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
            softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
            softAssert.assertTrue(password.length() >= 7);
        }
        softAssert.assertAll();

        Thread.sleep(1000);
        System.out.println("sayi eklenmiş: " + password);

    }


    @And("ozel karakter {string} password strength kontrol eder")
    public void ozelKarakterPasswordStrengthKontrolEder(String ozelKarakter) throws InterruptedException {
        ozel = ozelKarakter;
        password += ozelKarakter;
        ayberk.new_password_textbox.sendKeys(ozel);

        SoftAssert softAssert = new SoftAssert();

        String actualStrengthBar1 = ayberk.strength_bar1.getAttribute("style");
        String actualStrengthBar2 = ayberk.strength_bar2.getAttribute("style");
        String actualStrengthBar3 = ayberk.strength_bar3.getAttribute("style");
        String actualStrengthBar4 = ayberk.strength_bar4.getAttribute("style");
        String actualStrengthBar5 = ayberk.strength_bar5.getAttribute("style");

        if (password.length() < 7) {
            String expectedStrengthBar1 = "background-color: rgb(255, 0, 0);";
            String expectedStrengthBar2 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
            softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
            softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
            softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
            softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
            softAssert.assertTrue(password.length() < 7);
        } else if (password.length() >= 7) {
            String expectedStrengthBar1 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar2 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar3 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar4 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar5 = "background-color: rgb(0, 255, 0);";

            softAssert.assertEquals(actualStrengthBar1, expectedStrengthBar1);
            softAssert.assertEquals(actualStrengthBar2, expectedStrengthBar2);
            softAssert.assertEquals(actualStrengthBar3, expectedStrengthBar3);
            softAssert.assertEquals(actualStrengthBar4, expectedStrengthBar4);
            softAssert.assertEquals(actualStrengthBar5, expectedStrengthBar5);
            softAssert.assertTrue(password.length() >= 7);
        }
        softAssert.assertAll();

        Thread.sleep(1000);
        System.out.println("ozel eklenmiş: " + password);
    }


}

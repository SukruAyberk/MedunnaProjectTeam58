package stepDefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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

        Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
        Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
        Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
        Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
        Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);

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

        if (password.length() < 7) {
            String expectedStrengthBar1 = "background-color: rgb(255, 0, 0);";
            String expectedStrengthBar2 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
            Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
            Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
            Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
            Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);
            Assert.assertTrue(password.length() < 7);
        } else if (password.length() >= 7) {
            String expectedStrengthBar1 = "background-color: rgb(255, 153, 0);";
            String expectedStrengthBar2 = "background-color: rgb(255, 153, 0);";
            String expectedStrengthBar3 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar4 = "background-color: rgb(221, 221, 221);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
            Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
            Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
            Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
            Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);
            Assert.assertTrue(password.length() < 7);
        }

        Thread.sleep(1000);
        System.out.println("buyuk eklenmiş: " + password);

    }

    @And("{string} eklenince password strength kontrol eder")
    public void eklenincePasswordStrengthKontrolEder(String sayii) throws InterruptedException {
        sayi = sayii;
        password += sayi;
        ayberk.new_password_textbox.sendKeys(sayi);

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

            Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
            Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
            Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
            Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
            Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);
            Assert.assertTrue(password.length() < 7);
        } else if (password.length() >= 7) {
            String expectedStrengthBar1 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar2 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar3 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar4 = "background-color: rgb(153, 255, 0);";
            String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";

            Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
            Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
            Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
            Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
            Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);
            Assert.assertTrue(password.length() >= 7);
        }

        Thread.sleep(1000);
        System.out.println("sayi eklenmiş: " + password);

    }


    @And("ozel karakter {string} password strength kontrol eder")
    public void ozelKarakterPasswordStrengthKontrolEder(String ozelKarakter) throws InterruptedException {
        ozel = ozelKarakter;
        password += ozelKarakter;
        ayberk.new_password_textbox.sendKeys(ozel);

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

            Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
            Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
            Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
            Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
            Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);
            Assert.assertTrue(password.length() < 7);
        } else if (password.length() >= 7) {
            String expectedStrengthBar1 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar2 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar3 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar4 = "background-color: rgb(0, 255, 0);";
            String expectedStrengthBar5 = "background-color: rgb(0, 255, 0);";

            Assert.assertEquals(expectedStrengthBar1, actualStrengthBar1);
            Assert.assertEquals(expectedStrengthBar2, actualStrengthBar2);
            Assert.assertEquals(expectedStrengthBar3, actualStrengthBar3);
            Assert.assertEquals(expectedStrengthBar4, actualStrengthBar4);
            Assert.assertEquals(expectedStrengthBar5, actualStrengthBar5);
            Assert.assertTrue(password.length() >= 7);
        }

        Thread.sleep(1000);
        System.out.println("ozel eklenmiş: " + password);
    }


}

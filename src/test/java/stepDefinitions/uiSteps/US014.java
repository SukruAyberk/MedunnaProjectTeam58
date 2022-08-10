package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CigdemAPage;
import pages.OrtakLocatePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US014 {

    static CigdemAPage cigdemAPage = new CigdemAPage();
   static OrtakLocatePages ortakLocatePages = new OrtakLocatePages();

    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
        ortakLocatePages.signInButton1.click();
        Thread.sleep(2000);
        ortakLocatePages.usernameBox.sendKeys("cigdemgurbuz");
        ortakLocatePages.passwordBox.sendKeys("1qaz2wsx.C");
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
        ortakLocatePages.myPagesButonu.click();
        Thread.sleep(2000);
        cigdemAPage.myInpatientButonu.click();
        Thread.sleep(2000);
        cigdemAPage.hastaIdListesi.isEmpty();
        cigdemAPage.startDateList.isEmpty();
        cigdemAPage.endDateList.isEmpty();
        cigdemAPage.descriptionList2.isEmpty();
        cigdemAPage.createDateList.isEmpty();
        cigdemAPage.appointmentList.isEmpty();
        cigdemAPage.statusList.isEmpty();
        cigdemAPage.roomList.isEmpty();
        cigdemAPage.patientList.isEmpty();



        cigdemAPage.inpatientEditButton.click();
        Thread.sleep(2000);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Select select=new Select(cigdemAPage.statusSekmesi);
        List<WebElement> statuler=select.getOptions();
        for (WebElement each: statuler
        ) {
            each.click();
        }
        System.out.println("statuler = " + statuler);
        Driver.closeDriver();
    }
   /* @Given("kullanici Url'e gider")
    public void kullanici_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("kullanici profil simgesine tiklar")
    public void kullanici_profil_simgesine_tiklar() throws InterruptedException {
        ortakLocatePages.profilSimgesi.click();
        Thread.sleep(2000);
    }

    @Then("kullanici sing in butonuna tiklar")
    public void kullanici_sing_in_butonuna_tiklar() throws InterruptedException {
        ortakLocatePages.signInSekmesi1.click();
        Thread.sleep(2000);
    }

    @Then("kullanici gecerli username ve password ile giris yapar")
    public void kullanici_gecerli_username_ve_password_ile_giris_yapar() throws InterruptedException {
        ortakLocatePages.usernameBox.sendKeys("cigdemgurbuz");
        ortakLocatePages.passwordBox.sendKeys("1qaz2wsx.C");
        ortakLocatePages.signInButonu2.submit();
        Thread.sleep(2000);
    }

    @Then("kullanici My Pages menusune tiklar")
    public void kullanici_my_pages_menusune_tiklar() throws InterruptedException {
        ortakLocatePages.myPagesButonu.click();
        Thread.sleep(2000);
    }*/

    @Then("kullanici My Inpatients sekmesine tiklar")
    public void kullanici_my_inpatients_sekmesine_tiklar() throws InterruptedException {

       // ortakLocatePages.myInpatientButonu.click();
       // Thread.sleep(5000);
       /* JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("document.getElementByName('cigdemAPage.myInpatientButton').click();");*/
       ReusableMethods.waitForVisibility(cigdemAPage.myInpatientButonu, 15);
       cigdemAPage.myInpatientButonu.click();
       //Thread.sleep(2000);
    }

    @Then("kullanici hastalara ait bilgilerini goruntuler")
    public void kullanici_hastalara_ait_bilgilerini_goruntuler() {
        cigdemAPage.hastaIdListesi.isEmpty();
        cigdemAPage.startDateList.isEmpty();
        cigdemAPage.endDateList.isEmpty();
        cigdemAPage.descriptionList2.isEmpty();
        cigdemAPage.createDateList.isEmpty();
        cigdemAPage.appointmentList.isEmpty();
        cigdemAPage.statusList.isEmpty();
        cigdemAPage.roomList.isEmpty();
        cigdemAPage.patientList.isEmpty();

    }

    @And("kullanici status menusunu gunceller")
    public void kullaniciStatusMenusunuGunceller() {

        for (WebElement each: cigdemAPage.statusList
             ) {
            each.click();
        }
    }

    @And("kullanici My Inpatients sayfasinda Edit e tiklar")
    public void kullaniciMyInpatientsSayfasindaEditETiklar() throws InterruptedException {
        cigdemAPage.inpatientEditButton.click();
        Thread.sleep(2000);
    }
}

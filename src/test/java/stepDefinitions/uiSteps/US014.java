package stepDefinitions.uiSteps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CigdemAPage;
import pages.OrtakLocatePages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US014 {

    static CigdemAPage cigdemAPage = new CigdemAPage();
    static OrtakLocatePages ortakLocatePages = new OrtakLocatePages();
    static Actions action = new Actions(Driver.getDriver());

    @Then("doktor My Inpatients sekmesine tiklar")
    public void doktor_my_inpatients_sekmesine_tiklar() {
      ReusableMethods.waitForVisibility(cigdemAPage.myInpatientButonu,15);
      cigdemAPage.myInpatientButonu.click();
      Assert.assertTrue(cigdemAPage.inPatientYazisi.isDisplayed());
    }
    @Then("doktor hastalara ait bilgilerini goruntuler")
    public void doktor_hastalara_ait_bilgilerini_goruntuler() {
        WebElement hastaBilgiTablosu = ReusableMethods.waitForVisibility(cigdemAPage.hastaBilgileri, 10);
        System.out.println(hastaBilgiTablosu.getText());
        Assert.assertTrue(cigdemAPage.hastaBilgileri.isDisplayed());

    }
    @Then("doktor My Inpatients sayfasinda Edit e tiklar")
    public void doktor_my_ınpatients_sayfasinda_edit_e_tiklar() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(cigdemAPage.inpatientEditButton, 15);
        cigdemAPage.inpatientEditButton.click();
        Assert.assertTrue(cigdemAPage.createOrEditInpatientYazisi.isDisplayed());
    }
    @Then("doktor status menusunu gunceller")
    public void doktor_status_menusunu_gunceller() {

        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(cigdemAPage.statusSekmesi,15);
        Select select=new Select(cigdemAPage.statusSekmesi);
        List<WebElement> statuler=select.getOptions();
        for (WebElement each: statuler
        ) {
            each.click();
        }
        System.out.println("statuler = " + statuler);

    }
    @Then("doktor rezerve edilmis odayı günceller")
    public void doktor_rezerve_edilmis_odayı_günceller() {

        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(cigdemAPage.roomSekmesi,15);
        Select select=new Select(cigdemAPage.roomSekmesi);
        List<WebElement> rooms=select.getOptions();
        for(WebElement each : rooms){
            if(each.getText().contains("UNAVAILABLE")){
                each.click();
                break;
            }
        }
        action.sendKeys(Keys.ARROW_DOWN);

        Assert.assertFalse(cigdemAPage.roomGuncellemeYazisi.isDisplayed());

        String hastaRoomId=cigdemAPage.hastaRoomId.getText();
        System.out.println("hastaRoomId = " + hastaRoomId);
 //Doktor rezerve edilmis odayı guncellemek istediginde bos oda varsa onu ataybiliyor, guncelleme mesaji gelemesine ragmen oda numarasi degismiyor!!!
    }


}

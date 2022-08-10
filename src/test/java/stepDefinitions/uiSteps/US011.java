package stepDefinitions.uiSteps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.RecepCPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static utilities.ReusableMethods.*;

public class US011 {
    RecepCPage medunnaPage = new RecepCPage();

  // @Given("Doktor {string} anasayfasinda")
  // public void doktor_anasayfasinda(String istenenurl) {
  //     Driver.getDriver().get(ConfigReader.getProperty(istenenurl));
  // }

  // @Then("Doktor user sembolune basar")
  // public void doktor_user_sembolune_basar() {
  //     medunnaPage.account.click();
  // }

  // @And("Doktor Signin butonuna basar")
  // public void doktorSigninButonunaBasar() {
  //     medunnaPage.girisSignin.click();
  // }

  // @Then("Doktor {string} username , {string} paswordu girer ve Sign in butonunu tiklar")
  // public void doktor_username_paswordu_girer_ve_sign_in_butonunu_tiklar(String username, String password) {
  //     medunnaPage.username.sendKeys(ConfigReader.getProperty(username));
  //     medunnaPage.password.sendKeys(ConfigReader.getProperty(password));
  //     medunnaPage.kullaniciSigninButton.click();
  // }

    @Then("Doktor My Pages menusunden My Appointments butonunu tiklar")
    public void doktor_my_pages_menusunden_my_appointments_butonunu_tiklar() {
        waitFor(3);
        medunnaPage.myPagesMenu.click();
        medunnaPage.myAppointments.click();
    }

    @Then("Doktor {string} id nolu hastasinin Edit buttonuna tiklar")
    public void doktorIdNoluHastasininEditButtonunaTiklar(String istenenHastaId) {
        waitFor(3);
        int count = 1;
        List<WebElement> idList = medunnaPage.idTabloList;
        for (WebElement each : idList) {
            if (each.getText().equals(istenenHastaId)) break;
            count++;
        }
        Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[13]")).click();
    }

    @Then("Doktor Save buttonuna tiklar")
    public void doktor_save_buttonuna_tiklar() {
        medunnaPage.saveButton.click();
    }

    @And("Doktor kayit yapildigini test eder.")
    public void doktorKayitYapildiginiTestEder() {
        waitFor(3);
        String expectedMessage = "The Appointment is updated with identifier";
        String actualMessage = medunnaPage.editSaveOnay.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @And("Doktor Sayfayi kapatir")
    public void doktorSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Doktor Guncellenen {string} hastasinin ID, Start DateTime, End DateTime, Status, Physician, Patient gurundugunu dogrular")
    public void doktorGuncellenenHastasininIDStartDateTimeEndDateTimeStatusPhysicianPatientGurundugunuDogrular(String istenenHastaId) throws InterruptedException {
        Thread.sleep(2000);
        int count = 1;
        List<WebElement> idList = medunnaPage.idTabloList;
        for (WebElement each : idList) {
            if (each.getText().equals(istenenHastaId)) break;
            count++;
        }
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]")).isDisplayed(), "ID Görüntülenemiyor"); // ID
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[2]")).isDisplayed(), "Start DateTime Görüntülenemiyor"); // Start DateTime
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[3]")).isDisplayed(), "End DateTime Görüntülenemiyor"); // End DateTime
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[4]")).isDisplayed(), "Status Görüntülenemiyor"); // Status
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[11]")).isDisplayed(), "Physician Görüntülenemiyor"); // Physician
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[12]")).isDisplayed(), "Patient Görüntülenemiyor"); // Patient
        softAssert.assertAll();
    }

    @And("Doktor Anamnesis, Treatment, Diagnosis'e veri girildigini dogrular")
    public void doktorAnamnesisTreatmentDiagnosisEVeriGirildiginiDogrular() {
        waitFor(3);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(medunnaPage.anamnesisTextBox.getAttribute("class").equals("is-untouched is-pristine av-valid form-control"), "Anamnesis doldurulmak zorundadır");
        softAssert.assertTrue(medunnaPage.treatmentTextBox.getAttribute("class").equals("is-untouched is-pristine av-valid form-control"), "Treatment doldurulmak zorundadır");
        softAssert.assertTrue(medunnaPage.diagnosisTextBox.getAttribute("class").equals("is-untouched is-pristine av-valid form-control"), "Diagnosis doldurulmak zorundadır");
        softAssert.assertAll();
    }

    @Then("Doktor Prescription, Description veri girilmedigini dogrular")
    public void doktorPrescriptionDescriptionVeriGirilmediginiDogrular() {
        waitFor(3);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(medunnaPage.prescriptionTextBox.getText().isEmpty(), "Prescription boş bırakılmalı");
        softAssert.assertTrue(medunnaPage.descriptiontionTextBox.getText().isEmpty(), "Description boş bırakılmalı");
        softAssert.assertAll();
    }

    @Then("Doktor Prescription, Description veri girisi yapildigini dogrular")
    public void doktorPrescriptionDescriptionVeriGirisiYapildiginiDogrular() {
        waitFor(3);
        medunnaPage.prescriptionTextBox.sendKeys("Yok");
        medunnaPage.descriptiontionTextBox.sendKeys("Yok");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(!medunnaPage.prescriptionTextBox.getText().isEmpty(), "Prescription veri girilmeli");
        softAssert.assertTrue(!medunnaPage.descriptiontionTextBox.getText().isEmpty(), "Description veri girilmeli");
        softAssert.assertAll();
    }

    @Then("Doktor Status'a {string} secebildigini test eder")
    public void doktorStatusASecebildiginiTestEder(String istenenDurum) {
        waitFor(3);
        System.out.println("istenenDurum = " + istenenDurum);
        WebElement ddmStatus = medunnaPage.statusTextBox;
        Select options = new Select(ddmStatus);
        options.selectByVisibleText(istenenDurum);
    }

    @And("Doktor Create or Edit an Appointment sayfasinin acildigini test eder")
    public void doktorCreateOrEditAnAppointmentSayfasininAcildiginiTestEder() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(medunnaPage.createOrEditPageYazi.getText().equals("Create or Edit an Appointment"), "Create or Edit an Appointment Sayfası açılamadı");
        softAssert.assertAll();
    }


}

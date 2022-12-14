package stepDefinitions.uiSteps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.RecepCPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.*;

public class US011 {
    RecepCPage medunnaPage = new RecepCPage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

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
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        WebElement editlenecekHasta = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[13]//span/span"));
        js.executeScript("arguments[0].scrollIntoView(true);", editlenecekHasta);
        editlenecekHasta.click();

        ReusableMethods.waitFor(3);
    }

    @Then("Doktor Save buttonuna tiklar")
    public void doktor_save_buttonuna_tiklar() {
        js.executeScript("arguments[0].click();", medunnaPage.saveButton);
    }

    @And("Doktor kayit yapildigini test eder.")
    public void doktorKayitYapildiginiTestEder() {
        waitFor(3);
        String expectedMessage = "The Appointment is updated with identifier";
        String actualMessage = medunnaPage.editSaveOnay.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
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
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]")).isDisplayed()); // ID
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[2]")).isDisplayed()); // Start DateTime
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[3]")).isDisplayed()); // End DateTime
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[4]")).isDisplayed()); // Status
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[11]")).isDisplayed()); // Physician
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[12]")).isDisplayed()); // Patient
    }

    @And("Doktor Anamnesis, Treatment, Diagnosis'e veri girildigini dogrular")
    public void doktorAnamnesisTreatmentDiagnosisEVeriGirildiginiDogrular() {
        waitFor(3);
        if (medunnaPage.anamnesisTextBox.getText().isEmpty()) medunnaPage.anamnesisTextBox.sendKeys("Anamnesis");
        if (medunnaPage.treatmentTextBox.getText().isEmpty()) medunnaPage.treatmentTextBox.sendKeys("Treatment");
        if (medunnaPage.diagnosisTextBox.getText().isEmpty())
            medunnaPage.diagnosisTextBox.sendKeys("Diagnosis" + Keys.TAB);
        Assert.assertFalse(medunnaPage.anamnesisTextBox.getText().isEmpty());
        Assert.assertFalse(medunnaPage.treatmentTextBox.getText().isEmpty());
        Assert.assertFalse(medunnaPage.diagnosisTextBox.getText().isEmpty());

    }

    @Then("Doktor Prescription, Description veri girilmedigini dogrular")
    public void doktorPrescriptionDescriptionVeriGirilmediginiDogrular() {
        waitFor(3);
        if (!medunnaPage.prescriptionTextBox.getText().isEmpty())
            actions.doubleClick(medunnaPage.prescriptionTextBox).sendKeys(Keys.DELETE).perform();
        if (!medunnaPage.descriptiontionTextBox.getText().isEmpty())
            actions.doubleClick(medunnaPage.descriptiontionTextBox).sendKeys(Keys.DELETE).perform();
        Assert.assertTrue(medunnaPage.prescriptionTextBox.getText().isEmpty());
        Assert.assertTrue(medunnaPage.descriptiontionTextBox.getText().isEmpty());
    }

    @Then("Doktor Prescription, Description veri girisi yapildigini dogrular")
    public void doktorPrescriptionDescriptionVeriGirisiYapildiginiDogrular() {
        waitFor(3);
        if (medunnaPage.prescriptionTextBox.getText().isEmpty())
            medunnaPage.prescriptionTextBox.sendKeys("Prescription");
        if (medunnaPage.descriptiontionTextBox.getText().isEmpty())
            medunnaPage.descriptiontionTextBox.sendKeys("Description");
        Assert.assertTrue(!medunnaPage.prescriptionTextBox.getText().isEmpty());
        Assert.assertTrue(!medunnaPage.descriptiontionTextBox.getText().isEmpty());
    }

    @Then("Doktor Status'a {string} secebildigini test eder")
    public void doktorStatusASecebildiginiTestEder(String istenenDurum) {
        waitFor(3);
        if (medunnaPage.anamnesisTextBox.getText().isEmpty()) medunnaPage.anamnesisTextBox.sendKeys("Anamnesis");
        if (medunnaPage.treatmentTextBox.getText().isEmpty()) medunnaPage.treatmentTextBox.sendKeys("Treatment");
        if (medunnaPage.diagnosisTextBox.getText().isEmpty())
            medunnaPage.diagnosisTextBox.sendKeys("Diagnosis", Keys.TAB);
        System.out.println("istenenDurum = " + istenenDurum);
        WebElement ddmStatus = medunnaPage.statusTextBox;
        Select options = new Select(ddmStatus);
        options.selectByVisibleText(istenenDurum);
    }

    @And("Doktor Create or Edit an Appointment sayfasinin acildigini test eder")
    public void doktorCreateOrEditAnAppointmentSayfasininAcildiginiTestEder() {
        Assert.assertTrue(medunnaPage.createOrEditPageYazi.getText().equals("Create or Edit an Appointment"));
    }


}

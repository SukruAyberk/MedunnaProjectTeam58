package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.RecepCPage;
import utilities.Driver;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static utilities.ReusableMethods.waitFor;

public class US012 {
    RecepCPage medunnaPage = new RecepCPage();
    Actions actions;

    @When("Doktor Request A Test buttonuna tiklar")
    public void doktor_request_a_test_buttonuna_tiklar() {
        waitFor(3);
        actions = new Actions(Driver.getDriver());
        WebElement element = medunnaPage.requestATest;
        actions.click(element).perform();
    }

    @When("Doktor {string} tik atar")
    public void
    doktor_tik_atar(String istenenTest) {
        waitFor(3);
        List<WebElement> testNames = medunnaPage.testName;
        int count = 1;
        String testId = "";

        for (WebElement each : testNames) {
            if (each.getText().equals(istenenTest)) {
                System.out.println("count" + count);
                testId = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]")).getText();
                break;
            }
            count++;
        }
        System.out.println("testId = " + testId);
        Driver.getDriver().findElement(By.id(testId)).click();

    }

    @Then("Doktor Test kaydinin yapildigini test eder.")
    public void doktorTestKaydininYapildiginiTestEder() {
        waitFor(3);
        String expectedMessage = "A new Test is created with identifier";
        String actualMessage = medunnaPage.editSaveOnay.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @And("Doktor Test Items Sayfasinda Glucose , Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin oldugunu dogrular")
    public void doktorTestItemsSayfasindaGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinOldugunuDogrular() {
        waitFor(5);
        String actual1 = "", actual2 = "", actual3 = "", actual4 = "", actual5 = "", actual6 = "", actual7 = "", actual8 = "";
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> testNames = medunnaPage.testName;
        for (WebElement each : testNames) {
                if (each.getText().equals("Glucose")) actual1 = "Glucose";
                if (each.getText().equals("Urea")) actual2 = "Urea";
                if (each.getText().equals("Creatinine")) actual3 = "Creatinine";
                if (each.getText().equals("Sodium")) actual4 = "Sodium";
                if (each.getText().equals("Potassium")) actual5 = "Potassium";
                if (each.getText().equals("Total protein")) actual6 = "Total protein";
                if (each.getText().equals("Albumin")) actual7 = "Albumin";
                if (each.getText().equals("Hemoglobin")) actual8 = "Hemoglobin";
        }
        softAssert.assertTrue(actual1.equals("Glucose"), "Glucose testi bulunamamıştır");
        softAssert.assertTrue(actual2.equals("Urea"), "Urea testi bulunamamıştır");
        softAssert.assertTrue(actual3.equals("Creatinine"), "Creatinine testi bulunamamıştır");
        softAssert.assertTrue(actual4.equals("Sodium"), "Sodium testi bulunamamıştır");
        softAssert.assertTrue(actual5.equals("Potassium"), "Potassium testi bulunamamıştır");
        softAssert.assertTrue(actual6.equals("Total protein"), "Total protein testi bulunamamıştır");
        softAssert.assertTrue(actual7.equals("Albumin"), "Albumin testi bulunamamıştır");
        softAssert.assertTrue(actual8.equals("Hemoglobin"), "Hemoglobin testi bulunamamıştır");
        softAssert.assertAll();
    }
}

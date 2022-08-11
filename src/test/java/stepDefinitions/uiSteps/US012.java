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

import java.util.ArrayList;
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
        List<String> expectedTestList=new ArrayList<>();
        expectedTestList.add("glucose");
        expectedTestList.add("Urea");
        expectedTestList.add("Creatinine");
        expectedTestList.add("Sodium");
        expectedTestList.add("Potassium");
        expectedTestList.add("Total protein");
        expectedTestList.add("Albumin");
        expectedTestList.add("Hemoglobin");

        List<String> actualTestList=new ArrayList<>();
        for (WebElement each:medunnaPage.testName){
            actualTestList.add(each.getText());
        }
        Assert.assertTrue(actualTestList.containsAll(expectedTestList));
    }
}

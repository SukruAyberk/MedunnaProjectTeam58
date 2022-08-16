package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.RecepCPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;
import static utilities.ReusableMethods.waitFor;

public class US012 {
    RecepCPage medunnaPage = new RecepCPage();

    @When("Doktor Request A Test buttonuna tiklar")
    public void doktor_request_a_test_buttonuna_tiklar() {
        //ReusableMethods.waitForClickablility(medunnaPage.requestATest, 15);
        medunnaPage.requestATest.click();
    }

    @When("Doktor {string} tik atar")
    public void
    doktor_tik_atar(String istenenTest) {
        waitFor(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        List<WebElement> testNames = medunnaPage.testNames;
        int count = 1;
        String testId = "";
        WebElement istenenWebElement = null;

        for (WebElement each : testNames) {
            if (each.getText().equals(istenenTest)) {
                System.out.println("count" + count);
                istenenWebElement = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[2]"));
                testId = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]")).getText();
                break;
            }
            count++;
        }
        System.out.println("testId = " + testId);
        WebElement aaa = Driver.getDriver().findElement(By.id(testId));
        js.executeScript("arguments[0].scrollIntoView(true);", istenenWebElement);
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();", aaa);

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
        List<String> expectedTestList = new ArrayList<>();
        expectedTestList.add("Glucose");
        expectedTestList.add("Urea");
        expectedTestList.add("Creatinine");
        expectedTestList.add("Sodium");
        expectedTestList.add("Potassium");
        expectedTestList.add("Total protein");
        expectedTestList.add("Albumin");
        expectedTestList.add("Hemoglobin");

        List<String> actualTestList = new ArrayList<>();
        for (WebElement each : medunnaPage.testNames) {
            actualTestList.add(each.getText());
        }
        Assert.assertTrue(actualTestList.containsAll(expectedTestList));
    }
}

package stepDefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ErvaPage;
import pages.OrtakLocatePages;

import static utilities.ReusableMethods.waitFor;

public class US009 {
    OrtakLocatePages ortakLocatePages= new OrtakLocatePages();
    ErvaPage ervaPage= new ErvaPage();

    @Then("staff My Pages menusune tiklar")
    public void staff_my_pages_menusune_tiklar() { ortakLocatePages.myPagesButonu.click();
    }

    @And("staff Search Patient butonunu tiklar")
    public void staffSearchPatientButonunuTiklar() {
        ervaPage.searchPatientButonu.click();
        waitFor(5);
    }

    @Then("staff Search Patient sekmesinde hasta bilgilerini gorur")
    public void staffSearchPatientSekmesindeHastaBilgileriniGorur() {
        ervaPage.viewButonu.click();
        waitFor(5);
    }

    @And("staff hastanın yanındaki edit butonuna tıklar")
    public void staffHastanınYanındakiEditButonunaTıklar() {
        
    }

    @And("staff hasta bilgilerinin düzenlenebilir olduğunu test eder")
    public void staffHastaBilgilerininDüzenlenebilirOlduğunuTestEder() {
    }
}

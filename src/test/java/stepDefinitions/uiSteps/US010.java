package stepDefinitions.uiSteps;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BahattinPage;
import static utilities.ReusableMethods.waitFor;

public class US010 {

    BahattinPage baha=new BahattinPage();

  @Then("Doktor  appointments list  gorebildigini test eder")
  public void doktor_appointments_list_gorebildigini_test_eder(){
      waitFor(3);
      Assert.assertTrue(baha.Appoinments.isDisplayed());

   }
    @Then("Doktor  time slots gorebildigini test eder")
    public void doktor_time_slots_gorebildigini_test_eder() {
        Assert.assertTrue(baha.fromDate.isDisplayed());
        Assert.assertTrue(baha.toDate.isDisplayed());


    }
    @Then("Doktor patient id, start date, end date, status bilgilerini gorebildigini test eder")
    public void doktor_patient_id_start_date_end_date_status_bilgilerini_gorebildigini_test_eder() {
        System.out.println("User on the step");
        Assert.assertTrue(baha.patientId.isDisplayed());
        Assert.assertTrue(baha.startDate.isDisplayed());
        Assert.assertTrue(baha.endDate.isDisplayed());
        Assert.assertTrue(baha.status.isDisplayed());
        Assert.assertEquals(baha.patientId.getText(),"175894");
    }
}


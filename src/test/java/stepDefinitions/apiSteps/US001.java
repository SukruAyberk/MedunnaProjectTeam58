package stepDefinitions.apiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.Registrant;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static utilities.WriteToTxt.saveRegistrantData;

public class US001 {

    static RequestSpecification spec;
    static Response response;

    static Registrant registrant = new Registrant();



    @Given("User sets the end point for all registrant information")
    public void user_sets_the_end_point_for_all_registrant_information() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "users").queryParams("page", 1, "size", 5000);

    }
    @Given("User sends a request to the url")
    public void user_sends_a_request_to_the_url() {
        String token = Authentication.generateToken();

        response = given().
                headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                spec(spec).
                when().get("/{first}/{second}");

        response.prettyPrint();

    }
    @Then("User confirm that status code should be {int}")
    public void user_confirm_that_status_code_should_be(Integer statusCode) {
        saveRegistrantData(registrant);
        response.then().assertThat().statusCode(statusCode);
        System.out.println("status code  : " + response.statusCode());

    }
    @Then("User confirm all count of registrant data is the same as expected result")
    public void user_confirm_all_count_of_registrant_data_is_the_same_as_expected_result() {

    }
    @Given("User sets the end point for register")
    public void user_sets_the_end_point_for_register() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "register");
    }
    @Given("User sets the expected data")
    public void user_sets_the_expected_data() {
        Faker faker = new Faker();

        registrant.setEmail(faker.internet().emailAddress());
        registrant.setFirstName(faker.name().firstName());
        registrant.setLastName(faker.name().lastName());
        registrant.setLogin(faker.name().username());
        registrant.setPassword(faker.internet().password(7, 16, true, true, true));
        registrant.setSsn(faker.idNumber().ssnValid());
    }
    @Then("User sends the post request and get the response")
    public void user_sends_the_post_request_and_get_the_response() {
        response = given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");
    }
    @Then("User saves the respons")
    public void user_saves_the_respons() {
       saveRegistrantData(registrant);
    }
    @Then("User verifies API records")
    public void user_verifies_api_records() throws IOException {
        response.then().assertThat().statusCode(201);
        response.prettyPrint();

        ObjectMapper mapper = new ObjectMapper();

        Registrant actualData=response.as(Registrant.class);

        Assert.assertEquals(registrant.getEmail(),actualData.getEmail());
        Assert.assertEquals(registrant.getFirstName(),actualData.getFirstName());
        Assert.assertEquals(registrant.getLastName(),actualData.getLastName());
        Assert.assertEquals(registrant.getLogin(),actualData.getLogin());
        Assert.assertEquals(registrant.getSsn(),actualData.getSsn());
    }
}

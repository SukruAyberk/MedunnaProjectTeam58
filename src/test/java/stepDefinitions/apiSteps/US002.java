package stepDefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;
import utilities.JsonUtil;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;

public class US002 {
    Response response;
    static RequestSpecification spec;

    @Given("user sends get request to {string}")
    public void user_sends_get_request_to(String string) {

        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "user");
    }

    @Given("user sends the GET request and gets the response")
    public void user_sends_the_get_request_and_gets_the_response() {
       response = getRequest(generateToken(), "https://medunna.com/api/user?010-96-7328");
       response.prettyPrint();
    }

    @Then("verify expected data equals to actual data")
    public void verify_expected_data_equals_to_actual_data() {
        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("ssn",010-96-7328);
        expectedData.put("email","team83_dann.jacobson@yahoo.com");
        expectedData.put("login","team83_jefferson.von");

        System.out.println(expectedData);
        HashMap actualDataMap = JsonUtil.convertJsonToJavaObject(response.asString(), HashMap.class);
        System.out.println("actualdata"+actualDataMap);
        assertEquals(expectedData.get("email"),actualDataMap.get("email"));
        assertEquals(expectedData.get("login"),actualDataMap.get("login"));

    }
}

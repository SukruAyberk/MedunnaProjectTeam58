package stepDefinitions.apiSteps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Appointment;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US010 {

    static Appointment appointment;
    static Response response;

    public static void main(String[] args) throws JsonProcessingException {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
        spec.pathParams("first","api", "second", "appointments", "third","175894");

       response= given().spec(spec).header("Authorization", "Bearer "+ generateToken())
                .when().get("/{first}/{second}/{third}"); // istegimiz karsi tarafa gonderdik

        response. prettyPrint();

        // ecpected data olusturuldu
        Integer expectedId=175894;

        //actual data olustur object mapperdan aliyoruz
        ObjectMapper obj=new ObjectMapper();
        appointment= obj.readValue(response.asString(),Appointment.class);
        System.out.println("appointment = " + appointment);

        //karsilastiracagiz
        Assert.assertEquals(175894,appointment.getId());
        Assert.assertEquals("COMPLETED",appointment.getStatus());


    }



}

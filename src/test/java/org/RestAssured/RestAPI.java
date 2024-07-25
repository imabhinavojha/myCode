package org.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.Buffer;
import java.util.Map;
import java.util.logging.Logger;

public class RestAPI {

    private static final Logger logger = Logger.getLogger(MockApiClient.class.getName());

    //If request is successful, status code will be 200
    @Test
    public void Case1() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://mock.extensions.uat.fyndx1.de/masquerader/abhinav/RestAPISuccess";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");


        int statusCode = response.getStatusCode();
        String contentType = response.header("Content-Type");
        String serverType = response.header("Server");
        String acceptLanguage = response.header("Content-Encoding");

        System.out.println("Status Code : " + statusCode);
        System.out.println("Content-Type value : " + contentType);
        System.out.println("Server value : " + serverType);
        System.out.println("Content-Encoding : " + acceptLanguage);

        System.out.println("Status received : " + response.getStatusLine()+"\n \n");
        System.out.println("Header : " + response.getHeaders()+"\n \n");
        System.out.println("Response : " + response.prettyPrint()+"\n \n");

        Assert.assertEquals(statusCode, 200, "Correct status code returned");
        Assert.assertEquals(contentType, "application/json");




        Response response1 = httpRequest.request(Method.GET, "");
        Headers allHeaders = response1.headers();
        for (Header header : allHeaders) {
            System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
        }


    }

    @Test
    public void Case2() {
        RestAssured.baseURI = "https://mock.extensions.uat.fyndx1.de/masquerader/abhinav/RestAPISuccess1";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");

        JsonPath jsonPathEvaluator = response.jsonPath();
        String city = jsonPathEvaluator.getString("data.profile.address.city");
        Map<Object, Object> meta =   jsonPathEvaluator.getMap("data.metadata");

        System.out.println("City received from Response " + city+"\n \n");
        System.out.println("meta received from Response " + meta+"\n \n");

        Assert.assertEquals(city, "Metropolis", "City should be Metropolis");

        ResponseBody body = response.getBody();
        System.out.println("Response Body is: " + body.prettyPrint());
    }

    }

package org.RestAssured;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MockApiClient {

    private static final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build();

    private static final Logger logger = Logger.getLogger(MockApiClient.class.getName());

    private static  String url = "https://mock.extensions.uat.fyndx1.de/masquerader/url/create/";
    private static  String deleteUrl = "https://mock.extensions.uat.fyndx1.de/masquerader/url/delete/";



    private static  Headers headers = new Headers.Builder()
            .add("Content-Type", "application/json")
            .add("Authorization", "Basic ZmxpcGthcnQ6cGFzc3dvcmQ=")
            .build();




    public static void main(String[] args) {
        try {
            deleteMock();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void postWeatherMock1() throws IOException {


        JSONObject address = new JSONObject()
                .put("street", "123 Main St")
                .put("city", "Metropolis")
                .put("state", "NY")
                .put("zip", "12345");

        JSONObject profile = new JSONObject()
                .put("age", 30)
                .put("gender", "Male")
                .put("address", address);

        JSONArray roles = new JSONArray()
                .put("admin")
                .put("user");



        JSONObject metadata = new JSONObject()
                .put("total_items", 100)
                .put("items_per_page", 10)
                .put("current_page", 1)
                .put("total_pages", 10);

        JSONObject links = new JSONObject()
                .put("next", "/abhinav/RestAPI?page=2")
                .put("prev", JSONObject.NULL);

        // Create the main JSON object
        JSONObject mainJson = new JSONObject()
                .put("status", "SUCCESS")
                .put("user_id", "12345")
                .put("user_name", "John Doe")
                .put("email", "john.doe@example.com")
                .put("roles", roles)
                .put("profile", profile)
                .put("metadata", metadata)
                .put("links", links);

        // Print the JSON object
        System.out.println(mainJson.toString(4));


        JSONObject requestBodyJson = new JSONObject()
                .put("identifier", "RestAPI")
                .put("request_type", "POST")
                .put("url", "/abhinav/RestAPISuccess1")
                .put("response", new JSONObject().put("data",mainJson))
                .put("payload", new JSONObject())
                .put("headers", new JSONObject().put("Content-Type", "application/json").put("Server","Unix").put("Content-Encoding","Java"))
                .put("status_code", 200)
                .put("latency", 0)
                .put("is_active", true);

        // Log the request body
//        logger.info("RestAPI Body : " + requestBodyJson.toString());

        RequestBody body = RequestBody.create(requestBodyJson.toString(), MediaType.get("application/json"));

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .headers(headers)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            logger.info("Response: " + response.body().string());
        }
    }

    public static void postWeatherMock() throws IOException {
        // Define the request body
        JSONObject responseJson = new JSONObject()
                .put("City", "Hyderabad")
                .put("Temperature", "25.51 Degree Celsius")
                .put("Humidity", "94 Percent")
                .put("Weather Description", "mist")
                .put("Wind Speed", "1 Km per hour")
                .put("Wind Direction degree", " Degree");

        JSONObject requestBodyJson = new JSONObject()
                .put("identifier", "RestAPI")
                .put("request_type", "POST")
                .put("url", "/abhinav/RestAPISuccess")
                .put("response", responseJson)
                .put("payload", new JSONObject())
                .put("headers", new JSONObject().put("Content-Type", "application/json"))
                .put("status_code", 200)
                .put("latency", 0)
                .put("is_active", true);

        // Log the request body
        logger.info("RestAPI Body : " + requestBodyJson.toString());

        RequestBody body = RequestBody.create(requestBodyJson.toString(), MediaType.get("application/json"));

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .headers(headers)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            logger.info("Response: " + response.body().string());
        }
    }

    public static void deleteMock() throws IOException {

        JSONObject requestBodyJson = new JSONObject()
                .put("deleting_identifier", "RestAPI");

        RequestBody body = RequestBody.create(requestBodyJson.toString(), MediaType.get("application/json"));

        Request request = new Request.Builder()
                .url(deleteUrl)
                .post(body)
                .headers(headers)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            logger.info("Response: " + response.body().string());
        }
    }



}

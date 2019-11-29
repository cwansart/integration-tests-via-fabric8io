package de.openknowledge.cwansart.integrationtests.application;

import de.openknowledge.cwansart.integrationtests.TestHelper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class HelloWorldResourceIT {

    private String url = String.format("%s/api/hello-world", TestHelper.getContainerBaseUrl());

    @Test
    public void testHelloWorldResource() {

        RestAssured.given()
            .get(url)
            .then()
            .contentType(ContentType.JSON)
            .statusCode(200)
            .body("message", equalTo("hello world"));
    }
}

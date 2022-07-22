package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanEcho {

    @Test
    void postmanEcho() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Netology - Netology")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Netology - Netology"))
        ;

    }
}

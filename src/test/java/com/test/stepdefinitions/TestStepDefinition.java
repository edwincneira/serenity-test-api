package com.test.stepdefinitions;

import io.cucumber.java.en.And;

import static net.serenitybdd.rest.RestRequests.given;

public class TestStepDefinition {

    @And("Actor use one api")
    public void actorUseOneApi() {
        given()
                .given()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .prettyPrint();
    }


}

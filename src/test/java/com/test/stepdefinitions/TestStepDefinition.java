package com.test.stepdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.rest.RestRequests.given;

public class TestStepDefinition {

    @And("{actor} use one api")
    public void actorUseOneApi(Actor actor) {
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

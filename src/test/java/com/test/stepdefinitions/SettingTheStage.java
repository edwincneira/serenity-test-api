package com.test.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.restassured.RestAssured;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SettingTheStage {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void recruitTheActors() {
        RestAssured.baseURI = "https://reqres.in/api/login";
        OnStage.setTheStage(new OnlineCast());
    }

}

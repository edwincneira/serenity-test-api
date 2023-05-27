package com.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        monochrome = true,
        tags = "@test",
        features = {
                "src/test/resources/Test.feature"
        },
        glue = "com.test")
public class Runner {

}
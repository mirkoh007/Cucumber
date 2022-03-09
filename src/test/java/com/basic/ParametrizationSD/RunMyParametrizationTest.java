package com.basic.ParametrizationSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/ParametrizationFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/ParametrizationSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                    "html:target/cucumber/html/parametrization-reports.html",
                    "json:target/cucumber/json/parametrization-report.json",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = true,
        monochrome = false

)
public class RunMyParametrizationTest {
}

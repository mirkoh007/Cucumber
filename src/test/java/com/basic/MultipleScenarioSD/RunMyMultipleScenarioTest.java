package com.basic.MultipleScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/MultipleScenarioFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/MultipleScenarioSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                    "html:target/cucumber/html/multiple-reports.html",
                    "json:target/cucumber/json/multiple-report.json",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false,
        monochrome = false

)
public class RunMyMultipleScenarioTest {
}

package com.basic.MultipleFileScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/MultipleFileFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/MultipleFileScenarioSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                "html:target/cucumber/html/multiplefilescenario-reports.html",
                "json:target/cucumber/json/multiplefilescenario-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false,
        monochrome = true

)
public class RunMyMultipleFileTest {
}

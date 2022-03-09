package com.basic.DataScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/DataScenarioFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/DataScenarioSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                "html:target/cucumber/html/data-reports.html",
                "json:target/cucumber/json/data-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = true,
        monochrome = true

)
public class RunMyDataTableTest {
}

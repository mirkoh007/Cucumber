package com.basic.HooksScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/HooksScenarioFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/HooksScenarioSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                "html:target/cucumber/html/hooks-reports.html",
                "json:target/cucumber/json/hooks-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false,
        monochrome = false

)
public class RunMyHooksTest {
}

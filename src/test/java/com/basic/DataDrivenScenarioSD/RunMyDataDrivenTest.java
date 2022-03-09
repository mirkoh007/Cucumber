package com.basic.DataDrivenScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/DataDrivenFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/DataDrivenScenarioSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                "html:target/cucumber/html/datadriven-reports.html",
                "json:target/cucumber/json/datadriven-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false,
        monochrome = false

)
public class RunMyDataDrivenTest {
}

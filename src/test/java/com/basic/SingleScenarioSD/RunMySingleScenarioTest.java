package com.basic.SingleScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/SingleScenarioFF"},
        glue = {"com/basic/SingleScenarioSD"},
        plugin = {"pretty",
                "html:target/cucumber/html/singlescenatio-reports.html",
                "json:target/cucumber/json/singlescenrio-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false
)
public class RunMySingleScenarioTest {
}

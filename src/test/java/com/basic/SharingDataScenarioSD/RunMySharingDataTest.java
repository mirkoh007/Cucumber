package com.basic.SharingDataScenarioSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/SharingDataFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/SharingDataScenarioSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                    "html:target/cucumber/html/sharingdata-reports.html",
                    "json:target/cucumber/json/sharingdata-report.json"},
        dryRun = false,
        monochrome = false

)
public class RunMySharingDataTest {
}

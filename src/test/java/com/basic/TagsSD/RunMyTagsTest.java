package com.basic.TagsSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/basic/TagsFF"},  // mora puna putanja do .feature fajla
        glue = {"com/basic/TagsSD"},  // ovo je putanja za step file
        plugin = {"pretty",
                  "html:target/cucumber/html/tags-reports.html",
                  "json:target/cucumber/json/tags-report.json",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false,
//        tags = "@Important",
        tags = "@Smoke or @Regression",
        monochrome = true

)
public class RunMyTagsTest {
}

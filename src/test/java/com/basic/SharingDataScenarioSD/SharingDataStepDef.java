package com.basic.SharingDataScenarioSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SharingDataStepDef {

    WebDriver driver;

    public SharingDataStepDef(SharedClass share) {
        driver = share.setup();
    }

    @Given("User need to be on Facebook login page")
    public void userNeedToBeOnFacebookLoginPage() {
        driver.get("https://sr-rs.facebook.com/");
    }

//      first scenario
    @When("User enter email {string}")
    public void userEnterEmail(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Thread.sleep(1500);
    }


}

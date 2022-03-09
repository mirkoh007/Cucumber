package com.basic.MultipleFileScenarioSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFileStepDef {

    WebDriver driver;


    @Given("User need to be on google page")
    public void userNeedToBeOnGooglePage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @When("User enters search string")
    public void userEntersSearchString() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).isDisplayed();
        Thread.sleep(1500);
    }


    @And("Close opened google page")
    public void closeOpenedGooglePage() {
        driver.close();
        driver = null;
    }
}

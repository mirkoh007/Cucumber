package com.basic.DataDrivenScenarioSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class DataDrivenStepDef {

    WebDriver driver;

    @Given("User need to be on Facebook login page")
    public void userNeedToBeOnFacebookLoginPage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://sr-rs.facebook.com/");
    }

    @When("User enters email {string}")
    public void userEntersEmail(String email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Thread.sleep(1500);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String pass) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(pass);
        Thread.sleep(1500);
    }

    @Then("User checks if email {string} is present")
    public void userChecksIfEmailIsPresent(String email) {
        String actualEmail = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
        assertEquals(email,actualEmail);
    }

    @And("User checks if password {string} is present")
    public void userChecksIfPasswordIsPresent(String password) {
        String actualPassword = driver.findElement(By.xpath("//input[@id=\"pass\"]")).getAttribute("value");
        assertEquals(password,actualPassword);
    }

    @And("Close opened browser")
    public void closeOpenedBrowser() {
        driver.close();
        driver = null;
    }

}

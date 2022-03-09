package com.basic.MultipleScenarioSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class MultipleScenarioStepDef {

    WebDriver driver;

    @Given("^User need to be on Facebook login page$")
    public void userNeedToBeOnFacebookLoginPage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://sr-rs.facebook.com/");
    }

    @When("^User enters user email$")
    public void userEntersUserEmail() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("david@gmail.com");
    }
    @And("^User enters password$")
    public void userEntersPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234");
        Thread.sleep(1500);
    }

    @Then("^User checks if email is present$")
    public void userChecksIfEmailIsPresent() {
        String email = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
        assertEquals("david@gmail.com",email);
    }

    @And("^User checks if password is present$")
    public void userChecksIfPasswordIsPresent() {
        String password = driver.findElement(By.xpath("//input[@id=\"pass\"]")).getAttribute("value");
       assertEquals("1234",password);
    }

    @And("close browser")
    public void closeBrowser() {
        driver.quit();
        driver = null;
    }
}

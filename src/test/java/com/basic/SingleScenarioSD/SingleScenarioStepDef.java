package com.basic.SingleScenarioSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SingleScenarioStepDef {

    WebDriver webDriver;

    @Given("User need to be on Facebooks login page")
    public void userNeedToBeOnFacebooksLoginPage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://sr-rs.facebook.com/");
    }

    @When("User enter email")
    public void userEnterEmail() throws InterruptedException {
        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("goliath@gmail.com");
        Thread.sleep(1500);
    }

    @Then("Checks if email is correct")
    public void checksIfEmailIsCorrect() {
        String email = webDriver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
        assertEquals("goliath@gmail.com",email);
    }

    @And("Close browser")
    public void closeBrowser() {
        webDriver.quit();
        webDriver = null;
    }
}

package com.basic.MultipleFileScenarioSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoStepDef {
    WebDriver driver;


    @Given("User need to be on automation webpage")
    public void userNeedToBeOnAutomationWebpage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");

    }

    @When("User enters first name")
    public void userEntersFirstName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John ");
        Thread.sleep(1500);
    }

    @And("User enters last name")
    public void userEntersLastName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Malkovich ");
        Thread.sleep(1500);
    }


    @And("Close opened automation page")
    public void closeOpenedAutomationPage() {
        driver.close();
        driver = null;
    }
}

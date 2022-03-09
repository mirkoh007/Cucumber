package com.basic.DataScenarioSD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DataTableStepDef {

    WebDriver driver;

    @Given("User need to be on Facebook login page")
    public void userNeedToBeOnFacebookLoginPage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://sr-rs.facebook.com/");
    }

    @When("User enter following data")
    public void userEnterFollowingData(DataTable dataTable) throws InterruptedException {
        List<List<String>> data = dataTable.asLists();
        String email = data.get(1).get(0);
        String password = data.get(1).get(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(password);
        Thread.sleep(1500);
    }


    @And("Close opened browser")
    public void closeOpenedBrowser() {
        driver.close();
        driver = null;
    }

}

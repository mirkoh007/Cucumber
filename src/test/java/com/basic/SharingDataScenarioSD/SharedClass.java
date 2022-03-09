package com.basic.SharingDataScenarioSD;


import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedClass {

    WebDriver driver;

//    @Before
    public WebDriver setup() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\BackendDeveloper\\IdeaProjects\\CucumberWorking\\src\\test\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}

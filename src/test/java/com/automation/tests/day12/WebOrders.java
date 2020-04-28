package com.automation.tests.day12;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebOrders {

    private WebDriver driver;
    private WebDriver wait;
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
        
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }

}

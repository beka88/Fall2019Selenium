package com.automation.tests.myPractices;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestNgPractice {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().version("79").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://practice.cybertekschool.com/");

    }

    @Test
    public void practice(){

        driver.findElement(By.linkText("Radio Buttons")).click();

        BrowserUtils.wait(3);






    }

    @AfterMethod
    public void tearDown(){

        BrowserUtils.wait(3);
        driver.quit();


    }
}

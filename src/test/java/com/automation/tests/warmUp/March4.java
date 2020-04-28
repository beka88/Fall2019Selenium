package com.automation.tests.warmUp;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class March4 {

    static WebDriver driver;

    public static void main(String[] args) {

        ebayTest();

    }

    public static void ebayTest(){

        driver = DriverFactory.createDriver("chrome");

        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResults = driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText().split(" ")[0]);
        driver.quit();
    }



}



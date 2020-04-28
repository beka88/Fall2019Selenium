package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Alerts {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("TEST #1============================");

        buttons.get(0).click();

        BrowserUtils.wait(3);
        String popupText = driver.switchTo().alert().getText();
        System.out.println(popupText);

        driver.switchTo().alert().accept();
        String expected = "You successfully clicked an alert";
        String actual = driver.findElement(By.id("result")).getText();

        if(expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
            System.out.println("Expected "+ expected);
            System.out.println("Actual "+ actual);
        }

        BrowserUtils.wait(3);

        System.out.println("TEST #2============================");

        buttons.get(1).click();
        BrowserUtils.wait(3);
        driver.switchTo().alert().dismiss();

        String actual2 = "You clicked: Cancel";
        String expected2 = driver.findElement(By.id("result")).getText();

        if(expected.equals(actual2)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("Expected " + expected2);
            System.out.println("Actual " + actual2);
        }

        BrowserUtils.wait(3);

        System.out.println("TEST #3============================");

        buttons.get(2).click();
        BrowserUtils.wait(3);

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Hello, World!");
        alert.accept();

        String actual3 = driver.findElement(By.id("result")).getText();
        String expected3 = "You entered: Hello, World!";

        BrowserUtils.wait(3);

        if(expected3.endsWith(actual3)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
            System.out.println("Expected " + expected3);
            System.out.println("Actual " + actual3);
        }


        BrowserUtils.wait(3);






        driver.quit();

    }
}

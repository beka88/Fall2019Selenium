package com.automation.tests.myPractices;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlertPractice {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        buttons.get(1).click();

        BrowserUtils.wait(3);

        String pupop2one = driver.switchTo().alert().getText();
        System.out.println(pupop2one);

        driver.switchTo().alert().dismiss();
        String actual = driver.findElement(By.id("result")).getText();
        String expected = "You clicked: Cancel";

        BrowserUtils.wait(3);

        if(actual.equals(expected)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        System.out.println(actual + " actual text");
        System.out.println(expected+ " expected");


        System.out.println("___________________________________");

        buttons.get(2).click();

        BrowserUtils.wait(3);

        String pupop3one = driver.switchTo().alert().getText();
        System.out.println(pupop3one);

        BrowserUtils.wait(3);

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello everyone");
        alert.accept();

       String actual1 = driver.findElement(By.id("result")).getText();
       String expected1 = "Hello everyone";

        BrowserUtils.wait(3);

        if(actual1.equals(expected1)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        BrowserUtils.wait(3);

        System.out.println(actual1 + " actual text");
        System.out.println(expected1+ " expected");

        driver.quit();











    }
}

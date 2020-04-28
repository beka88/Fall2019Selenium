package com.automation.tests.myPractices;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.wait(3);

        WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn1.click();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);

        WebElement btn2 = driver.findElement(By.xpath("//button[text()='Button 2']"));
        btn2.click();

        String result1 = driver.findElement(By.id("result")).getText();
        System.out.println(result1);

        WebElement btn5 = driver.findElement(By.xpath("//button[text()='Button 5']"));
        btn5.click();

        String result3 = driver.findElement(By.id("result")).getText();
        System.out.println(result3);

        WebElement mainWord = driver.findElement(By.xpath("//h3[text()='Multiple buttons']"));
        String result4 = mainWord.getText();
        System.out.println(result4);


        BrowserUtils.wait(3);
        driver.quit();
    }
}

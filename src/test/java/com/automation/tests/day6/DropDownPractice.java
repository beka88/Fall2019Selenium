package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        WebElement simpledropDown = driver.findElement(By.id("dropdown"));

        Select selectSimpleDropDown = new Select(simpledropDown);

        selectSimpleDropDown.selectByVisibleText("Option 2");

        BrowserUtils.wait(3);
        driver.quit();
    }
}

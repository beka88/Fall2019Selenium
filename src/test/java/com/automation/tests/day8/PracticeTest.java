package com.automation.tests.day8;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){


    }

    @Test
    public void loginTest() {
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(3);
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        BrowserUtils.wait(3);
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword",Keys.ENTER);
        BrowserUtils.wait(3);

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.className("subheader")).getText();

        Assert.assertEquals(expected,actual,"Subheader message is not matching!");

    }

    @AfterMethod
    public void teardown(){

        driver.quit();
    }
     @Test
    public void forgotPassword(){
        driver.findElement(By.linkText("Forgot Password")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.name("email")).sendKeys("bekakadyrova@gmail.com",Keys.ENTER);
        BrowserUtils.wait(3);

        String actual = driver.findElement(By.name("confirmation_message")).getText();
        String expected = "Your e-mail's been sent!";

        Assert.assertEquals(expected,actual,"Confirmation message is not valid");


    }
    @Test
    public void chechBoxes1(){
        driver.findElement(By.linkText("Checkboxes")).click();

        BrowserUtils.wait(3);

        List<WebElement> checboxes = driver.findElements(By.tagName("input"));

        BrowserUtils.wait(3);

        checboxes.get(0).click();

        Assert.assertTrue(checboxes.get(0).isSelected(),"Checkbox 1 is not selected");

        BrowserUtils.wait(3);


    }
}


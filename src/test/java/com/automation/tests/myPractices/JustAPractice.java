package com.automation.tests.myPractices;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JustAPractice {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(3);

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");

        BrowserUtils.wait(3);

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword");

        BrowserUtils.wait(3);

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebElement loginElement = driver.findElement(By.xpath("//h2[text()='Login Page']"));
        String login =loginElement.getText();
        System.out.println(login);


        BrowserUtils.wait(3);
        driver.quit();




    }
}

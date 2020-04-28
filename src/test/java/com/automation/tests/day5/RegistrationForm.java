package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegistrationForm {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");
        BrowserUtils.wait(3);
        driver.findElement(By.name("firstname")).sendKeys("Bermet");
        driver.findElement(By.name("lastname")).sendKeys("Kadyrova");
        driver.findElement(By.name("username")).sendKeys("beka88");
        driver.findElement(By.name("email")).sendKeys("beka@gmail.com");
        driver.findElement(By.name("password")).sendKeys("supersecretpassword2020");
        driver.findElement(By.name("phone")).sendKeys("490-489-7878");
        List<WebElement> genders = driver.findElements(By.name("gender"));
        genders.get(1).click();
        driver.findElement(By.name("birthday")).sendKeys("09/01/2013");
        driver.findElement(By.id("inlineCheckbox2")).click();

        BrowserUtils.wait(3);
        driver.findElement(By.id("wooden_spoon")).click();

        BrowserUtils.wait(3);

        driver.quit();

    }
}

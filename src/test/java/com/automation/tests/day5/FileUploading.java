package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/upload");
        BrowserUtils.wait(3);
        WebElement upload =  driver.findElement(By.id("file-upload"));
        String filePath = System.getProperty("user.dir") + "/pom.xml";
        System.out.println(filePath);

        String filepath1 = "C:\\Users\\kenwe\\Desktop";
        System.out.println(filepath1);

        upload.sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        BrowserUtils.wait(3);

        driver.quit();


    }
}

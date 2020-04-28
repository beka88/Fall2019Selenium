package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();

        BrowserUtils.wait(1);

        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));


        for (WebElement radiobutton : radioButtons) {
            String id = radiobutton.getAttribute("id");

            boolean isSelected = radiobutton.isSelected();
            System.out.println(id + " is selected? "+ isSelected);

            if (radiobutton.isEnabled()) {

                radiobutton.click();
                System.out.println("Clicked on: " + id);
                BrowserUtils.wait(1);
            } else {
                System.out.println("Button is disabled, not clicked: " +id);
            }
            System.out.println();
        }
        driver.close();
    }
}
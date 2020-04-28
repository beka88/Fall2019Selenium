package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesTest {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(3);

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        for(int i=0; i<checkBoxes.size();i++) {

            if (checkBoxes.get(i).isSelected()) {
                checkBoxes.get(i).click();
                System.out.println(i+1+ " checkbox selected");
            }else{
                System.out.println(i+1 + " checkbox not selected");
            }
        }
        BrowserUtils.wait(2);
        driver.quit();
    }
}

package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        String title = driver.getTitle();
        String expectedTitle ="Google";
        System.out.println("Title is " +title);

        if(expectedTitle.equals(title)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        driver.navigate().to("http://amazon.com");

        if(driver.getTitle().toLowerCase().contains("amazon")) {
            System.out.println("TEST Passed");
        }else{
            System.out.println("TEST FAILED");
        }

        driver.close();
    }

     public static void verifyEquals(String arg1,String arg2){
        if(arg1.equals(arg2)){
            System.out.println("TEST Passed");
        }else{
            System.out.println("TEST FAILED");
        }
        }
     }


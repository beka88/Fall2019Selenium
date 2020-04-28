package com.automation.tests.myPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class my1stPractice {
    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        String title = "Google";

        if(title.equals(driver.getTitle())){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.navigate().to("http:balenciaga.com");

        Thread.sleep(3000);

        System.out.println("Balenciaga title "+ driver.getTitle());
        System.out.println("Balenciaga url "+ driver.getCurrentUrl());

        driver.findElementById("searchInput").sendKeys("women triple s");

        Thread.sleep(3000);

        driver.close();




    }
}

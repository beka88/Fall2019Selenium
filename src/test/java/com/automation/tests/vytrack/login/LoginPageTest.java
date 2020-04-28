package com.automation.tests.vytrack.login;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginPageTest {

    private WebDriver driver;
    private String URL ="https://qa2.vytrack.com/user/login";

    private String username = "storemanager85";
    private String password = "UserUser123";
    private By userNameBy = By.id("prependedInput");
    private By passwordBy = By.id("prependedInput2");
    private By warningMessageBy = By.cssSelector("[class='alert alert-error'] > div");

    @Test(description = "verify that warning message displays when user enter invalid username")
    public void invalidUsername(){
        driver.findElement(userNameBy).sendKeys("invalidusername");
        driver.findElement(passwordBy).sendKeys("UserUser123", Keys.ENTER);
        BrowserUtils.wait(3);
        WebElement warningElement = driver.findElement(warningMessageBy);

        assertTrue(warningElement.isDisplayed());

        String expected = "Invalid user name or password.";
        String actual = warningElement.getText();
        assertEquals(actual,expected);
        BrowserUtils.wait(3);

    }
    @Test(description = "Login as store manager")
    public void loginAsStoreManager(){

        driver.findElement(userNameBy).sendKeys(username);
        driver.findElement(passwordBy).sendKeys(password, Keys.ENTER);

        BrowserUtils.wait(3);

        String expected = "Dashboard";
        String actual = driver.getTitle();

        assertEquals(actual,expected,"page title is not correct");

    }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}

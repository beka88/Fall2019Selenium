package com.automation.tests.practice;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationForm {

    private String URL = "http://practice.cybertekschool.com/registration_form";
    private WebDriver driver;

    private  By firstNameBy = By.name("firstname");
    private  By lastNameBy = By.name("lastname");
    private  By userNameBy = By.name("username");
    private  By emailBy = By.name("email");
    private  By passwordBy = By.name("password");
    private  By phoneNumberBy = By.name("phone");
    //gender
    private  By maleBy = By.cssSelector("input[value='male']");
    private  By femaleBy = By.cssSelector("input[value='female']");
    private  By otherBy = By.cssSelector("input[value='other']");

    private  By birthdayBy = By.name("birthday");
    private  By departmentBy = By.name("department");
    private  By jobBy = By.name("job_title");
    //languages
    private  By cplusplusBy = By.xpath("//label[text()='C++']/preceding-sibling::input");
    private  By javaBy = By.xpath("//label[text()='Java']/preceding-sibling::input");
    private  By javascriptBy = By.xpath("//label[text()='JavaScript']/preceding-sibling::input");
    //sign up button
    private  By sigupBy = By.id("wooden_spoon");

    @Test
    public void test1(){
        driver.findElement(firstNameBy).sendKeys("Patrick");
        driver.findElement(lastNameBy).sendKeys("White");
        driver.findElement(userNameBy).sendKeys("testuser");
        driver.findElement(emailBy).sendKeys("test@gmail.com");
        driver.findElement(passwordBy).sendKeys("12345678");
        driver.findElement(phoneNumberBy).sendKeys("123-344-1234");

        driver.findElement(femaleBy).click();
        driver.findElement(birthdayBy).sendKeys("01/02/2019");

        Select departmentSelect = new Select(driver.findElement(departmentBy));
        departmentSelect.selectByVisibleText("Department of Agriculture");

        Select jobTitleSelect = new Select(driver.findElement(jobBy));
        jobTitleSelect.selectByVisibleText("SDET");

        driver.findElement(javaBy).click();
        driver.findElement(sigupBy).click();

        BrowserUtils.wait(5);

        String expected = "You've successfully completed registration!";
        String actual = driver.findElement(By.tagName("p")).getText();

        Assert.assertEquals(actual,expected);

    }
    @Test
    public void verifyFirstNameLengthTest(){
        driver.findElement(firstNameBy).sendKeys("a");
        BrowserUtils.wait(5);
        WebElement warningMessage = driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']"));
        Assert.assertTrue(warningMessage.isDisplayed());

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
        driver.quit();
    }
}

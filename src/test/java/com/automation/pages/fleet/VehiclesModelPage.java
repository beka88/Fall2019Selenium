package com.automation.pages.fleet;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclesModelPage extends AbstractPageBase {

    @FindBy(partialLinkText = "Create Vehicles Model")
    private WebElement createModel;

    @FindBy(css = "[id^='custom_entity_type_ModelName-uid']")
    private WebElement modelName;

    @FindBy(css = "[id^='custom_entity_type_Make-uid']")
    private WebElement make;

    @FindBy(css = "[id^='custom_entity_type_Canberequested-uid']")
    private WebElement canBeRequested;


    @FindBy(className = "uploader input-widget-file")

    private WebElement logo;

    @FindBy(name = "custom_entity_type[CatalogValue]")
    private WebElement catalogvalue;



   public void setcreateModel (){
       BrowserUtils.wait(15);
       wait.until(ExpectedConditions.visibilityOf(modelName));
       modelName.sendKeys("Camaro");
       make.sendKeys("Chevrolet");
       BrowserUtils.wait(6);
       Select s1 = new Select(canBeRequested);
       s1.selectByVisibleText("Yes");
       String filepath = "C:\\Users\\kenwe\\Desktop\\MyFavoriteCar.html";
       logo.sendKeys(filepath);
       catalogvalue.sendKeys("vyvy");

   }

    public void clickCreateModel(){
       // WebDriverWait wait = new WebDriverWait(driver, 20);
        BrowserUtils.wait(15);
        wait.until(ExpectedConditions.elementToBeClickable(createModel)).click();
    }
}

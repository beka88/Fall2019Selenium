package com.automation.pages.activities;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DateTimeUtilities;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalendarEventsPage extends AbstractPageBase {

    @FindBy(css = "[title='Create Calendar event']")
    private WebElement createCalendarEvent;

    @FindBy(className = "select2-chosen")
    private WebElement owner;

    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_start']")
    private WebElement startDate;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    private WebElement endDate;


    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_start']")
    private WebElement startTime;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    private WebElement endTime;

    @FindBy(className = "grid-header-cell__label")
    private List<WebElement> columnNames;

    @FindBy(css = "iframe[id^='oro_calendar_event_form_description-uid']")
    private WebElement descriptionFrame;

    @FindBy(css = "[id^='oro_calendar_event_form_title-uid']")
    private WebElement title;

    @FindBy(id = "tinymce")
    private WebElement descriptionTextArea;

    @FindBy(css = "[class='btn-group pull-right'] > button")
    private WebElement saveAndClose;

    @FindBy(xpath = "(//div[@class='control-label'])[1]")
    private WebElement generalInfoTitle;

    @FindBy(xpath = "//label[text()='Description']/following-sibling::div//p[1]")
    private WebElement generalInfoDescription;
    //#####################################################

    @FindBy(xpath = "//td[text()='Testers Meeting']//following-sibling::td//a[text()='...']")
    private WebElement threeDots;

    @FindBy(xpath = "(//a[@title='Delete'])[2]")
    private WebElement deleteBtn;

    @FindBy(xpath = "(//a[@title='View'])[3]")
    private WebElement viewBtn;

    @FindBy(xpath = "(//a[@title='Edit'])[1]")
    private WebElement editBtn;


    @FindBy(css = ".fa-cog.hide-text")
    private WebElement gridSettings;

    @FindBy(css = ".btn-success.btn.dropdown-toggle")
    private WebElement expandBtn;

    @FindBy(xpath = "//span[text()='Title']")
    private WebElement gridTitle;

    @FindBy(xpath = "//a[@title='Cancel']")
    private WebElement cancelBtn;

    @FindBy(css = ".oro-subtitle")
    private WebElement subTitle;

    @FindBy(xpath = "//li[text()='9:00 PM']")
    private WebElement chooseATime;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    private WebElement endTime10;

    @FindBy(css = "[id^=\"oro_calendar_event_form_allDay-uid\"]")
    private WebElement allDayEventCheckbox;

    @FindBy(css = "[id^='recurrence-repeat-view']")
    private WebElement repeatCheckbox;

    @FindBy(css = "[id^='recurrence-repeats-view']")
    private WebElement dailyOption;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement repeatEvery;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement never;

    @FindBy(xpath = "//label[text()='Summary:']")
    private WebElement summaryText;

    @FindBy(xpath = "//span[text()='Daily every 1 day']")
    private WebElement dailyText;

    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[7]")
    private WebElement tenOccurences;

    @FindBy(xpath = "//span[text()=', end after 10 occurrences']")
    private WebElement tenOccurenecesText;

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    private WebElement after;

    @FindBy(xpath = "(//input[@type='radio'])[5]")
    private WebElement by;

    @FindBy(xpath = " (//input[@placeholder=\"Choose a date\"])[3]")
    private WebElement chooseAdate;

    @FindBy(css = ".ui-datepicker-month")
    private WebElement selectMonths;

    @FindBy(css = ".ui-datepicker-year")
    private WebElement selecYears;

    @FindBy(xpath = "//a[@class=\"ui-state-default\" and text()=\"18\"]")
    private WebElement select18;

    @FindBy(xpath = "//span[text()=', end by Nov 18, 2021']")
    private WebElement novemText;

    @FindBy(xpath = "//select[@id=\"recurrence-repeats-view153\"]")
    private WebElement dailySelector;

    @FindBy(xpath = "//input[@value='monday']")
    private WebElement monday;

    @FindBy(xpath = "//input[@value='friday']")
    private WebElement friday;

    @FindBy(xpath = "//span[text()='Weekly every 1 week on Monday, Friday']")
    private WebElement monFriText;

    @FindBy(xpath = "//label[@for=\"recurrence-repeats-view153\"]")
    private WebElement repeats;








    public void enterCalendarEventTitle(String titleValue) {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(title)).sendKeys(titleValue);
    }

    public void enterCalendarEventDescription(String description) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(descriptionFrame));
        descriptionTextArea.sendKeys(description);
        driver.switchTo().defaultContent();//exit from the frame
    }

    public void clickOnSaveAndClose() {
        BrowserUtils.wait(4);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndClose)).click();
    }

    public String getGeneralInfoTitleText() {
        BrowserUtils.waitForPageToLoad(20);
        return generalInfoTitle.getText();
    }

    public String getGeneralInfoDescriptionText() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Description']/following-sibling::div//div")));
        return generalInfoDescription.getText();
    }
//#############################################################

    public List<String> getColumnNames() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title='Create Calendar event']")));
        //if test fails then add the above wait statement.
        return BrowserUtils.getTextFromWebElements(columnNames);
    }

    public String getOwnerName() {
        BrowserUtils.waitForPageToLoad(30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-chosen")));
        wait.until(ExpectedConditions.visibilityOf(owner));
        return owner.getText().trim();

    }

    public void clickToCreateCalendarEvent() {
        BrowserUtils.waitForPageToLoad(20);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[title='Create Calendar event']")));
        wait.until(ExpectedConditions.elementToBeClickable(createCalendarEvent)).click();
        BrowserUtils.waitForPageToLoad(20);

    }

    public String getStartDate() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(startDate));
        BrowserUtils.scrollTo(startDate);
        return startDate.getAttribute("value");
    }

    public String getStartTime() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(startTime));
        BrowserUtils.scrollTo(startTime);
        return startTime.getAttribute("value");
    }

    public String getEndTime() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(endTime));
        BrowserUtils.scrollTo(endTime);
        return endTime.getAttribute("value");
    }

    //################################################################

    public void testCase1() {

        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(threeDots));

        BrowserUtils.wait(4);

        actions.moveToElement(threeDots).
                pause(3000).
                build().perform();

        BrowserUtils.wait(4);

        Assert.assertEquals(viewBtn.getAttribute("title"), "View");
        Assert.assertEquals(editBtn.getAttribute("title"), "Edit");
        Assert.assertEquals(deleteBtn.getAttribute("title"), "Delete");
        BrowserUtils.wait(4);
    }

    public void testCase2() {
        BrowserUtils.wait(3);
        gridSettings.click();
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.cssSelector("[id^=column-c]"));
        List<WebElement> checkboxTitle = Driver.getDriver().findElements(By.cssSelector("[for^=column-c]"));

        for (int i = 0; i < checkboxes.size(); i++) {
            String titleColumn = checkboxTitle.get(i).getText();
            if (checkboxes.get(i).isSelected() && titleColumn.contains("Title")) {
                continue;
            } else {
                checkboxes.get(i).click();
            }
            BrowserUtils.wait(3);
        }
        Assert.assertTrue(gridTitle.getText().equalsIgnoreCase("Title"), "Title is not displayed");
    }

    public void testCase3() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(5);
        expandBtn.click();
        BrowserUtils.wait(3);

        List<WebElement> options = Driver.getDriver().findElements(By.cssSelector("[type=\"submit\"]"));
        List<String> list = new ArrayList<>(Arrays.asList("Save And Close", "Save And New", "Save"));


        for (int i = 1; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), list.get(i - 1));
        }
        BrowserUtils.wait(4);
    }

    public void testCase4() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(3);
        cancelBtn.click();
        BrowserUtils.wait(3);

        Assert.assertEquals(subTitle.getText(), "All Calendar Events");
    }

    public void testCase5() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(3);
        String startTime = getStartTime();
        String endTime = getEndTime();
        String format = "h:mm a";

        long time = DateTimeUtilities.getTimeDifference(startTime, endTime, format);
        System.out.println(startTime);
        Assert.assertEquals(time, 1);
    }

    public void testCase6() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(5);
        startTime.click();
        BrowserUtils.wait(3);
        chooseATime.click();
        BrowserUtils.wait(3);

        Assert.assertEquals(endDate.getAttribute("value"),"10:00 PM");
    }

    public void testCase7() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(3);
        allDayEventCheckbox.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(allDayEventCheckbox.isSelected());
        Assert.assertTrue(startTime.isEnabled());
        Assert.assertTrue(endTime.isEnabled());
        Assert.assertTrue(startDate.isDisplayed());
        Assert.assertTrue(endDate.isDisplayed());
    }

    public void testCase8() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(3);
        repeatCheckbox.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(repeatCheckbox.isSelected());

        BrowserUtils.wait(3);
        Select daily = new Select(dailyOption);
        Assert.assertEquals(daily.getFirstSelectedOption().getText(), "Daily");
        List<WebElement> selectOptions = daily.getOptions();
        Assert.assertEquals(selectOptions.get(0).getText(), "Daily");
        Assert.assertEquals(selectOptions.get(1).getText(), "Weekly");
        Assert.assertEquals(selectOptions.get(2).getText(), "Monthly");
        Assert.assertEquals(selectOptions.get(3).getText(), "Yearly");

    }

    public void testCase9() {
        BrowserUtils.wait(3);
        createCalendarEvent.click();
        BrowserUtils.wait(4);
        repeatCheckbox.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(repeatCheckbox.isSelected());
        Assert.assertTrue(repeatEvery.isSelected());
        Assert.assertTrue(never.isSelected());
        Assert.assertEquals(summaryText.getText(), "Summary:");
        Assert.assertEquals(dailyText.getText(), "Daily every 1 day");
    }

    public void testCase10() {
        BrowserUtils.wait(4);
        createCalendarEvent.click();
        wait.until(ExpectedConditions.visibilityOf(repeatCheckbox)).click();
        //repeatCheckbox.click();
        BrowserUtils.wait(3);
        after.click();
        BrowserUtils.wait(3);
        tenOccurences.sendKeys("10");
        tenOccurences.click();
        BrowserUtils.wait(4);
        Assert.assertEquals(summaryText.getText(), "Summary:");
        Assert.assertEquals(dailyText.getText(), "Daily every 1 day");
        Assert.assertEquals(tenOccurenecesText.getText(), ", end after 10 occurrences");
    }

    public void testCase11() {
        BrowserUtils.wait(4);
        createCalendarEvent.click();
        wait.until(ExpectedConditions.visibilityOf(repeatCheckbox)).click();
        by.click();
        chooseAdate.click();
        Select selectMonth = new Select(selectMonths);
        selectMonth.selectByVisibleText("Nov");
        Select selectYear = new Select(selecYears);
        selectYear.selectByVisibleText("2021");
        select18.click();
        String actual = summaryText.getText()+dailyText.getText()+novemText.getText();
        String expected ="Summary:Daily every 1 day, end by Nov 18, 2021";
        Assert.assertEquals(actual,expected);
//        Assert.assertEquals(summaryText.getText(), "Summary:");
//        Assert.assertEquals(dailyText.getText(), "Daily every 1 day");
//        Assert.assertEquals(novemText.getText(), ", end by Nov 18, 2021");
    }

    public void testCase12() {
        BrowserUtils.wait(4);
        createCalendarEvent.click();
        wait.until(ExpectedConditions.visibilityOf(repeatCheckbox)).click();
        repeats.click();
        Select dailySelect = new Select(dailySelector);
        dailySelect.selectByVisibleText("Weekly");
        monday.click();
        friday.click();
        Assert.assertTrue(monday.isSelected());
        Assert.assertTrue(friday.isSelected());
        Assert.assertEquals(summaryText.getText(), "Summary:");
        Assert.assertEquals(monFriText.getText(), "Weekly every 1 week on Monday, Friday");
    }
}


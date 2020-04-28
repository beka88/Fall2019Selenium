package com.automation.homework_5;

import com.automation.pages.LoginPage;
import com.automation.pages.activities.CalendarEventsPage;
import com.automation.tests.vytrack.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class Homework_5 extends AbstractTestBase {

    LoginPage login = new LoginPage();
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Test
    public void testCase_1() {

        test = report.createTest("Verify view, edit, delete");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        BrowserUtils.wait(5);

        calendarEventsPage.testCase1();
        BrowserUtils.wait(5);

        test.pass("view, edit and delete verified");
    }

    @Test
    public void testCase_2() {

        test = report.createTest("Verify title column is displayed");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase2();
        test.pass("Title column is displayed");
    }

    @Test
    public void testCase_3() {

        test = report.createTest("Verify options are available");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase3();
        test.pass("Options are available");
    }

    @Test
    public void testCase_4() {

        test = report.createTest("Verify “All Calendar Events” page subtitle is displayed");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase4();
        test.pass("“All Calendar Events” page subtitle is displayed");
    }

    @Test
    public void testCase_5() {

        test = report.createTest("Verify that difference between end and start time is exactly 1 hour");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase5();
        test.pass("Verify that difference between end and start time is exactly 1 hour");
    }

    @Test
    public void testCase_6() {

        test = report.createTest("Verify that end time is equals to “10:00 PM");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase6();
        test.pass("Verify that end time is equals to “10:00 PM");
    }

    @Test
    public void testCase_7() {

        test = report.createTest("test case 7");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase7();
        test.pass("test case 7");
    }

    @Test
    public void testCase_8() {

        test = report.createTest("Verify that “Repeat” checkbox is selected");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase8();
        test.pass("Verify that “Repeat” checkbox is selected");
    }

    @Test
    public void testCase_9() {

        test = report.createTest("Verify repeat,repeat every,never and texts");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();

        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        calendarEventsPage.testCase9();
        test.pass("Verify repaet,repeat every,never and texts");
    }

    @Test
    public void testCase_10() {

        test = report.createTest("Verify Summary: Daily every 1 day, endafter 10 occurrences");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();
        BrowserUtils.wait(5);
        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        BrowserUtils.wait(5);
        calendarEventsPage.testCase10();
        test.pass("Verify Summary: Daily every 1 day, end after 10 occurrences");
    }

    @Test
    public void testCase_11() {

        test = report.createTest("Verify Summary: Daily every 1 day, end by Nov 18, 2021”");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();
        BrowserUtils.wait(5);
        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        BrowserUtils.wait(5);
        calendarEventsPage.testCase11();
        test.pass("Verify Summary: Daily every 1 day,end by Nov 18, 2021”");
    }

    @Test
    public void testCase_12() {

        test = report.createTest("Summary: Weekly every 1 week onMonday, Friday");
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        loginPage.login();
        BrowserUtils.wait(5);
        calendarEventsPage.navigateTo("Activities", "Calendar Events");
        BrowserUtils.wait(5);
        calendarEventsPage.testCase12();
        test.pass("Summary: Weekly every 1 week onMonday, Friday");
    }
}

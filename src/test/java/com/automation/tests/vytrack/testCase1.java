package com.automation.tests.vytrack;

import com.automation.pages.LoginPage;
import com.automation.pages.fleet.VehiclesModelPage;
import com.automation.tests.vytrack.AbstractTestBase;
import org.testng.annotations.Test;

public class testCase1 extends AbstractTestBase {


      @Test
    public void NewVehicleModel(){
          LoginPage loginPage = new LoginPage();
          VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

          loginPage.login();
          vehiclesModelPage.navigateTo("Fleet","Vehicles Model");
          vehiclesModelPage.clickCreateModel();
          vehiclesModelPage.setcreateModel();
      }
}

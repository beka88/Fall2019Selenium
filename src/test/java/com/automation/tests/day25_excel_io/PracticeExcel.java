package com.automation.tests.day25_excel_io;

import com.automation.utilities.ExcelUtil;
import org.testng.annotations.Test;

public class PracticeExcel {

    @Test
    public void readExcelSheet(){

        ExcelUtil newPage = new ExcelUtil("VytrackTestUsers.xlsx","QA1-short");
        String firstCell = newPage.getCellData(1,3);
        System.out.println(firstCell);
        int num = newPage.getDataArray().length;
        System.out.println(num);
        int num2 = newPage.getDataList().size();
        System.out.println(num2);
        boolean itContains= newPage.getColumnsNames().contains("password");
        System.out.println(itContains);



    }
}

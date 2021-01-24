package com.syntax.Class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\src\\com\\syntax\\Class36\\Test2.XLSX";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("sheet1");
        List<PersonInfo> personInfoList=new ArrayList<>();
        for (int i=1; i<sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            PersonInfo personInfo = new PersonInfo();
            personInfo.setFirstName(row.getCell(0).getStringCellValue());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int) row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            personInfoList.add(personInfo);
        }
        System.out.println(personInfoList);
        }
    }


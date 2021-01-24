package com.syntax.Class36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) throws IOException {
        String InputPath = "C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\src\\com\\syntax\\Class36\\Salary.XLSX";
        FileInputStream fileInputStream=new FileInputStream(InputPath);
        String outputPath = "C:\\Users\\Qasim\\Desktop\\SDET\\SalaryOutput.XLSX";
        FileOutputStream fileOutputStream=new FileOutputStream(outputPath);
        XSSFWorkbook InputExcel=new XSSFWorkbook(fileInputStream);
        XSSFWorkbook OutputExcel=new XSSFWorkbook();
        Sheet sheet=InputExcel.getSheet("sheet1");
        List<PersonInfo> personInfoList=new ArrayList<>();
        for (int i=1; i<sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            PersonInfo personInfo = new PersonInfo();
            personInfo.setFirstName(row.getCell(0).getStringCellValue());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int) row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if (personInfo.getSalary() > 100000) {
                personInfoList.add(personInfo);
            }
        }
        System.out.println(personInfoList);

        XSSFSheet outputsheet= OutputExcel.createSheet("Output Sheet");
        for (int i=0;  i < personInfoList.size(); i++) {
            XSSFRow row = outputsheet.createRow(i);
            PersonInfo personInfo=personInfoList.get(i);
            row.createCell(0).setCellValue(personInfoList.get(i).getFirstName());
            row.createCell(1).setCellValue(personInfoList.get(i).getLastName());
            row.createCell(2).setCellValue(personInfoList.get(i).getAge());
            row.createCell(3).setCellValue(personInfoList.get(i).getSalary());

        }
        OutputExcel.write(fileOutputStream);
    }
}

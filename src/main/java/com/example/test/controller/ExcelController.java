package com.example.test.controller;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.sql.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelController {

    private static final String JDBC_URL = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    public void createExcelFile() throws SQLException {
        try(Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT * FROM weapon_table";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Weapon Data");

            int rowNumber = 0;
            Row headerRow = sheet.createRow(rowNumber++);
            headerRow.createCell(0).setCellValue("ID");
            headerRow.createCell(1).setCellValue("Name");
            headerRow.createCell(2).setCellValue("Type");
            headerRow.createCell(3).setCellValue("Description");
            headerRow.createCell(4).setCellValue("Rarity");
            headerRow.createCell(5).setCellValue("Damage");
            headerRow.createCell(6).setCellValue("Weight");
            headerRow.createCell(7).setCellValue("Price");

            while(resultSet.next()) {
                Row dataRow = sheet.createRow(rowNumber++);
                dataRow.createCell(0).setCellValue(resultSet.getInt("id"));
                dataRow.createCell(1).setCellValue(resultSet.getInt("name"));
                dataRow.createCell(2).setCellValue(resultSet.getInt("type"));
                dataRow.createCell(3).setCellValue(resultSet.getInt("description"));
                dataRow.createCell(4).setCellValue(resultSet.getInt("rarity"));
                dataRow.createCell(5).setCellValue(resultSet.getInt("damage"));
                dataRow.createCell(6).setCellValue(resultSet.getInt("weight"));
                dataRow.createCell(7).setCellValue(resultSet.getInt("price"));

            }

            String filePath = "C:\\Users\\the_barbarian\\weapon_data.xlsx";
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
            workbook.close();

            System.out.println("Файл Excel створений та збережений успішно");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.testing.selenium.testing.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeeArchivoExcel {

	public LeeArchivoExcel() {
		
	}
	
	/**
	 * Metodo que lee de forma general una hoja excel
	 * 
	 * @param filePath  Direccion para econtrar el archivo excel
	 * @param sheetName Nombre de la hoja dentro del libro excel que leerá
	 * @throws IOException 
	 */
	public void leeExcel(String filePath, String sheetName) throws IOException {
		
		File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file); 
		
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		
		for(int i=0; i<rowCount; i++) {
			
			XSSFRow row = newSheet.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++) {
				
				System.out.println(row.getCell(j).getStringCellValue() + "||");
				
			}
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 * @throws IOException 
	 */
	public String getCellValue(String filePath, String sheetName, int rowNumber, int cellNumber) throws IOException {
		
		File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file); 
		
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell cell = row.getCell(cellNumber);
		
		return cell.getStringCellValue();
	}
	
}

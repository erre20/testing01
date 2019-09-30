package com.testing.selenium.testing.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscribeArchivoExcel {

	public EscribeArchivoExcel() {
		
	}
	
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param dataWrite
	 * @throws IOException 
	 */
	public void escribeExcel(String filePath, String sheetName, String[] dataWrite) throws IOException {
		
		File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
		
		XSSFRow row = newSheet.getRow(0);
		
		XSSFRow newRow = newSheet.createRow(rowCount+1);
		
		for(int i = 0; i<row.getLastCellNum(); i++) {
			
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataWrite[i]);
			
		}
		
		inputStream.close();
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		newWorkbook.write(outputStream);
		
		outputStream.close();
		
	}
	
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param rowNumber
	 * @param CellNumber
	 * @param resultText
	 * @throws IOException
	 */
	public void escribeValorCelda(String filePath, String sheetName, int rowNumber, int CellNumber, String resultText) throws IOException{
		
		File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell firstCell = row.getCell(CellNumber-1);
		
		System.out.println("Valor primera celda es: " + firstCell.getStringCellValue());
		
		XSSFCell netxCell = row.createCell(CellNumber);
		
		netxCell.setCellValue(resultText);
		
		System.out.println("Valor siguiente celda es: " + netxCell.getStringCellValue());
		
		inputStream.close();
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		newWorkbook.write(outputStream);
		
		outputStream.close();
		
	}
	
}

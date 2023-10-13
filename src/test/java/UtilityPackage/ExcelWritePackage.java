package UtilityPackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelWritePackage {
	
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	Row row;
	Cell cell;
	
	public void writeExcel(String sheetName,int rowNum,int cellNum) {
		
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet(sheetName);
		row = sheet.getRow(rowNum);
		
		if(row == null) {
			row =sheet.createRow(rowNum);	
		}
		
		row.createCell(cellNum);
		
	}

}

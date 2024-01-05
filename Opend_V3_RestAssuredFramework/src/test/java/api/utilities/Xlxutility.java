package api.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlxutility 
{
	public FileOutputStream fileOutput;
	public FileInputStream fileInput;
	public XSSFWorkbook workbook;
	public XSSFSheet getsheet;
	public XSSFRow row;
	public XSSFCell cell;
	public String path=null;

	public Xlxutility(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		fileInput=new FileInputStream(path);
		workbook=new XSSFWorkbook(fileInput);
	    getsheet = workbook.getSheet(sheetName);
		int rowcount=getsheet.getLastRowNum();
        workbook.close();
        fileInput.close();
        return rowcount;
	}
	
	public int getCellCount(String sheetName,int rownum) throws IOException
	{
		fileInput=new FileInputStream(path);
	    workbook=new XSSFWorkbook(fileInput);
	    getsheet=workbook.getSheet(sheetName);
		row=getsheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		workbook.close();
		fileInput.close();
		return cellcount;
	}
	
	public String getCellData(String sheetName,int rownum,int cellnum) throws IOException
	{	
		fileInput=new FileInputStream(path);
		workbook=new XSSFWorkbook(fileInput);
		getsheet=workbook.getSheet(sheetName);
	    row=getsheet.getRow(rownum);
	    cell = row.getCell(cellnum);
	    
	   DataFormatter formatter=new DataFormatter();
	   String data;
	   try {
	         data=formatter.formatCellValue(cell);
	   }
	   catch(Exception e)
	   {	
		   data="";
	   }
	   workbook.close();
	   fileInput.close();
	   return data;
	}
	
	public void setCellData(String sheetname,int rownum,int cellnum, String data) throws IOException
	{
		fileInput=new FileInputStream(path);
		workbook=new XSSFWorkbook(fileInput);
		workbook.getSheet(sheetname);
		
		row=getsheet.getRow(rownum);
		cell=row.createCell(cellnum);
		cell.setCellValue(data);
		
	    fileOutput=new FileOutputStream(path);
		workbook.write(fileOutput);
		workbook.close();
		fileInput.close();
		fileOutput.close();
	}

	
	
}

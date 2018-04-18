package com.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_read 
{
	
	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		File f = new File("C:\\Users\\USER\\Documents\\sample.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("test");
		
		int rcnt = ws.getLastRowNum();
		System.out.println("Row*****"+rcnt);
		
		int c = ws.getRow(rcnt).getLastCellNum();
		//System.out.println("column****"+c);
		
		for(int i=0;i<=rcnt-1;i++)
		{
			int c1 = ws.getRow(i).getLastCellNum();

			for(int j=0;j<c;j++)
			{
				String str = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(str);
			}
			
			
			
			
		}
	
		
		
		
		
	}
	
	

}

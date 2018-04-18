package com.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_excelwrite {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/index.php");
		//driver.findElement(By.xpath("//*[text()='Staff ']")).click();
		//WebElement b = driver.findElement(By.xpath("//*[@name='submitBtn']"));
		
		
		List<WebElement> data = driver.findElements(By.xpath("//*[text()='Features']/preceding-sibling::p/following-sibling::ul/li"));
		int rowcount  = data.size();

		File f = new File("C:\\Users\\USER\\Documents\\sample.xlsx");

			FileInputStream ip = new FileInputStream(f);
			
			//System.out.println("Excel Found");		
			//System.out.println("Excel not Found");
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet ws = wb.getSheet("test");
		System.out.println(ws+ "Sheet selected");
		
		for(int i=0,j=0;i<rowcount;i++)
		{
			
		Cell cell = ws.createRow(i).createCell(j);
		String s = data.get(i).getText();
		cell.setCellValue(s);
		
		
		}
		
		FileOutputStream fot = new FileOutputStream(f);
		wb.write(fot); 
		fot.close();
		wb.close();
		
		
	}


	}
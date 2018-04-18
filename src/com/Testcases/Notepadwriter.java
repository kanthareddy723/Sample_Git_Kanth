package com.Testcases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Notepadwriter 
{
	@Test
	public static void excel() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://server/bank/");
		File f = new File("C:\\Users\\USER\\Desktop\\Umakanth\\PersonalBanking.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//PrintWriter pw = new PrintWriter(f);
		
				
		List<WebElement> lst = driver.findElements(By.xpath("//*[contains(text(),'AL')]/following-sibling::ul/li"));
		int a = lst.size();
		
		for(int i=0;i<a;i++)
		{
			String str = lst.get(i).getText();
			System.out.println(str);
			//pw.println(str);
			bw.write(str);
			bw.newLine();
			bw.write("  ");
			bw.newLine();
			
		}
		bw.flush();
		bw.close();
	}
	
	
}

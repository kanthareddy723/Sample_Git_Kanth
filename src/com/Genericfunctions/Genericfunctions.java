package com.Genericfunctions;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;



/*************************************************


Function Name:waitforelement

Purpose:-This Function is used to wait for element until page loaded

Input Parameters:- n/a

Output Parameters:-n/a

Author:- K.Umakanth 

Creation date:-04/03/2018(format:dd/mm/yyyy)
Review :- yes
Modified date :04/03/2018(format:dd/mm/yyyy)

**************************************************/






public class Genericfunctions 
{
	public static WebDriver driver = new FirefoxDriver();
	public static SoftAssert asrt = new SoftAssert();
	public static boolean status ;
	
	
	
	//boolean method 
	public static boolean waitforelement(WebElement element) 
	{
		boolean status = true;
		
		//loop continuous until element is found for 10
		for(int i=0;i<=10;i++)
		{

			
			asrt.assertEquals(status, true);
			System.out.println("Loop Started");
			try
			{	
					status = true;
					//move to element by using actions class
					Actions act = new Actions(driver);
					act.moveToElement(element).build().perform();
					System.out.println("Element found");
					break;
			}
			catch(Exception e)
			{
				status = false;
				try
				{
					//sleep for 1 sec again 
					Thread.sleep(1000);
				}catch(Exception e1)
				{
					
				}
				
				System.out.println("Element not found");
				
			}
			
			
		}//for loop exit
		
		System.out.println("loop closed");
		return status;	
		
	}
	
	
}

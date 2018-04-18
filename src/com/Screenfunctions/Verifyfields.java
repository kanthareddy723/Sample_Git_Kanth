package com.Screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Genericfunctions.Genericfunctions;

public class Verifyfields extends Genericfunctions {

	@FindBy(how = How.XPATH, using = "//*[text()='Admin ']")
	WebElement lnk_login_adminlnk;
	
	@FindBy(how = How.XPATH, using = "//input[@name='uname']")
	WebElement edi_login_username;
	
	@FindBy(how = How.XPATH, using = "//input[@name='pwd']")
	WebElement edi_login_password;

	@FindBy(how = How.XPATH, using = "//input[@name='submitBtn']")
	WebElement btn_login_button;

	public void verif_fields() {

		status = waitforelement(edi_login_username);
		/*
		if (status) {
			Boolean a = edi_login_verifyusername.isDisplayed();
			asrt.assertEquals(a, true);
		}*/
		
boolean status=true;
		
	try
	{
		lnk_login_adminlnk.click();
	}
	catch(Exception e3)
	{
		System.out.println("link not found");
	}
	try
		{
			
			edi_login_username.click();
			edi_login_username.clear();
			edi_login_username.sendKeys("admin");
			
		}
		
		catch(Exception e)
		{
			status=false;
		}
		
		
		if(status)
		{
			
			try
			{
				
				edi_login_password.click();
				edi_login_password.clear();
				edi_login_password.sendKeys("admin");
				
			}
			
			catch(Exception e)
			{
				status=false;
			}
			
			//Based on the Password status Click on the Login Button
			
			try
			{
				btn_login_button.click();
								
			}
			
			catch(Exception e)
			{
				status=false;
			}
			
			
			System.out.println("Login Sucuess");
		}
		
		
		
		
		
		

	}
}

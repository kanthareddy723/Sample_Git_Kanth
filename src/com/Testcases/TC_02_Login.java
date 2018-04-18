package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Genericfunctions.Genericfunctions;
import com.Screenfunctions.Verifyfields;



@Listeners(com.Genericfunctions.TestNGListeners.class)

public class TC_02_Login extends Genericfunctions
{
	
	
	@Test
public static void login1()
{
		driver.manage().window().maximize();
		driver.get("http://server/bank/");
		Verifyfields vrfy = PageFactory.initElements(driver, Verifyfields.class);
		vrfy.verif_fields();
}
	
}

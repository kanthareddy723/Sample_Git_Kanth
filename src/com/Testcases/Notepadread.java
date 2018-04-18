package com.Testcases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class Notepadread 
{
	@Test
	public static void read() throws IOException
	{
		File f = new File("C:\\Users\\USER\\Desktop\\Umakanth", "PersonalBanking.txt");
		FileReader fr = new  FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str  = br.readLine();
		System.out.println(str);
	
	}
	
}

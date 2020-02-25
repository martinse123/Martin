package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CommonLib extends BaseClass
{

	
	
	public static String readElement(String element) {
		
		Properties prop = new Properties();
		File file = new File("D:\\Martinworkspace\\POM\\Config\\Element.properties");
		String elementValue=""; 
		FileInputStream fileInput = null;
		
		try 
		{
			fileInput = new FileInputStream(file);			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			prop.load(fileInput);
			elementValue = prop.getProperty(element);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return elementValue;
	}
	
	
public static String readData(String data) {
		
		Properties prop = new Properties();
		File file = new File("D:\\Martinworkspace\\POM\\Config\\Data.properties");
		String dataValue=""; 
		FileInputStream fileInput = null;
		
		try 
		{
			fileInput = new FileInputStream(file);			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			prop.load(fileInput);
			dataValue = prop.getProperty(data);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return dataValue;
	}
	
}





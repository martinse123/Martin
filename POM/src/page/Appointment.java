package page;

import org.openqa.selenium.By;


import core.CommonLib;

public class Appointment extends CommonLib


{
	By eleClose = By.xpath(CommonLib.readElement("POPUPCLOSE"));
	By elem = By.id(CommonLib.readElement("CALLING_PAGE_FRAME1"));
	By elecastile = By.xpath(CommonLib.readElement("CAS_TILE"));
	By eleoptile = By.xpath(CommonLib.readElement("OP_TILE"));

	
	//public void popupClose(String popupxid) throws InterruptedException 
	public void popupClose() throws InterruptedException 
	{

		//driver.switchTo().activeElement();
		//driver.findElement(eleClose).click();
        driver.findElement(eleClose).click();
	}
	
	public void appselector() throws InterruptedException
	{
		driver.findElement(By.id("imgApp")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(elem));
		Thread.sleep(4000);
		driver.findElement(elecastile).click();
		
		Thread.sleep(4000);
	}
	
}

package page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import core.BaseClass;
import core.CommonLib;

public class Login extends CommonLib {

	By eleUserName = By.id(CommonLib.readElement("ELEUSERNAME"));
	By elePassword = By.id(CommonLib.readElement("ELEPASSWORD"));
	By eleButtonLogin = By.id(CommonLib.readElement("ELEBUTTONLOGIN"));
	By invalidPopup = By.id(CommonLib.readElement("INVALID_POPUP"));
	By fstpopup = By.id(CommonLib.readElement("FSTPOPUP"));
//	By demoUSerNAme = By.cssSelector(CommonLib.readElement("USERNAME_CSS"));

	public void login(String usn, String pwd) throws InterruptedException {

//		driver.findElement(demoUSerNAme).sendKeys(usn);
//		Thread.sleep(10000);
		driver.findElement(eleUserName).sendKeys(usn);
		driver.findElement(elePassword).sendKeys(pwd);
		driver.findElement(eleButtonLogin).click();
	}

	public String getloginErrorMsg() 
	{
		String msg = driver.findElement(invalidPopup).getText();
		return msg;

	}
	
	public String getfirstPopUP()
	{
		String popuptxt = driver.findElement(fstpopup).getText();	
		return popuptxt;
	}

}

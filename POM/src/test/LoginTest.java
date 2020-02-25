package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.BaseClass;
import core.CommonLib;
import page.Login;

public class LoginTest extends BaseClass{
	Login objLogin = new Login();
	
	@Test
	public void TClogin01() throws InterruptedException 
	{
		
		String tempUserName = CommonLib.readData("VALIDUSERNAME");
		String tempPassword = CommonLib.readData("VALIDPASSWORD");
		objLogin.login(tempUserName,tempPassword);
		Thread.sleep(4000);
		String popuptxt = objLogin.getfirstPopUP();
		Assert.assertEquals(popuptxt,CommonLib.readData("LOGINSUCCESS"));
	}
	
	
	@Test
	public void TClogin02() throws InterruptedException 
	{
		
		String tempUserName = CommonLib.readData("INVALIDUSERNAME");
		String tempPassword = CommonLib.readData("INVALIDPASSWORD");
		objLogin.login(tempUserName,tempPassword);
		Thread.sleep(1000);
		String msg = objLogin.getloginErrorMsg();
		assertEquals(msg,CommonLib.readData("MSG_INVALID_USER"));
		Thread.sleep(4000);
	}
	@Test
	public void TClogin03() throws InterruptedException 
	{
		
		String tempUserName = CommonLib.readData("BLANKUSERNAME");
		String tempPassword = CommonLib.readData("BLANKPASSWORD");
		objLogin.login(tempUserName,tempPassword);
		Thread.sleep(1000);
		String msg = objLogin.getloginErrorMsg();
		assertEquals(msg,CommonLib.readData("MSG_BLANK_CRED"));
		Thread.sleep(4000);
	}
	
}

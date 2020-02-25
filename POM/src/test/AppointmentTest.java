package test;

import org.testng.annotations.Test;

import core.BaseClass;
import core.CommonLib;
import page.Appointment;
import page.Login;

public class AppointmentTest extends BaseClass
{
	Login objLogin = new Login();
	Appointment objApnt = new Appointment();
	
	@Test
	public void TCappointment01() throws InterruptedException
	{
		
		String tempUserName = CommonLib.readData("VALIDUSERNAME");
		String tempPassword = CommonLib.readData("VALIDPASSWORD");
		objLogin.login(tempUserName,tempPassword);
		Thread.sleep(4000);
		objApnt.popupClose();
		objApnt.appselector();
	}
	
}

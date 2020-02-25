package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;

	@BeforeMethod
	public static void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MJ\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mediwarecloud.com/MediwareQC/login.aspx");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@AfterMethod
	public static void close() {
		driver.close();
	}

}

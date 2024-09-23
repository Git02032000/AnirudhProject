package com.asse;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HRMTest {
@Test
	public void OHRM() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String ACT = driver.getCurrentUrl();
		String Exp="https://opensource-demo.orangehrmlive.com/web/index.php/auth/log";
		SoftAssert SA=new SoftAssert();
		SA.assertTrue(ACT.equals(Exp));
		driver.findElementByXPath("//input[@name='username']").sendKeys("Admin");
		driver.findElementByXPath("//input[@name='password']").sendKeys("admin123");
	}
	
}

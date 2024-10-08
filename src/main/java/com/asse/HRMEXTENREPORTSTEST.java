package com.asse;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HRMEXTENREPORTSTEST {
public static ChromeDriver driver;
public static int i=0;
public static ExtentReports report;
public static ExtentTest test;

@BeforeSuite
public void begin()
{
	report =new ExtentReports(".//reports//ProjectReport.html",true);
	test=report.startTest("Verify user login to orange HRM application");
	
}
	@Test
	public void hrm() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "ScreenMaximized"+test.addScreenCapture(snap()));
		driver.findElementByXPath("//input[@name='username']").sendKeys("Admin");
		test.log(LogStatus.PASS, "EnteredUserName"+test.addScreenCapture(snap()));
		driver.findElementByXPath("//input[@name='password']").sendKeys("admin123");
		test.log(LogStatus.PASS, "EnteredPassword"+test.addScreenCapture(snap()));
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(7000);
		test.log(LogStatus.PASS, "HomePage"+test.addScreenCapture(snap()));
		
	}
	
	public String snap() throws IOException
	{
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		dummy=dest.getAbsolutePath();
		}
		return dummy;
	}
		@AfterSuite
		public void end()
		{
			report.endTest(test);
			report.flush();
		}
}

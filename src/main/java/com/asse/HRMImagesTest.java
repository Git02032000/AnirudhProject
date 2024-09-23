package com.asse;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMImagesTest {
public static ChromeDriver driver;
public static int i=0;

@Test
	public void hrm() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	    HRMImagesTest ht=new HRMImagesTest();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		ht.snap();
		driver.findElementByXPath("//input[@name='username']").sendKeys("Admin");
		ht.snap();
		driver.findElementByXPath("//input[@name='password']").sendKeys("admin123");
		ht.snap();
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(7000);
		ht.snap();
	}
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		
		}
		
	}

}

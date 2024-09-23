package com.req;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test(enabled=false)
	public void AZ()
	{
			System.setProperty("webdriver.chrome.driver",".//drivers//Chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
	}

}

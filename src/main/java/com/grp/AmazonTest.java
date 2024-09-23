package com.grp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test(groups= {"regressoin"})
	public void AZ()
	{
			System.setProperty("webdriver.chrome.driver",".//drivers//Chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
	}


}

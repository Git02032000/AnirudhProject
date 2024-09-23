package com.grp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
	@Test(groups={"sanity"})
	public void Fb()
	{
			System.setProperty("webdriver.chrome.driver",".//drivers//Chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
	}

}

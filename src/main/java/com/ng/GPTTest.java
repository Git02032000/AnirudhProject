package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GPTTest {
	@Test(invocationCount=2,invocationTimeOut=8000)
	public void CGPT()
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chatgpt.com/");
		driver.manage().window().maximize();
	}

}

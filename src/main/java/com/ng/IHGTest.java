package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IHGTest {
	@Test 
public void IHG()
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ihg.com/hotels/us/en/reservation");
	driver.manage().window().maximize();
	
	
}
}

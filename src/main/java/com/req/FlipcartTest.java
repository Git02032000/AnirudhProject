package com.req;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipcartTest {
@Test(enabled=false)
public void Shop()
{
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();

}
	
}

package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GuruAuto {

	private static ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
Actions a=new Actions(driver);
WebElement button2 = driver.findElement(By.xpath("//button[text()[contains(.,'Double-Click Me To See Alert')]]"));
a.doubleClick(button2).build().perform();
	
	}

}

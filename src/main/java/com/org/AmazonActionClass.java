package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
Actions a=new Actions(driver);
WebElement accounts = driver.findElement(By.xpath("//span[text()[contains(.,'Account & Lists')]]"));
WebElement button = driver.findElement(By.xpath("//span()[text()[contains(.,'Music Library')]]"));
a.moveToElement(accounts).moveToElement(button).click().build().perform();

	}


}

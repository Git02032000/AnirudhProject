package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
Actions a=new Actions(driver);
WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
//a.sendKeys(username, "Demo1").build().perform();
//a.sendKeys(password, "Text1").build().perform();
a.moveToElement(username).sendKeys("Demo1").build().perform();
a.moveToElement(password).sendKeys("Text1").build().perform();

	}

}

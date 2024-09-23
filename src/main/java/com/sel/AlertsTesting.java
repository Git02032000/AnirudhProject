package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@id='alertButton']")).click();
Alert at = driver.switchTo().alert();
at.accept();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
at.dismiss();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='promtButton']")).click();
at.sendKeys("Rama");
at.accept();
	}

}

package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
//driver.switchTo().frame(1);
WebElement boarder = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(boarder);
WebElement abc = driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement xyz = driver.findElement(By.xpath("//div[@id='droppable']"));
Actions a=new Actions(driver);
a.dragAndDrop(abc, xyz).build().perform();

	}

}

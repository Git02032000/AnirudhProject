package com.sel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJavascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
       
        ChromeDriver driver = new ChromeDriver();

        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
  
        JavascriptExecutor jse = (JavascriptExecutor) driver;
      
        jse.executeScript("window.scrollBy(0,800);");
        Thread.sleep(2000); 
        
        jse.executeScript("window.scrollBy(500,0);");
        Thread.sleep(2000); 

        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000); 
       
        jse.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000); 

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        driver.quit();
    }
}

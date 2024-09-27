package com.cjc.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndexPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Desktop\\CJC\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uid")).sendKeys("cjc");
		driver.findElement(By.name("pass")).sendKeys("cjc@123");
		WebElement wb=driver.findElement(By.tagName("select"));
		Select s=new Select(wb);
		s.selectByIndex(1);
		
		driver.findElement(By.className("rem")).click();
		//driver.findElement(By.id("login")).click();
		
		//driver.findElement(By.linkText("Password?")).click();
		driver.findElement(By.partialLinkText("Pass")).click();
		
	}

}

package com.cjc.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexHtml1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Desktop\\CJC\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button/preceding-sibling::input[2]")).sendKeys("cjc");//preceding
		driver.findElement(By.xpath("//label[3]/preceding-sibling::input[1]")).sendKeys("cjc@123");
		
		
		
		
	}

}

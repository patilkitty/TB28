package com.cjc.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndexHtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Desktop\\CJC\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[1]/child::input[1]")).sendKeys("cjc");
		driver.findElement(By.xpath("//div[1]/child::input[2]")).sendKeys("cjc@123");
//		WebElement w=driver.findElement(By.xpath("//div[1]/child::select"));//child
//		Select s=new Select(w);
//		s.selectByVisibleText("Firefox");
		
		
		WebElement w=driver.findElement(By.xpath("//option[2]/parent::select"));
		Select s=new Select(w);
		s.selectByValue("firefox");
		driver.findElement(By.xpath("//div[1]/child::label[3]")).click();
}
}
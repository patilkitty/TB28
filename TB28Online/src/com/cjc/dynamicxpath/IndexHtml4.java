package com.cjc.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndexHtml4 {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Desktop\\CJC\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input/following-sibling::*[4]")).sendKeys("cjc@123");
		
		WebElement wb=driver.findElement(By.xpath("//input[2]/following-sibling::*[3]"));
		Select d=new Select(wb);
		d.selectByVisibleText("Firefox");
		
//		WebElement wb=driver.findElement(By.xpath("//label[3]/preceding-sibling::*[3]"));
//		Select s=new Select(wb);
//		s.selectByValue("ie");
//		driver.findElement(By.xpath("//button/preceding-sibling::*[1]")).click();
		
		
		
}

}

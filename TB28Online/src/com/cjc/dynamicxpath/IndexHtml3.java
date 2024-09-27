package com.cjc.dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexHtml3 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Desktop\\CJC\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Kiran_Patil/Selenium/index%20(1)/index%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[1]/following-sibling::input")).sendKeys("cjc");
		driver.findElement(By.xpath("//select/following-sibling::label/input")).click();
		driver.findElement(By.xpath("//input[1]/following-sibling::button")).click();

}
}
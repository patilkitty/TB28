package com.cjc.wedrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adhya\\Desktop\\CJC\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		System.out.println("##############################################################");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		
		Set<String> whm=driver.getWindowHandles();
		System.out.println(whm);
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}

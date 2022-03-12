package com.seleniumdemo.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionWidnowDemo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String url = "https://www.selenium.dev/";
		
		driver.navigate().to(url);
		
		Point point = driver.manage().window().getPosition();
		
		System.out.println(point);
		
		System.out.println(point.getX());
		
		System.out.println(point.getY());
		
		Thread.sleep(5000);
		
		driver.manage().window().setPosition(new Point(50,50));
		
		point = driver.manage().window().getPosition();
		
		System.out.println(point);
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		System.out.print("End of the Program.........."+new Date());
	}
}

package alertDemo;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		
		String mainwindowid = driver.getWindowHandle();
		
		
		Set<String> setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		
		
		driver.findElement(By.id("tabButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("windowButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		Thread.sleep(5000);
		
		driver.findElement(By.id("messageWindowButton")).click();
		setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		Thread.sleep(5000);
		
		
		for( String  winid :setofwidnows){
			
			System.out.println(setofwidnows.size()+"............currently opened windows size");
			driver.switchTo().window(winid);
			
			if(!winid.equalsIgnoreCase(mainwindowid)){
				Thread.sleep(2000);
				driver.close();
				setofwidnows=driver.getWindowHandles();
			}
		}

		Thread.sleep(5000);
		System.out.println("=============================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}

package alertDemo;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
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

public class AlertDemoPrompt {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Begining of program......................." + new Date());
		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demoqa.com/alerts";
		driver.get(url);

		driver.findElement(By.id("promtButton")).click();
		
		
		Alert promptAlert  = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.alertIsPresent());
		promptAlert.sendKeys("Accepting the alert");
		
		Alert alert = driver.switchTo().alert();
		
		if(alert!=null){
			System.out.println(alert.getText()+".........................alert box text message");
			alert.sendKeys("Test User");
			Thread.sleep(5000);
			alert.accept();
		}

		WebElement textele = driver.findElement(By.xpath("//span[contains(.,'You entered') and contains(.,'Test User')]"));

		System.out.println(textele.isDisplayed());
		
		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}

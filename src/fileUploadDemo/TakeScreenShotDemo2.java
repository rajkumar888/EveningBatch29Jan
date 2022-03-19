package fileUploadDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Begining of program......................." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "http://demo.guru99.com/test/upload/";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		SimpleDateFormat dateformat = new SimpleDateFormat("EEE dd_MMM_yyyy HH_mm_ss");

		WebElement fileupload = driver.findElement(By.cssSelector("#uploadfile_0"));

		String filepath = "C:/Users/Training/Desktop/Selenium-Reading-Material.pdf";
		fileupload.sendKeys(filepath);

		Thread.sleep(5000);

		File srcfilename = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String filename = dateformat.format(new Date());
		File destinationFileName = new File("D:/EveningWS/EveningJavaDemoDevLabs/Screeenshots/" + filename + ".png");
		Files.copy(srcfilename, destinationFileName);
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#terms")).click();
		WebElement submitbuttonelement = driver.findElement(By.cssSelector("#submitbutton"));
		
		srcfilename = ((TakesScreenshot) submitbuttonelement).getScreenshotAs(OutputType.FILE);
		filename = dateformat.format(new Date());
		destinationFileName = new File("D:/EveningWS/EveningJavaDemoDevLabs/Screeenshots/" + filename + ".png");
		Files.copy(srcfilename, destinationFileName);
		
		
		submitbuttonelement.click();
		Thread.sleep(5000);

		srcfilename = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		filename = dateformat.format(new Date());
		destinationFileName = new File("D:/EveningWS/EveningJavaDemoDevLabs/Screeenshots/" + filename + ".png");
		Files.copy(srcfilename, destinationFileName);
		Thread.sleep(5000);

		WebElement confirmationTextEle = driver
				.findElement(By.xpath("//center[contains(.,'has been successfully uploaded.')]"));
		System.out.println(confirmationTextEle.isDisplayed() + "...................");

		driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}

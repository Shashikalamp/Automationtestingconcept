package Seleniumjavapracticecode;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot2 {

	public static void main(String[] args) throws IOException {
		//interface
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "/home/iram/Desktop/chromedriver-linux64/chromedriver");
		driver = new ChromeDriver();//Class it extends from WebDriver
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.2:8282/ems");
	  WebElement we =	driver.findElement(By.id("login_loginId"));
	
		//interface
	 TakesScreenshot screenshot = (TakesScreenshot) driver;
		File Source = screenshot.getScreenshotAs(OutputType.FILE);
		File Designation = new File("screenshot.png");
		FileUtils.copyFile(Source,Designation);
		System.out.println("Capture the image file " + Designation.getAbsolutePath());
		
	

	}

}

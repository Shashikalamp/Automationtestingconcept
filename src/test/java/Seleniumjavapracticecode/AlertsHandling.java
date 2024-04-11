package Seleniumjavapracticecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver" ,"/home/iram/Desktop/chromedriver-linux64/chromedriver");
	 driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.findElement(By.name("cusid")).sendKeys("5728");
	 driver.findElement(By.name("submit")).click();
Alert a = driver.switchTo().alert();
String alertmessage = driver.switchTo().alert().getText();
a.accept();
System.out.println("alert message from pop up window is "  + alertmessage);

	 
	 

	}

}

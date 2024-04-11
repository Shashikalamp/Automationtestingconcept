package Seleniumjavapracticecode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Test Scenario: Visit the Browserstack home page and click on the Get Started Free button.
public class moveToElement  {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/iram/Desktop/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(8000);
		driver.get("http://127.0.0.2:8282/ems");
	    Actions a = new Actions(driver);
		/*WebElement	element = driver.findElement(By.id("signupModalProductButton"));
		a.moveToElement(element).click();
		 Thread.sleep(5000);
		driver.navigate().back();*/
		Thread.sleep(5000);
		/*((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		 Thread.sleep(5000);*/

		WebElement from = driver.findElement(By.xpath("/html/body/div/div/div/div/main/div[1]/div[1]/div[1]/div/a"));
		 Thread.sleep(5000);
		 a.moveToElement(from).build().perform();
		WebElement to = driver.findElement(By.xpath("/html/body/div/div/div/div/main/div[1]/div[1]/div[3]/div/a"));
		 Thread.sleep(5000);
		

		 
	
		

	}

}

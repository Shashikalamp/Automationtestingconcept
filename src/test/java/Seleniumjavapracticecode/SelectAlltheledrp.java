package Seleniumjavapracticecode;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;




public class SelectAlltheledrp  {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "/home/iram/Desktop/chromedriver-linux64/chromedriver");
		driver = new ChromeDriver();//Class it extends from WebDriver
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement w = driver.findElement(By.id("state"));
		Select s = new Select(w);
	      List<WebElement> options = s.getOptions();
	System.out.println("Options are: ");
	for(WebElement op : options) {
		System.out.println(op.getText());
	}
	boolean as = s.isMultiple();
	System.out.println(as);
	WebElement e = s.getWrappedElement();
	File id = e.getScreenshotAs(OutputType.FILE);
	System.out.println(id);
	WebDriverWait ws = new WebDriverWait(driver, 10);
	ws.until(ExpectedConditions.elementToBeClickable(By.id("")));
	
		
		
	}
	

}

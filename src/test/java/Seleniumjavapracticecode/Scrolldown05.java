package Seleniumjavapracticecode;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scrolldown05 {
//How to scroll down on a web page in Selenium by defining the number of pixels 
	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "/home/iram/Desktop/chromedriver-linux64/chromedriver");
		driver = new ChromeDriver();//Class it extends from WebDriver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)","");
		
		//If a user needs to scroll up, they just need to modify the pixel value of the second parameter (in this case 350) to a negative value (-350).
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-50)","");
		//How to scroll down to an element in Selenium until it is visible
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement text = driver.findElement(By.xpath("//p[contains(text(), '© LambdaTest - Powered by OpenCart')]"));
	//	js.executeScript("arguments[0].scrollIntoView();", text);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//scrollBy(x,y)(horizonatl,vertical)
//js.executeScript("window.scrollBy(0,600)","");
//js.executeScript("window.scrollBy(0,-100)","");
//web e = "";
//js.executeScript("arguments[0].scrollIntoView();", e);
//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	

	}

}

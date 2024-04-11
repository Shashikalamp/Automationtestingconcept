 package Seleniumjavapracticecode;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/iram/Desktop/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/p/a")).click();
	String parentwindow = driver.getWindowHandle();
	Set<String>childwindow = driver.getWindowHandles();
	Iterator<String> Li = childwindow.iterator();
	while(Li.hasNext())
	{
		String childw1 = Li.next();
		if(parentwindow.equals(childw1)) {
			driver.switchTo().window(childw1);
		}
		System.out.println(driver.switchTo().window(childw1).getTitle());
		}
	driver.close();
	driver.switchTo().window(parentwindow);*/
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement destination = driver.findElement(By.id("column-b"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, destination).build().perform();
		
		
	}
		

	}



package Seleniumjavapracticecode;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FiledragAndDrop {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/iram/Desktop/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(5000);
	    Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.id("column-a"));
		
		WebElement to = driver.findElement(By.id("column-b"));
		a.dragAndDrop(from, to).build().perform();
		String srt = "Bangalore";
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i< srt.length();i++) {
			char ch = srt.charAt(i);
			set.add(ch);
		}
			 System.out.println("Unique characters in the string \"" + srt + "\":");	
			 
			 for(char ch :set) {
				 System.out.print(ch + " ");
			 }
	}
			
		
		
		
		
		
	}



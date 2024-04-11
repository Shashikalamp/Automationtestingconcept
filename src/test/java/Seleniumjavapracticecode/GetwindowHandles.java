package Seleniumjavapracticecode;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/home/iram/Desktop/chromedriver-linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/p/a")).click();
		String parentwindow = driver.getWindowHandle();
		 Set<String> childwindows = driver.getWindowHandles();
		//String se = driver.getTitle();
		//System.out.println(se);
		 Iterator<String> li = childwindows.iterator();
		 
		 while(!li.hasNext()) {
			 String childwindow1 = li.next();
			 if(parentwindow.equals(childwindow1)) {
				 driver.switchTo().window(childwindow1);
			
				String s =  driver.switchTo().window(childwindow1).getTitle();
				 System.out.println(s);
				 driver.close();
			 }
				 
		 }
		
		driver.switchTo().window(parentwindow);
		
		
		/*String s = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> li = windowHandles.iterator();
		while(li.hasNext()) {
			String childwindow = li.next();
			if(!s.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
					
			
			driver.close();
		}
			
		}
		
		driver.switchTo().window(s);*/
		

	}

}

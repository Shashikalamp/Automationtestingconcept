package Seleniumjavapracticecode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Codingchallenge1 {
	   WebDriver driver;

	    @Test
	        void app() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "/home/iram/Desktop/chromedriver-linux64/chromedriver");
           WebDriver driver = new ChromeDriver();
           Thread.sleep(3000);
           driver.get("https://lnkd.in/ddcs5QEj");
           System.out.println("Number of tags: " + gettagcount());
           ClickbtnRemove() ;
	    }
           int gettagcount() {
        	   List<WebElement> tags = driver.findElements(By.xpath("//div[@class = 'content']//ul/li"));
           }
           
         void ClickbtnRemove() {
        	 driver.findElement(By.xpath("/html/body/main/div/div[3]/button")).click();
         }
            String tagvalue() {
            	List<WebElement> tag2 = driver.findElements(By.xpath("//div[@class ='content']//ul/li"));
            	tag2.
                System.out.println("Number of tags: " + tag2.size());

            }
          
         
	    }
	    

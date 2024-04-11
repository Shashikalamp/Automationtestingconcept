package Seleniumjavapracticecode;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice05 {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "/home/iram/Desktop/chromedriver-linux64/chromedriver");
		driver = new ChromeDriver();//Class it extends from WebDriver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/");
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/a/div/span"));
		a.moveToElement(e).perform();
		driver.findElement(By.xpath("//*[@id=\"entry281_216477\"]/div/div/ul/li[1]/a")).click();
	List <WebElement> count = driver.findElements(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[5]"));
		System.out.println("Number of product are : " + count.size());
		List <WebElement> list =driver.findElements(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]"));
		for(WebElement apple : list) {

			System.out.println("Product details are  : " + apple.getText());
		}

		WebElement we = driver.findElement(By.id("input-sort-212434"));
		Select s = new Select(we);
		s.selectByVisibleText("Price (Low > High)");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		List<WebElement> li = driver.findElements(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]"));
		for(WebElement e1 : li) {

			System.out.println("Low to High Prices product and prize details : " + e1.getText());    
		}

	}


}

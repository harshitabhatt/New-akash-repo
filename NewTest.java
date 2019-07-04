package newpac;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {	
	 
	public WebDriver driver;
				   @Test
				   public static void verifytitle(){
					   System.setProperty("webdriver.chrome.driver", "D:\\V8\\chromedriver.exe");
					   WebDriver driver = new ChromeDriver();
				   driver.get("https://google.com");
				   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("API TESTING INTERVIEW QUESTIONS for 4 year experienced");
				   driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
			}

}
  
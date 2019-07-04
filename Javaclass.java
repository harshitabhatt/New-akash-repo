package newpac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import

public class Javaclass {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\V8\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();}
	
		   @test
		   public static void verifytitle(){
		   
		   driver.get("https://google.com");
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("API TESTING INTERVIEW QUESTIONS");
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

}}

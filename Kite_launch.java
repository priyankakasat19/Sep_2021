package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_launch
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		
		WebElement username=driver.findElement(By.xpath("//input[contains(@id,'userid')]"));
		username.sendKeys("AX6201");
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		password.sendKeys("Raj@1965");
		
		WebElement login=driver.findElement(By.xpath("//button"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement pin=driver.findElement(By.xpath("//input[contains(@id,'pin')]"));
		pin.sendKeys("227192");
		
		WebElement continuebt=driver.findElement(By.xpath("//button"));
		continuebt.click();
		
		Thread.sleep(2000);
		WebElement searchbt=driver.findElement(By.xpath("//input[contains(@icon,'search') or contains(@placeholder,'gold mcx')]"));
		searchbt.click();
		
	}
	
}

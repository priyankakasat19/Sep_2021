package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interface_locator
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
	//	WebElement loginbtn=driver.findElement(By.xpath("//*[@name='login']"));
	//	WebElement clickapage=driver.findElement(By.className("_8esh"));
	//	WebElement forgotpasswd=driver.findElement(By.linkText("Forgotten password?"));
	//	WebElement facebookpay=driver.findElement(By.linkText("Facebook Pay"));
	//	WebElement facebooklite=driver.findElement(By.partialLinkText("Facebook"));
		WebElement createapage=driver.findElement(By.partialLinkText("Create"));
			
		List <WebElement> l1=driver.findElements(By.tagName("a"));
		
		username.sendKeys("priyankakasat7@gmail.com");
		password.sendKeys("123456");
	//	loginbtn.click();
	//	clickapage.click();
//		facebookpay.click();
	//	facebooklite.click();
		createapage.click();
		System.out.println("No.of list= "+l1.size());
		
		
	
		
		
		
		
		
		
		
	}

}

package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.browserstack.com/");
		Thread.sleep(5000);
		
		Actions as = new Actions(driver); //Actions class is used to perform mouse and keyboard operations.
		WebElement element = driver.findElement(By.xpath("//button[@aria-label=\"Products\"]"));
		
		as.moveToElement(element).build().perform(); //mouse hovers over the element
		
		
	}
	
	

}

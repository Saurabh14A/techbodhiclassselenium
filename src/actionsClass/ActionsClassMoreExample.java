package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMoreExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(5000);
		
		Actions builder  = new Actions(driver); //keyboard or mouse operations karne ke liye
		Action seriesOfActions = builder //series of operations perform karne ke liye hota h. uske liye phele build karna padega aur uska return type jo h wo action class h
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "saurabh")
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick().build();
		
		seriesOfActions.perform();
		
		
		
	}
	
	

}

package switchToWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(5000);
		driver.findElement(By.id("win1")).click();
		
		//Get Handles of the windows
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		Iterator<String> iterator = allWindowHandles.iterator(); //sare window me iterate karega
		
		while(iterator.hasNext())
		{
			String child_window = iterator.next();
			if(!mainWindowHandle.equals(child_window))
			{
				driver.switchTo().window(child_window);
				Thread.sleep(5000);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		
		//switch to parent window
		
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(5000);
		driver.findElement(By.id("sedan-checkbox")).click();
		System.out.println(driver.getTitle());
		
		
	}
	
	

}

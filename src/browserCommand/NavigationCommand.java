package browserCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//navigate command
		driver.navigate().to("https://www.javatpoint.com/");
		
		//back command
		driver.findElement(By.xpath("//a[text()=' Python']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//forward command
		Thread.sleep(5000);
		driver.navigate().forward();
		
		///refresh command
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();
		}

}

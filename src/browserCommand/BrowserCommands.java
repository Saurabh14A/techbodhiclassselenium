package browserCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		/*implicit wait is used to wait the program for that particular time given if element
		is not found and if found it can move forward w/o waiting. In Thread.sleep it will wait definitely for that particular time whether element is found
		or not.	*/
		
		driver.get("http://www.seleniumframework.com/practiceform/");
		
		//command to take title of the page
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//command to take current URL
		String PageCurrentURL=driver.getCurrentUrl();
		System.out.println(PageCurrentURL);
		
		//close and quit
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
		
		
	}

}

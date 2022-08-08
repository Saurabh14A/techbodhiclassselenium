package radioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		
		boolean abc=driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
		System.out.println(abc);
		
		Thread.sleep(5000);
		
		if(abc==false)
		{
			driver.findElement(By.xpath("//input[@value='Bike']")).click();
			
		}
		
		List<WebElement> RadioButton=driver.findElements(By.xpath("//input[@name='vehicle']"));
		System.out.println(RadioButton.size());
		
		
	}

}

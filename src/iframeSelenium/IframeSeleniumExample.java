package iframeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSeleniumExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.switchTo().frame(driver.findElement(By.name("iframe_a")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='cat td-pb-span3']//following::a[1]")).click(); //xpath axis is used here
		driver.switchTo().defaultContent(); //this command is used to switch back to main frame
		/* In iframe if we want to switch from one frame to another frame then we have to 1st switch back to default frame then we can
		 * switch to 3rd or 4th frame
		 * */
		 List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no. of iframes are: "+iframeElements.size());
		
		
	}
	

}

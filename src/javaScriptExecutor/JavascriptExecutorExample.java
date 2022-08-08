package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//vertical scroll - down by 500 pixels
		js.executeScript("window.scrollBy(0,500)");
		
		//horizontal scroll - 
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(5000);
		
		//go till last
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//Enter text
		js.executeScript("document.getElementById('enterText').value='saurabh';");
		
		//Refresh
		js.executeScript("history.go(0)");
		Thread.sleep(5000);
		js.executeScript("location.reload()");
		
		//size
		System.out.println(js.executeScript("return window.innerHeight;"));
		System.out.println(js.executeScript("return window.innerWidth;"));

		
	}
	
	

}

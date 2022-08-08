package browserinvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke 
{
	public static void main(String[] args) 
	{
		/*
		 * ChromeOptions  ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		*/
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //WebDriver is interface and ChromeDriver is sub class...i.e, instance of interface so we have to go through subclass.. where all methods implements 
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.close();
		
	}

}

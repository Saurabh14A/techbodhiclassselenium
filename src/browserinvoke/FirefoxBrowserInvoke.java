package browserinvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserInvoke 
{
	public static void main(String[] args) throws InterruptedException
	{
		/*
		 * java -jar "selenium-server-standalone-2.2.0.jar"
 -Dwebdriver.firefox.bin="C:\FirefoxCollection\Mozilla Firefox 36.0\firefox.exe"
		*/
		System.setProperty("webdriver.gecko.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //WebDriver is interface and ChromeDriver is sub class...i.e, instance of interface so we have to go through subclass.. where all methods implements 
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.close();
		
	}

}

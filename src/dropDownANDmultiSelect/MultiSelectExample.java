package dropDownANDmultiSelect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectExample 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		Select oselect = new Select(driver.findElement(By.xpath("//select[@id='selenium_suite']")));
		
		oselect.selectByIndex(2);
		
		oselect.selectByValue("Grid");
		
		
		
	}

}

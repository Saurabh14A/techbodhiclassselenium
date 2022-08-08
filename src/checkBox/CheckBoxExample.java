package checkBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		List<WebElement> totalCheckBox=driver.findElements(By.xpath("//input[@name='accessories']"));
		
		for(int i=0; i<totalCheckBox.size(); i++)
		{
			System.out.println(totalCheckBox.get(i).getAttribute("value"));
			//System.out.println(totalCheckBox.get(i).getText());
			totalCheckBox.get(i).click();
		}
		
		
	}

}

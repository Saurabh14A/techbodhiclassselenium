package dropDownANDmultiSelect;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiSelectOption 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

		Select oselect = new Select(driver.findElement(By.xpath("//select[@id='programming-languages']"))); //this is used when we have select tag

		oselect.selectByIndex(3);
		Thread.sleep(5000);

		oselect.selectByValue("Python");
		Thread.sleep(5000);

		oselect.selectByVisibleText("Java");
		Thread.sleep(5000);

		//this method is used by identifying common element and list and getting its text value
		List<WebElement> elementcount=driver.findElements(By.xpath("//select[@class='input-xlarge']"));
		
		for(int i=0; i<elementcount.size(); i++)
		{
			System.out.println(elementcount.get(i).getText());
		}

		//this method is used we have select tag. we can easily identify all text in that element by using getOptions
		List<WebElement> elementcount1=oselect.getOptions();

		for(int i=0; i<elementcount1.size()-1; i++)
		{
			System.out.println(elementcount1.get(i).getText());
		}


	}


}

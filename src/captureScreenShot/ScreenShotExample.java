package captureScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File cpFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		//take current date and time
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String abc =formatter.format(date).toString().replace("/", "");
		String exactpathfilename = abc.replace(" ", "").replace(":", "");
		System.out.println(exactpathfilename);
		
		String CapturePath = "D:\\Tech Bodhi\\Automation\\Selenium\\Screenshot\\" +exactpathfilename+ ".png";
		
		try
		{
			//save the screenshot taken in destination path
			FileUtils.copyFile(cpFile,new File(CapturePath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	

}

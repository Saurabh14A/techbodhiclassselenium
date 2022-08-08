package alertSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassExample 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				
		//Specify the file location
		StringSelection sel = new StringSelection("D:\\Resume n all\\2. Software Test Engineer_Saurabh Pal_Resume.pdf");
		
		//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("Selection: " +sel);
		
		//open Naukri.com
		driver.get("https://www.naukri.com/registration/createAccount");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Click on upload resume button
		//driver.findElement(By.xpath("//button[@title='I'm Experienced']")).click();
		//Thread.sleep(5000);
		
		//Click on upload resume button
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(5000);
		
		//create object of robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}

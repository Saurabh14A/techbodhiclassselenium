package alertSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		/*driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		//al.accept(); //this is used to accept the alert or to click ok button
		Thread.sleep(5000);
		*/
		
		/*driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert cnfm=driver.switchTo().alert();
		System.out.println(cnfm.getText());
		//cnfm.accept(); //this is used to accept the alert or to click ok button
		cnfm.dismiss();  //this command is used to cancel the pop up or alert
		*/
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert prmt=driver.switchTo().alert();
		System.out.println(prmt.getText());
		Thread.sleep(5000);
		prmt.sendKeys("Webdriver");
		//prmt.accept(); //this is used to accept the alert or to click ok button
		prmt.dismiss();
		
	}

}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do;jsessionid=181dxbe564jeg");
		Thread.sleep(3000);
		WebElement un= driver.findElement(By.xpath("//input[@class='textField']"));
		un.sendKeys("admin");
	Thread.sleep(3000);
	WebElement name=driver.findElement(By.xpath("//input[@name='pwd']"));
			
	Thread.sleep(3000);
	//WebElement name=driver.findElement(By.xpath("//input[@name='pwd']"));
un.sendKeys(Keys.CONTROL+"ac");
	//name.sendKeys(Keys.CONTROL+"c");
	Thread.sleep(3000);
	name.sendKeys(Keys.CONTROL+"v");
	
	}
}

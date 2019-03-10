package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseMovement 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_SPACE);
		r1.keyRelease(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for(int i=1;i<=10;i++)
		r1.mouseMove(100+i,100);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

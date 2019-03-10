package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class S1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://flifkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Robot r1=new Robot();
	
            WebElement more= driver.findElement(By.xpath("//span[@text()='More']"));
            Thread.sleep(3000);
        	Actions act=new Actions(driver);
        	act.moveToElement(more).perform();
		driver.close();
		//
	
		
	}

}

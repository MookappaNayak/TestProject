package assignment;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FifMp 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=a6306a731dcf2b0c33746bb9dd19a212");
	    WebElement Mens= driver.findElement(By.xpath("//span[.='Men']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(Mens).perform();
	    Thread.sleep(2000);
	     WebElement shirts= driver.findElement(By.xpath("//a[.='Shirts']"));
	      Thread.sleep(2000);
	  
	    act.moveToElement( shirts).perform();
	   shirts.click();

     }
}
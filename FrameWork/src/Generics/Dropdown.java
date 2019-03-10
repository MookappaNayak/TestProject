package Generics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/fucker/Desktop/RCMAA-6/drop.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 WebElement list = driver.findElement(By.xpath("//select[@id='Month']"));
	Select sc=new Select(list);
	System.out.println(list.getText());;
 sc.selectByIndex(0);
              
	
	}
	

}

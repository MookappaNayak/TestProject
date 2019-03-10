package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/fucker/Desktop/RCMAA-6/Page2.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//iframe[@id='f1']")).sendKeys("a");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='d2']")).sendKeys("b");
		driver.close();
	}

}

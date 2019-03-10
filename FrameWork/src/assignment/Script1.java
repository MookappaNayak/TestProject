package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/fucker/Desktop/RCMAA-6/checkbox.html");
	List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement chkbox:allcheckbox)
	{
		chkbox.click();
	}
}
}

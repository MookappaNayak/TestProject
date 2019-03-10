package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/fucker/Desktop/RCMAA-6/checkbox1.html");
	List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement chkbox:allcheckbox)
	{
	if(chkbox.isSelected())
	{
		chkbox.click();
	}
	else
	{
		chkbox.click();
	}
	}
	Thread.sleep(3000 );
	driver.quit();
}
}

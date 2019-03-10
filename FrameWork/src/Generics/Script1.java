package Generics;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 
{
	public static void VerifyPageByElement(WebDriver driver,String xpath)
	{
		try
		{
			WebElement element = driver.findElement(By.xpath(xpath));
			if(element.isDisplayed())
			{
				System.out.println("element is visible");
			}
			else
			{
				System.out.println("element is not present");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("element is not present in the source code");
		}
		
	}
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		VerifyPageByElement(driver,"//input[@placeholder='Username']");
		VerifyPageByElement(driver,"//input[@name='pwd']");
		VerifyPageByElement(driver,"//div[.='Login ']");
		
		
	}

}

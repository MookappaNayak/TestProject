package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2ERRORMSG 
{
	public static void verifyTheErrorMsg(WebDriver driver,String xpath) 
	{
		WebElement error = driver.findElement(By.xpath(xpath));
		if(error.isDisplayed())
		{
			System.out.println("pass: error message is displayed");
		}
		else
		{
			System.out.println("fail: error message is not displayed");
		}
	}
	public static void main(String[] args)
	{	
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mookappa");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
	verifyTheErrorMsg(driver,"//span[text()='Username or Password is invalid. Please try again.']");
	
	}
}

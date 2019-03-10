package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script4CheckBox 
{
	public static void verifyTheCheckBox(WebDriver driver,String xpath) throws InterruptedException
	{
		WebElement select=driver.findElement(By.xpath(xpath));
		Thread.sleep(2000);
		if(select.isSelected())
		{
			System.out.println("pass:checkbox is selected");
		}
		else
		{
			System.out.println("fail:checkbox is not selected");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	  driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
		Thread.sleep(2000);
		verifyTheCheckBox(driver,"//label[@id='keepLoggedInLabel']");
		
		driver.close();
	}
}

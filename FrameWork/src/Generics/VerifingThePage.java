package Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerifingThePage 
{
	public static void verifyPageByTitle(WebDriver driver,String eTitle)
	{
		String aTitle=driver.getTitle();
		if(eTitle.contains(aTitle))
		{
			System.out.println("pass: req page is displayed");
		}
		else
		{
			System.out.println("fail: req page is not displayed");
		}
	
	}
	public static void verifyPageByUrl(WebDriver driver,String eUrl)
	{
		String aUrl=driver.getCurrentUrl();
		if(aUrl.contains(eUrl))
		{
			System.out.println("pass:req page is displayed");
		}
		else
		{
			System.out.println("fail: req page is not displayed");
		}
	}
	public static void  verifyPageByElement(WebDriver driver,String xpath)
	{
		try
		{
			WebElement element=driver.findElement(By.xpath(xpath));
			if(element.isDisplayed())
			{
				System.out.println("element is present");
			}
			else
			{
				System.out.println("element is not visible");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("element is not present in source code");
		}
	}
	public static void main(String []args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		String eTitle= "actiTIME - Login";
	verifyPageByTitle(driver,eTitle);
	String eUrl ="http://localhost/login.do";
	verifyPageByUrl(driver,eUrl);
	
  driver.findElement(By.xpath("//input[@id='username']"));
  verifyPageByElement(driver,"//input[@id='username']");
  driver.close();
	
	}

}
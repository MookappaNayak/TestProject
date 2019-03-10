package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alignment
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email]"));
		Thread.sleep(3000);
		int x1=email.getLocation().getX();
		System.out.println(x1);
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		int x2=pwd.getLocation().getX();
		System.out.println(x2);
		int n=x2-x1;
		if((x1+n)<=x2)
			System.out.println("allignment is correct");
		else
			System.out.println("allignment is not correct");

		
		
	}
}

package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script5RadioButton
{
	public static void verifyMaleRadioButton(WebDriver driver,String xpath) throws InterruptedException
	{
		WebElement male=driver.findElement(By.xpath(xpath));
				male.click();
		Thread.sleep(2000);
		if(male.isSelected())
		{
			System.out.println("pass: male radio button is selected");
		}
		else
		{
			System.out.println("fail: male radio button is not selected");
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		Thread.sleep(2000);
		verifyMaleRadioButton(driver,"(//label[@class='_58mt'])[2]");
		driver.quit();
		
	}
}

package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6FemaleRadioButton 
{
	public static void verifyFemaleRadioButton(WebDriver driver,String xpath) throws InterruptedException
	{
		WebElement female=driver.findElement(By.xpath(xpath));
				female.click();
		Thread.sleep(2000);
		if(female.isSelected())
		{
			System.out.println("pass: female radio button is selected");
		}
		else
		{
			System.out.println("fail: female radio button is not selected");
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		Thread.sleep(2000);
		verifyFemaleRadioButton(driver,"(//label[@class='_58mt'])[1]");
		driver.quit();
		
	}


}

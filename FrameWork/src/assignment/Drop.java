package assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/fucker/Desktop/RCMAA-6/Riv.html");
		WebElement listbox = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1=new Select(listbox);
	//Set<String> l1=new HashSet<String>();
	List<WebElement> alloptions=s1.getOptions();
		for(WebElement op:alloptions)
		{
			String text = op.getText();
			System.out.println(text);
		}
	}

}
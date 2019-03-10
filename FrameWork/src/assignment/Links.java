package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int noOfLinks=allLinks.size();
		System.out.println("total no of links"+noOfLinks);
		for(WebElement links:allLinks)
		{
			String text= links.getText();
			System.out.println(text);
		String linkattri = links.getAttribute("href");
		System.out.println(linkattri );
		}
	}

}

package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetch
{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[.='Download']")).click();
		List<WebElement> list= driver.findElements(By.xpath("(//table)[1]"));
		for(WebElement allop:list)
		{
			String text = allop.getText();
			System.out.println(text);
		}
		
		
	}

}

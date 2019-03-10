package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Istqb 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.istqb.org/");
	    WebElement certiication = driver.findElement(By.xpath("(//li[@class='dropdown mega'])[3]"));
	    Actions act=new Actions(driver);
	    act.moveToElement(certiication).perform();
	  driver.findElement(By.xpath("//a[.='Foundation Level 2018']")).click();
          
     }
}
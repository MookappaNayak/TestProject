package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Disable {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?client=firefox-b-ab&q=flipkart");
		Actions act=new Actions(driver);
		WebElement ff=driver.findElement(By.xpath("(//h3[text()='Flipkart'])[1]"));
		act.moveToElement(ff).click().perform();;

		
	}
}
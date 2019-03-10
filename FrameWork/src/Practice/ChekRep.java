package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChekRep {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flifkart.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement man = driver.findElement(By.xpath("//span[.='Men']"));
                               Actions act=new Actions(driver);
                               act.moveToElement(man).perform();
                               WebElement track= driver.findElement(By.xpath("//a[.='Track Pants']"));
                               act.moveToElement(track).perform();
                              act.click(track).perform();;
                               Thread.sleep(2000);
                               List<WebElement> imgs= driver.findElements(By.tagName("//img"));
                               
                               System.out.println(imgs.size());;
                               Thread.sleep(5000);
                               driver.close();
                               
		
	}

}

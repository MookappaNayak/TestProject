package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3t
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mookappa");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		String eTitle = "actiTIME - Login";
		VerifingThePage.verifyPageByTitle(driver,eTitle);
		Thread.sleep(2000);
		String eUrl ="http://localhost/login.do";
		VerifingThePage.verifyPageByUrl(driver,eUrl);
		Thread.sleep(2000);
		driver.close();
		
	}

}

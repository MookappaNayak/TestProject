package Generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot 
{
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	TakesScreenshot t1=(TakesScreenshot)driver;
	Thread.sleep(3000);
	File srcFile = t1.getScreenshotAs(OutputType.FILE);
	Thread.sleep(3000);
	File destFile=new File("d://mkkk.png");
	Thread.sleep(3000);
	FileUtils.copyFile(srcFile, destFile);
	driver.close();
}
}
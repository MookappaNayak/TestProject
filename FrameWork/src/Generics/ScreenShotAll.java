package Generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotAll
{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Date d1=new Date();
		String s1=d1.toString();
		String s2=s1.replaceAll(":","@");
		TakesScreenshot t1=(TakesScreenshot)driver;
		    File srcFile = t1.getScreenshotAs(OutputType.FILE);
		    File destFile=new File("d://gggh"+s2+".png");
		    FileUtils.copyFile(srcFile, destFile);
		    driver.close();
		         
	
}
}

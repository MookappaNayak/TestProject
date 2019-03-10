package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActTime
{
 public static void main(String[] args) throws IOException, InterruptedException {
	 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	// test case for login
	ActiTime a1=new ActiTime(driver);
	a1.setuserNAME("admin");
	a1.setpassword("manger");
	a1.loginButton();
	
	//screen shot
	TakesScreenshot t1=(TakesScreenshot)driver;
	              File srcFile = t1.getScreenshotAs(OutputType.FILE);
	              File destFile=new File("d://PKK.png");
	              FileUtils.copyFile(srcFile, destFile);
	     // valid password
	              a1.setuserNAME("admin");
	          	a1.setpassword("manager");
	          	a1.loginButton();
	          	
	          	Thread.sleep(3000);
	          	System.out.println(driver.getCurrentUrl());;
	          	Thread.sleep(3000);
	          	System.out.println(driver.getTitle());
	//alert message
	JavascriptExecutor j1=(JavascriptExecutor)driver;
	String js1="confirm('do you want to click on this')";
	j1.executeScript(js1);
	driver.switchTo().alert().getText();
	
	Thread.sleep(3000);
	driver.close();
	
}

}

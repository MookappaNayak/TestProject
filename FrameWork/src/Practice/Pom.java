package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pom
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage1 l1=new LoginPage1(driver);
		l1.setuserName("admin");
		l1.setpassword("manag");
		l1.setlogin();
		Thread.sleep(2000);
	
		l1.setuserName("admin");
		l1.setpassword("manager");
		l1.setlogin();
		
	}

}

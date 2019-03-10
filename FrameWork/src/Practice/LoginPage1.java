package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pTB;

	private WebElement lgn;
	
	LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//unTB=driver.findElement(By.xpath("//input[@id='username']"));
		//pTB=driver.findElement(By.xpath("//input[@name='pwd']"));
	lgn=driver.findElement(By.xpath("//div[.='Login ']"));
	   }
		
	public void setuserName(String un)
		{
			unTB.sendKeys(un);
			
		}
		public void setpassword(String pwd)
		{
			pTB.sendKeys(pwd);
			
		}
		public void setlogin()
		{
			lgn.click();
		}


}

package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime
{
	@FindBy(id="username")
	public WebElement unTB;
	@FindBy(name="pwd")
	public WebElement pTB;
	
	@FindBy(xpath="//div[.='Login ']")
	public WebElement lgnBTN;
	
	public ActiTime(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setuserNAME(String un)
	{
		unTB.sendKeys(un);
		
	}
	public void setpassword(String pwd)
	{
		pTB.sendKeys(pwd);
		
	}
	public void loginButton()
	{
		lgnBTN.click();
	}
}

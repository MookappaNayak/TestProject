package assignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage
{
	//decleration
	@FindBy(xpath="//img")
	private List<WebElement> allImages;
	GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void getImgCount()
	{
		allImages.size();
	}
	public void getImgText()
	{
		for(WebElement imgs:allImages)
		{
			imgs.getAttribute("img");
		}
	}
	

}

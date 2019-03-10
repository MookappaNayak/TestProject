package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGooglePage {
public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe")	;
         WebDriver driver=new ChromeDriver();
         driver.get("http://www.google.com");
         GooglePage g1=new GooglePage(driver);
         g1.getImgCount();
         g1.getImgText();
         
          }
}

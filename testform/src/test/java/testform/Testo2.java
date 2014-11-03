package testform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Testo2 {
 WebDriver wd;
 @BeforeTest
 public void BeforeTest()
 {
	 System.out.println("hiiiii");
	 wd=new FirefoxDriver();
 }
 @org.testng.annotations.AfterTest
 public void AfterTest()
 {
	 
 }
 @Test
public void oxy()
{
	 System.out.println("hi how r u");
wd.get("http://ravi-pc:8085/login.do");

System.out.println("entered in actitime");
}
 }
 
 

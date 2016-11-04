package LinkedInHomePage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CopyOfForgotPassword {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com");
	}
	
	@AfterTest
	public void tearDown() throws Exception
	{
		//driver.quit();
	}
	
	@Test(priority=1)
	public void clickForgotPassword()
	{
		driver.findElement(By.linkText("Forgot password?")).click();
		
		
	}
	
	@Test(priority=2)
	public void newtours()
	{
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	@Test(priority=3)
	public void facebook()
	{
		driver.navigate().to("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
	}
	
	
	
}

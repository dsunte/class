package LinkedInHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ForgotPassword {
	
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
	
	@Test
	public void clickForgotPassword()
	{
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.navigate().to("http://www.facebook.com");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
	}

	
	
	
}

package LinkedInHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class JoinLinkedIn1 {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception
	{
		driver = new FirefoxDriver();
		//Go to LinkedIn
		driver.get("https://www.linkedin.com");
	}
	
	@AfterTest
	public void tearDown() throws Exception
	{
		driver.quit();
	}
	
	@Test
	void joinLinkedIn_1()
	{
		driver.findElement(By.id("reg-firstname")).sendKeys("Test First Name");
	}

}

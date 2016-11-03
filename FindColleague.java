package LinkedInHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class FindColleague {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}
	@AfterTest
	public void tearDown() throws Exception
	{
		//driver.quit();
	}
	@Test
	public void enterColleagueName()
	{
		driver.findElement(By.name("first")).sendKeys("DSunte");
		driver.findElement(By.name("last")).sendKeys("Wilson");
		//driver.findElement(By.name("last")).submit();
	}
	
	
}

package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class TravelTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception
	{
		
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterTest
	public void tearDown() throws Exception
	{
		//driver.quit();
	}
	
	@Test(priority=1)
	public void FirefoxTest()
	{
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("password")).submit();
		// Select the fromPort 
		Select drpFromPort = new Select(driver.findElement(By.name("fromPort")));
		drpFromPort.selectByVisibleText("New York");
		//Make objects of fromMonth and fromDay
		Select drpFromMonth =new Select(driver.findElement(By.name("fromMonth")));
		Select drpFromDay =new Select(driver.findElement(By.name("fromDay")));
		drpFromMonth.selectByVisibleText("December");
		drpFromDay.selectByVisibleText("29");
		//Select the toPort, toMonth, toDay
		Select drpToPort = new Select(driver.findElement(By.name("toPort")));
		Select drpToMonth = new Select(driver.findElement(By.name("toMonth")));
		Select drpToDay = new Select(driver.findElement(By.name("toDay")));
		drpToPort.selectByVisibleText("San Francisco");
		drpToMonth.selectByVisibleText("December");
		drpToDay.selectByVisibleText("31");
		//Select Business class
		driver.findElement(By.cssSelector("input[value='Business']")).click();
		//Submit form
		driver.findElement(By.name("findFlights")).click();
		
	}
	

}

package seleniumGridDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridDemoStandAlone {
	
	// DesiredCapabilties: we will create an object of this class
	// Using the object we define configuration for the GRID ->OSname, browsername
	// for the creating the session previously we used:
	 // WebDriver driver = new ChromeDriver();
	// Now we are goign to create the session remotely via the grid
	// we will use a 
	// WebDriver driver = new RemoteWebDriver(URLof hub,capabilties )
	
	WebDriver driver;
	
	@BeforeClass
	public void gridstandAlone() throws MalformedURLException
	{
	// Write the deisred configuration where the script has to run
		
		DesiredCapabilities cap = null;
		cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("firefox");
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
	}
	
	@Test
	public void gridstandalone_Test()
	{
		driver.get("https://tutorialsninja.com/demo/");
		String expectedTitle="Your Store";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle);
	}
	
   @AfterClass
   public void closesession()
   {
	   driver.quit();
   }
	
	
}














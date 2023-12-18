package seleniumGridDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StandAloneChrome {
	
	
WebDriver driver;
	
	@BeforeClass
	public void gridstandAlone_Chrome() throws MalformedURLException
	{
	// Write the deisred configuration where the script has to run
		
	   ChromeOptions cap = new ChromeOptions();
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
	}
	
	@Test
	public void gridstandalone_Test()
	{
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String expectedTitle="Your Store";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, expectedTitle);
	}
	
   @AfterClass
   public void closesession()
   {
	   driver.quit();
   }

}

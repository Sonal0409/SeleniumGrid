package seleniumGridDemos;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class Griddemo2 extends HubandNodeDemo {
	
	
	@Test(priority='1')
	public void chromeTest1() throws MalformedURLException
	{
		hubNodeChromeDemo();
		driver.get("https://www.selenium.dev/downloads/");
	}
	
	@Test(priority='2')
	public void firefoxTest1() throws MalformedURLException
	{
		hubNodeFirefoxDemo();
		driver.get("https://www.selenium.dev/downloads/");
	}

}

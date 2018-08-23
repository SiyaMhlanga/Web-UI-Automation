package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	

public WebDriver initializeDriver() throws IOException
{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\siyabongam\\Project\\src\\main\\java\\Globalk\\data.properties");
	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siyabongam\\Project\\src\\browserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//execute in Chrome browser
	}
	else if(browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\siyabongam\\Project\\src\\browserDrivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		//execute in Firefox browser
	}
	else if (browserName.equals("Edge"))	
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\siyabongam\\Project\\src\\browserDrivers\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		//execute in Microsoft Edge browser
	}
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	return driver;

}
}
package GlobalK;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import pageObjects.AccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class LoginAccount extends base {
public static org.apache.logging.log4j.Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get("http://automationpractice.com");
		log.info("Navigated to Home page");
	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();

		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSubmit().click();
	}
	
	@DataProvider
	public Object[][] getData()  //Provides login data
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="invalid@test.com"; 
		data[0][1]="invalid@12";
		//invalid login
				
		data[1][0]="12tester@test.com";
		data[1][1]="Tester@12";
		//valid login	
		
		return data;
	}
	
	/*@Test()
	
	public void basePageNavigation() throws IOException
	{
		//AccountPage t=new AccountPage(driver);
		//Assert.assertEquals(driver.getTitle(), "My account - My Store");
		Assert.assertEquals(driver.getTitle(), "My Store");
	}*/
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
		



}
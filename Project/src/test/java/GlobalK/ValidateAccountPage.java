package GlobalK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AccountPage;
import resources.base;

public class ValidateAccountPage extends base {
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		//driver.get("http://automationpractice.com");
	}
	
	@Test()
	
	public void basePageNavigation() throws IOException
	{
		AccountPage t=new AccountPage(driver);
		Assert.assertEquals(t.getTitle(), "My account - My Store");	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	

		



}
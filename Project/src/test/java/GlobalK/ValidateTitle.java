package GlobalK;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountPage;
import resources.base;

public class ValidateTitle extends base {
	
	@Test()
	
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
		AccountPage t=new AccountPage(driver);
		Assert.assertEquals(t.getTitle(), "My Account");
		

	}
	
	

		



}
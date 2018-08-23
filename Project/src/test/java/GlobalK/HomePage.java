package GlobalK;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		driver=initializeDriver();
		driver.get("http://automationpractice.com/");
		
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
		



}
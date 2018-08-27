package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	public WebDriver driver;
	
	By title=By.xpath("//html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/h1[1]");
	
	public AccountPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	

}

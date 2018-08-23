package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	public WebDriver driver;
	
	By title=By.xpath("//h1[@class='page-heading']");
	
	public AccountPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	

}

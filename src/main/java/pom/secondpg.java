package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondpg {

	
	@FindBy(xpath="//a[contains(text(),\"W3C WebDriver specification\")]")
	private WebElement web;
	
	
	public secondpg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void web()
	{
		web.click();
	}
}

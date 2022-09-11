package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstpg {

	
	@FindBy(xpath="//span[text()=\"Documentation\"]")
	private WebElement document;
	
	
	public firstpg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void docu()
	{
		document.click();
	}
}

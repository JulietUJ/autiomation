package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage  {
	WebDriver driver;
	@FindBy(name="login")
	WebElement loginbutton;



	@FindBy(name="email")
	WebElement emailIdField;
	@FindBy(name="pass")
	WebElement pswd;


	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickLoginBtn()
	{
		loginbutton.click();
		
	}
	public void setvalues(String UN,String PWD)
	{
		emailIdField.sendKeys(UN);
		pswd.sendKeys(PWD);
	}

	}

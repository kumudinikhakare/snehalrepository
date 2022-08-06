package NPOMcom.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOM1 
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath ="//input[@id='user-name']" )
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	
	public void sendPassword()
	{
		passWord.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	//normal click process-webelement method
//	public void clickOnLoginButton()
//	{
//		loginButton.click();
//	}
	
	//mouse action click method
	public void clickOnLoginButton()
	{
		act.click(loginButton).perform();
		
	}
	
	public loginPOM1 (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
	
	

}



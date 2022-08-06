package NPOMcom.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class singleitemPOM3 
{
	private WebDriver driver;
	//bag element
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagButton;
	
	public void clickOnBagButton()
	{
		bagButton.click();
	}
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addToCartButton;
	
	public String getTextFromCartButton()
	{
		 String totalProducts= addToCartButton.getText();
		 return totalProducts;
	}

	
	public singleitemPOM3 (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
}

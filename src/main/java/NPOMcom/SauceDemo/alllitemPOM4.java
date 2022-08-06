package NPOMcom.SauceDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alllitemPOM4 
{
	private WebDriver driver;
	//multiple products elements
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement> multiAddToCartButton;
		
		public void clickAllProduct()
		{
			for(WebElement i: multiAddToCartButton)
			{
				i.click();
			}
		}
		
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		private WebElement addToCartButton;
		
		public String getTextFromCartButton()
		{
			 String totalProducts= addToCartButton.getText();
			 return totalProducts;
		}

		public alllitemPOM4 (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
			
		}	
}

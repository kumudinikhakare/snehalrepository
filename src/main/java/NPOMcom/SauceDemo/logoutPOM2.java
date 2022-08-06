package NPOMcom.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class logoutPOM2 
{
	private WebDriver  driver;
	private Select s;
	
	//settingButton
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingButton;
	
	public void clickOnSettingButton()
	{
		settingButton.click();
	}
	
	//logOut button
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutButton;
	
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}
	
	
//	@FindBy(xpath="//span[@class='shopping_cart_badge']")
//	private WebElement addToCartButton;
//	
//	public String getTextFromCartButton()
//	{
//		 String totalProducts= addToCartButton.getText();
//		 return totalProducts;
//	}
	
	
	//filter dropdown
	
//	@FindBy(xpath="//select[@class='product_sort_container']")
//	private WebElement dropDownFilter;
//	
//	public void clickOnDropDownFilter()
//	{
//		dropDownFilter.click();
//		s.selectByVisibleText("Price (low to high)");
//		
//	}
//	
	
	public logoutPOM2 (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	//	s = new Select(dropDownFilter);

}
	}

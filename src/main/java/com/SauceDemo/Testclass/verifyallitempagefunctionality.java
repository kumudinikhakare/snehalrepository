package com.SauceDemo.Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import NPOMcom.SauceDemo.alllitemPOM4;

public class verifyallitempagefunctionality extends BaseClass 
{
	@Test
	public void mutipleProductAddToCartFunctionality()
	{
		   
	    //homePage
		alllitemPOM4 s = new alllitemPOM4(driver);
	    s.clickAllProduct();
	    log.info("click on allproduct");
	    
	    String actualCount =s.getTextFromCartButton();
		String expectedCount = "6";
		
		Assert.assertEquals(actualCount, expectedCount);
		log.info("assertion applied");
		
//		if(expectedCount.equals(actualCount))
//		{
//			System.out.println("Tc is passed");
//		}
//		else
//		{
//			System.out.println("TC is failed");
//		}
	}

}

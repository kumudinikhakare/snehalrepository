package com.SauceDemo.Testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClasses.Screenshotclass;

import NPOMcom.SauceDemo.singleitemPOM3;

public class verifysingleitempagefunctionality extends BaseClass
{
	@Test
	public void bagProductAddTOCartFunctionality() throws IOException
	{  
	    //homePage
		singleitemPOM3 s1 = new singleitemPOM3 (driver);
	    s1.clickOnBagButton();
	    log.info("click on bagbutton");
		Screenshotclass.takescreenshot(driver);
	    
	   String actaulCount =  s1.getTextFromCartButton();
	    
	   String expectedCount = "2";
	   
	   Assert.assertEquals(actaulCount, expectedCount);
	   log.info("assertion applied");
	   
//	   if(expectedCount.equals(actaulCount))
//	   {
//		   System.out.println("TC is passed");
//	   }
//	   else
//	   {
//		   System.out.println("TC is failed");
//	   }
	}

}

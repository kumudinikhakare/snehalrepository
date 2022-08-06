package com.SauceDemo.Testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClasses.Screenshotclass;



public class VerifyloginFunctionality extends BaseClass
{
	@Test		
	public void loginFuntionality() throws IOException 
	{ 
		//screenshot
	
	    
		//validation
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		
		Assert.assertEquals(actualTitle, expectedTitle);
		log.info("assertion applied");
		Screenshotclass.takescreenshot(driver);
		log.info("sc taken");
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("we have successfully logined to saucedmo ");
//		    System.out.println("Test case is passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}	
		
	}

}


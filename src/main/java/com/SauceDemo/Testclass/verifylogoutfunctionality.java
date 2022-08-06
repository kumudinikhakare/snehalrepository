
package com.SauceDemo.Testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClasses.Screenshotclass;

import NPOMcom.SauceDemo.logoutPOM2;

public class verifylogoutfunctionality extends BaseClass
{
    @Test
    public void logOutFunctionality() throws IOException
    {

	//homePage
	//logOutActivity
	
    	logoutPOM2  hp = new logoutPOM2 (driver);
	hp.clickOnSettingButton();
	log.info("Click on SettingButton");
	Screenshotclass.takescreenshot(driver);
	log.info("sc taken");
	hp.clickOnLogOutButton();
	log.info("Click on LogOutButton");
	
	
	//loginpage
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	log.info("assertion applied");
	
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("Test Case is passed");
//	}
//	else
//	{
//		System.out.println("Test Case is failed");
//	}
    }

}

package com.SauceDemo.Testclass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.UtilityClasses.Screenshotclass;

import NPOMcom.SauceDemo.loginPOM1;

public class BaseClass 
{
	WebDriver driver;
	
Logger log=	Logger.getLogger("Project");

	@Parameters("browsername")
	@BeforeMethod
public void setupmethod(String browsername) throws IOException
{
	if (browsername.equals("chrome"))
	{
			System.setProperty("webdriver.chrome.driver",
	         "./DriverFolder/chromedriver.exe");
      driver =  new ChromeDriver();
      log.info("browser open");
	}
	else if (browsername.equals("Firefox"))
	{
			System.setProperty("webdriver.gecko.driver",
	         "./DriverFolder/geckodriver.exe");
      driver =  new FirefoxDriver();
      log.info("browser open");
	}
	else
	{
		System.out.println("Throw error");
	}
	PropertyConfigurator.configure("log4j.properties");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.get("https://www.saucedemo.com");
      log.info("url is open");
	System.out.println("Browser is opened");
	Screenshotclass.takescreenshot(driver);
	log.info("Screensot taken");
	loginPOM1 lp = new loginPOM1 (driver);
	lp.sendUsername();
	log.info("un enter");
	lp.sendPassword();
	log.info("pw enter");
	lp.clickOnLoginButton();
	log.info("login click");
	
	}
	
@AfterMethod
public void teardownmethod()
{
	driver.quit();
	log.info("broser is closed");
}

}

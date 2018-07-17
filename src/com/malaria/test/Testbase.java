package com.malaria.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import com.malaria.pages.Homepage;



import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Testbase {
	
	protected AndroidDriver<WebElement> driver;
	protected Homepage homepage;
	
	
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformVersion", "6.0.1");
//		cap.setCapability("udid", "459ea85e7d53");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "C:\\Users\\Bala\\Downloads\\WMR_android1.3_1stmarch_original.apk");
		cap.setCapability("appPackage", "uk.co.adappt.adapptlabs.who.malaria");
		cap.setCapability("appActivity", "uk.co.adappt.adapptlabs.who.malaria.MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homepage=new Homepage(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), Homepage.class);
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.closeApp();
	}

}

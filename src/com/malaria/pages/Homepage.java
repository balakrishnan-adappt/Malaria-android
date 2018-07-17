package com.malaria.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.malaria.test.Testbase;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage extends Testbase{
	
	
	public Homepage(AndroidDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public Homepage app_launch() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), Homepage.class);
		Thread.sleep(3000);
		System.out.println("app has been launched");
		return homepage;
	}
}

package com.malaria.test;


import org.testng.annotations.Test;

public class HomepageTest extends Testbase {
	
	@Test
	public void app_launching() throws InterruptedException {
	
		homepage.app_launch();
	}
	

}

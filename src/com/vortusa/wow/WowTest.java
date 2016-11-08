package com.vortusa.wow;

import org.openqa.selenium.WebDriver;

public class WowTest {
	
	WebDriver driver;
	string basedURL="http://wow.lk";
	
	@BeforeTest
	public void startTest(){
		driver= new firefoxDrive();
		driver.get(baseURL);
		driver.manage().window().maximize();
				
	}

}

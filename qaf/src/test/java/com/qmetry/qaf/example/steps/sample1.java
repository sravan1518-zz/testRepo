package com.qmetry.qaf.example.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample1 {

	
	@Test
	public void chromel() {
		
		
		WebDriver driver;
		String s = System.getProperty("user.dir") + "/server/chromedriver";
		System.out.println(s);
		System.setProperty("webdriver.chrome.driver",s);
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
}

package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL = "http://demo.guru99.com/v3/index.php";
	public String username = "mngr237217";
	public String password = "gejujyp";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

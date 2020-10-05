package com.emwebutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EMWebBasePage {
	public WebDriver driver;
	@BeforeTest
		public void startBroser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\ChromeDriver85\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.extramarks.com/");
			driver.manage().deleteAllCookies();
		}
	@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}

}

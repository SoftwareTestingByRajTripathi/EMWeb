package com.emwebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMWebDashboardPage {
	WebDriver driver;
	@FindBy(xpath="//img[@class ='img-responsive'][1]") WebElement Dashboard;
	
	EMWebDashboardPage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void dashboard()
	{
		Dashboard.click();
	}
	

}

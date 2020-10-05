package com.emwebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMWebLoginPage {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'LOGIN')][1]") WebElement Loginbtn;
	@FindBy (xpath = "//a[@class='font-medium text-black']")WebElement donthaveGtscode;
	@FindBy (xpath = "//input[@id='usernameLogin']") WebElement userid;
	@FindBy (xpath = "//input[@id='passwdLogin']")WebElement usrpass;
	@FindBy (xpath = "//a[@id='login-account']")WebElement usersubmit;
	
	public EMWebLoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonLoginbtn()
	{
		Loginbtn.click();
		
	}
	public void dhgc ()
	{
		donthaveGtscode.click();
	}
	public void useridandPass(String uid,String upass)
	{
		userid.sendKeys(uid);
		usrpass.sendKeys(upass);
		usersubmit.click();
		
	}

}

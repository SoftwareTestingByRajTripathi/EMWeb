package com.emwebtestcase;

import org.testng.annotations.Test;

import com.emwebbasepage.EMWebBasePage;
import com.emwebpage.EMWebLoginPage;

public class EMWebLoginTestcase extends EMWebBasePage {
	EMWebLoginPage EMlogin;
	@Test
	//For user login 
	public void Emuserlogin() throws InterruptedException
	{
		EMlogin = new EMWebLoginPage (driver);
		EMlogin.clickonLoginbtn();
		Thread.sleep(3000);
		EMlogin.dhgc();
		Thread.sleep(4000);
		EMlogin.useridandPass("9136342965","ADVIK@2019");
	}
	
	

}

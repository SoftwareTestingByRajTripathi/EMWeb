package com.emwebtestcase;

import org.testng.annotations.Test;

import com.emwebbasepage.EMWebBasePage;
import com.emwebpage.EMWebDashboardPage;
import com.emwebpage.EMWebLoginPage;

public class EMWebDashboardTestcase extends EMWebBasePage {
	EMWebLoginPage EMlogin;
	EMWebDashboardPage EMWebDbp;
	@Test
	//For Click on DashBoard.//
	public void clickonDashboard() throws InterruptedException
	{
		EMlogin = new EMWebLoginPage(driver);
		EMlogin.clickonLoginbtn();
		Thread.sleep(3000);
		EMlogin.dhgc();
		Thread.sleep(4000);
		EMlogin.useridandPass("9136342965","ADVIK@2019");
		EMWebDbp = new EMWebDashboardPage(driver);
		EMWebDbp.dashboard();
		Thread.sleep(4000);
		EMWebDbp.dashboardlinks();
	}

}

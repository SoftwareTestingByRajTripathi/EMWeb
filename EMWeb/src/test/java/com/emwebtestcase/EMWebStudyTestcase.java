package com.emwebtestcase;

import com.emwebpage.EMWebLoginPage;
import com.emwebpage.EMWebStudyPage;
import com.emwebutility.EMWebBasePage;

public class EMWebStudyTestcase extends EMWebBasePage{
	EMWebLoginPage EMlogin;
	EMWebStudyPage EWStudy;
	//For Count the chapter list of Subject//
	public void CountChapterList_studyPage() throws InterruptedException
	{
		EMlogin = new EMWebLoginPage(driver);
		EMlogin.clickonLoginbtn();
		Thread.sleep(3000);
		EMlogin.dhgc();
		Thread.sleep(3000);
		EMlogin.useridandPass("9136342965", "ADVIK@2019");
		EWStudy = new EMWebStudyPage(driver);
		Thread.sleep(3000);
		EWStudy.Studypage();
		Thread.sleep(3000);
		EWStudy.chapterList();
		
		
		
	}
	
}

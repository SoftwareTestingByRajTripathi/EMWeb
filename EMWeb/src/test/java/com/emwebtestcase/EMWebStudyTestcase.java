package com.emwebtestcase;

import com.emwebpage.EMWebLoginPage;
import com.emwebpage.EMWebStudyPage;
import com.emwebutility.EMWebBasePage;

public class EMWebStudyTestcase extends EMWebBasePage{
	EMWebLoginPage EMlogin;
	EMWebStudyPage EWStudy;
	public void CountChapterList_studyPage()
	{
		EMlogin = new EMWebLoginPage(driver);
		EMlogin.clickonLoginbtn();
		EMlogin.dhgc();
		EMlogin.useridandPass("9136342965", "ADVIK@2019");
		EWStudy = new EMWebStudyPage(driver);
		EWStudy.Studypage();
		EWStudy.chapterList();
		
		
		
	}
	
}

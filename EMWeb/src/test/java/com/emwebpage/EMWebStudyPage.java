package com.emwebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMWebStudyPage {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Study')]") WebElement study;
	
	public EMWebStudyPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Studypage()
	{
		study.click();
	}
	public void chapterList()
	{
		List<WebElement> chapterlist = driver.findElements(By.xpath("//a[@class ='subject-list']"));
		System.out.println(chapterlist.size());
		for (int i =0; i<chapterlist.size();i++)
		{
		String linktext = 	chapterlist.get(i).getText();
		System.out.println(chapterlist);
		}
	}

}

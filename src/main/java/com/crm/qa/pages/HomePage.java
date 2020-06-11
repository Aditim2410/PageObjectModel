package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory

	@FindBy(xpath="//a[text()='Contacts']")
	
	WebElement contactslinks;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	@CacheLookup
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomepageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage ClickonContactslink()
	{
		contactslinks.click();
		return new ContactsPage();
	}
	
	public DealsPage DealsClick()
	{
		dealsLink.click();
		return new DealsPage();
	}
	
	
}

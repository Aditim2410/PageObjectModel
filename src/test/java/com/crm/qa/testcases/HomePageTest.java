package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
	ContactsPage contactsPage;
	
	
	public  HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	
	public void VerifyHomepageTitle()
	{
		String HomePageTitle=homePage.VerifyHomepageTitle();
		Assert.assertEquals(HomePageTitle,"CRMPRO", "Home page title not matched");
	}
		
	@Test(priority=2)
	public void verifyContactsLinkTest(){
		testUtil.switchToFrame();
		contactsPage = homePage.ClickonContactslink();
	}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
	
	}
	


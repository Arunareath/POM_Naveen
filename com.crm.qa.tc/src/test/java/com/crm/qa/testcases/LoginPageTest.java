package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class LoginPageTest extends TestBase{

	Loginpage lp;
	Homepage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		lp=new Loginpage();
	}

	@Test(priority=1)
	public void loginpageTitleTest() {
		String title = lp.validateloginpageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homepage=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

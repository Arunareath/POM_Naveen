package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {

	//Page-factory-OR:
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[.='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[.='Sign Up']")
	WebElement signupbtn;
	
	
	//initializing the page objects
	public Loginpage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public String validateloginpageTitle()
	{
		return driver.getTitle();
	}
	public Homepage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new Homepage();
	}
	
}

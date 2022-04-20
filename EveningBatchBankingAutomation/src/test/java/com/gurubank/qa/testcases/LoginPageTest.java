package com.gurubank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gurubank.qa.base.TestBase;
import com.gurubank.qa.pages.HomePage;
import com.gurubank.qa.pages.LoginPage;

/*
 * This test case explains about the login page
 * and its functionalities
 */
public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority=0)
	public void validateTitle() {
		Assert.assertEquals(loginPage.validateLoginPageTitle(), "Guru99 Bank Home Page");
	}
	
	@Test(priority=1)
	public void validateLogo() {
		Assert.assertTrue(loginPage.validateLoginPageLogo());
	}
	
	@Test(priority=2)
	public void loginToApp() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

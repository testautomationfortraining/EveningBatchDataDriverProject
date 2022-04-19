package com.gurubank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gurubank.qa.base.TestBase;
import com.gurubank.qa.pages.DeleteCustomerPage;
import com.gurubank.qa.pages.HomePage;
import com.gurubank.qa.pages.LoginPage;

public class DeleteCustomerTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public DeleteCustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		LoginPage loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		deleteCustomerPage=homePage.navigateToDeleteCustomerPage();
	}
	
	@Test(priority=0)
	public void validateTitle() {
		Assert.assertEquals(deleteCustomerPage.verifyDeleteCustomerTitle(), "Guru99 Bank Delete Customer Page");
	}
	
	@Test(priority=1)
	public void deleteCustomer() {
		deleteCustomerPage.deleteCustomer(prop.getProperty("customerId"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

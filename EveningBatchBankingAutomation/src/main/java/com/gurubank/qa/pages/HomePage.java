package com.gurubank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gurubank.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Object Repository
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomerBtn;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHomePageLogo() {
		return logo.isDisplayed();
	}
	
	public DeleteCustomerPage navigateToDeleteCustomerPage() {
		deleteCustomerBtn.click();
		return new DeleteCustomerPage();
	}

}

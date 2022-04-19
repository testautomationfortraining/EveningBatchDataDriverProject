package com.gurubank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gurubank.qa.base.TestBase;

public class DeleteCustomerPage extends TestBase {

	//Object Repository
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerIdTextBox;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement submitBtn;
	
	public DeleteCustomerPage() {
		PageFactory.initElements(driver, this);
	}	
		
	public String verifyDeleteCustomerTitle() {
		return driver.getTitle();
	}
	
	public void deleteCustomer(String custId) {
		customerIdTextBox.sendKeys(custId);
		submitBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
}

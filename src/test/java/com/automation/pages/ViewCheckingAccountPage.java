package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingAccountPage extends BasePage{
	@FindBy(id = "page-title")
	WebElement viewCheckingAccountSign;
	@FindBy(id ="new-account-conf-alert")
	WebElement newAccountAlert;

	public void verifyNewAccountAlert() {
		Assert.assertTrue(newAccountAlert.isDisplayed());
	}

	public void verifyViewCheckingAccounts() {
		Assert.assertTrue(viewCheckingAccountSign.isDisplayed());
	}


}

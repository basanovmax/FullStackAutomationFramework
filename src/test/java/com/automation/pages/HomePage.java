package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	@FindBy(id = "checking-menu")
	WebElement checkingMenuBtn;
	@FindBy(id = "new-checking-menu-item")
	WebElement newCheckingBtn;

	@FindBy(xpath = "//img[@class = 'user-avatar rounded-circle']")
	WebElement userIcon;

	@FindBy(id = "savings-menu")
	WebElement savingMenuBtn;
	@FindBy(id = "new-savings-menu-item")
	WebElement newSavingBtn;

	@FindBy(id = "deposit-menu-item")
	WebElement depositMenuBtn;
	public void verifyHomePage(){
		Assert.assertTrue(userIcon.isDisplayed());
	}

	public void clickOnChecking() {
		checkingMenuBtn.click();
	}

	public void clickOnNewChecking() {
		newCheckingBtn.click();
	}

	public void userClickOnSavings() {
		 savingMenuBtn.click();
	}

	public void clickOnNewSaving() {
		newSavingBtn.click();
	}

	public void clickOnDepositBtn() {
		depositMenuBtn.click();
	}
}

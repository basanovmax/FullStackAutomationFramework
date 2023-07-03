package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingPage extends BasePage{

	@FindBy(id = "newCheckingSubmit")
	WebElement submitCheckingBtn;

	@FindBy (id = "Standard Checking")
	WebElement standardCheckingBtn;
	@FindBy(id = "Individual")
	WebElement individualBtn;

	@FindBy(id = "name")
	WebElement accountNameInput;
	@FindBy(id = "openingBalance")
	WebElement depositAmountInput;

	@FindBy(xpath = "//strong[contains(text(), 'New Checking Account')]")
	WebElement newCheckingSign;
	@FindBy(id = "page-title")
	WebElement viewCheckingAccountSign;
	@FindBy(id ="new-account-conf-alert")
	WebElement newAccountAlert;

	@FindBy(xpath = "//tr[@class='odd']/td[4]")
	WebElement depositAmountTransaction;
	public void verifyCreateCheckingPage() {
		Assert.assertTrue(newCheckingSign.isDisplayed());
	}
	public void verifyViewCheckingAccounts() {
		Assert.assertTrue(viewCheckingAccountSign.isDisplayed());
	}

	public void verifyNewAccountAlert() {
		Assert.assertTrue(newAccountAlert.isDisplayed());
	}

	public void enterUserDetails() {
		standardCheckingBtn.click();
		individualBtn.click();
		accountNameInput.sendKeys(ConfigReader.getProperty("accountNameChecking"));
		depositAmountInput.sendKeys(ConfigReader.getProperty("depositAmountChecking"));

	}

	public void clickOnSubmitCheckingBtn() {
		submitCheckingBtn.click();
	}

	public void verifyDepositIsDisplayed() {
		//Assert.assertEquals(depositAmountTransaction.toString().concat(1) , ConfigReader.getProperty("depositAmountDeposit"));
	}
}

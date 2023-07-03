package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingPage extends BasePage{
	@FindBy (xpath = "//strong[contains(text(), 'New Savings Account')]")
	WebElement newSavingsSign;
	@FindBy(id = "newSavingsSubmit")
	WebElement submitSavingsBtn;
	@FindBy(id = "Savings")
	WebElement savingsBnt;
	@FindBy(id = "Individual")
	WebElement individualBtn;
	@FindBy(id = "name")
	WebElement accountNameInput;
	@FindBy(id = "openingBalance")
	WebElement depositAmountInput;
	@FindBy(xpath = "//h1[contains(text(), 'View Savings Accounts')]")
	WebElement viewSavingAccountSign;
	@FindBy(id = "savings-menu")
	WebElement savingMenuBtn;

	public void verifyCreateSavingPage() {
		Assert.assertTrue(newSavingsSign.isDisplayed());
	}

	public void enterUserDetails() {
		savingsBnt.click();
		individualBtn.click();



		String accountName = "TestSavingAccount" + getRandomNumber();

		accountNameInput.sendKeys(accountName);

		ConfigReader.setProperty("account.name", accountName);
		int amount = getRandomNumber();
		depositAmountInput.sendKeys(amount + ""); // Integer convert to String
		ConfigReader.setProperty("transaction.amount", amount + "");
	}
	public void clickOnSubmitBtn(){
		submitSavingsBtn.click();
	}

	public void verifyUserOnViewSavingsAccount() {
		Assert.assertTrue(viewSavingAccountSign.isDisplayed());
	}
	public void userClickOnSavings() {
		savingMenuBtn.click();
	}
}

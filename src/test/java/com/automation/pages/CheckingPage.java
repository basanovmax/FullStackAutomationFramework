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




	public void verifyCreateCheckingPage() {
		Assert.assertTrue(newCheckingSign.isDisplayed());
	}



	public void enterUserDetails() {
		standardCheckingBtn.click();
		individualBtn.click();

		String accountName = "TestCheckingAccount" + getRandomNumber();

		accountNameInput.sendKeys(accountName);

		ConfigReader.setProperty("account.name", accountName);
		int amount = getRandomNumber();
		depositAmountInput.sendKeys(amount + ""); // Integer convert to String
		ConfigReader.setProperty("transaction.amount", amount + "");

	}

	public void clickOnSubmitCheckingBtn() {
		submitCheckingBtn.click();
	}

}

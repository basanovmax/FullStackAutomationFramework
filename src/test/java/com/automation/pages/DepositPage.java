package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DepositPage extends BasePage{
	@FindBy(xpath = "//h1[contains(text(), 'Deposit')]")
	WebElement depositSign;
	@FindBy(id = "amount")
	WebElement depositAmountInput;
	@FindBy(xpath = "//div[@class = 'card-footer']/button[@type='submit']")
	WebElement depositSubmitBtn;

	public void verifyUserOnDepositPage() {
		Assert.assertTrue(depositSign.isDisplayed());
	}

	public void userSelectAccountFromDropBox() {
		Select drpAccounts = new Select(driver.findElement(By.id("selectedAccount")));
		drpAccounts.selectByValue("2539");
	}







	public void userEnterAmount() {

		int amount = getRandomNumber();
		depositAmountInput.sendKeys(amount + ""); // Integer convert to String
		ConfigReader.setProperty("transaction.amount", amount + "");


	}







	public void clickOnSubmitDepositBtn() {
	depositSubmitBtn.click();
	}
	public void verifyDepositIsDisplayed() {
		//Assert.assertEquals(depositAmountTransaction.toString().concat(1) , ConfigReader.getProperty("depositAmountDeposit"));

		//public void verifyTransferEntryIsDisplayedCheckingAccount(String transferAmount) {
		//    Assert.assertTrue(firstRowTransactionTable.getText().contains(transferAmount));
		//    Assert.assertTrue(firstRowTransactionTable.getText().contains("Transfer"));
		//}
		//
		//
		//Mustafa Korkmaz
		//  < 1 minute ago
		//@FindBy(xpath = "//table[@id='transactionTable']//tbody/tr[1]")
		//WebElement firstRowTransactionTable;


		//@FindBy(xpath = "//table[@id='transactionTable']//tbody/tr[1]")
		//WebElement firstRowTransactionTable;
		//
		//
		//Mustafa Korkmaz
		//  < 1 minute ago
		//public void verifyTransferEntryIsDisplayedSavingsAccount(String transferAmount) {
		//        Assert.assertTrue(firstRowTransactionTable.getText().contains(transferAmount));
		//        Assert.assertTrue(firstRowTransactionTable.getText().contains("Transfer"));
		//    }
		//}
	}
}

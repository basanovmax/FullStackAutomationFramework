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
		depositAmountInput.sendKeys(ConfigReader.getProperty("depositAmountDeposit"));
	}

	public void clickOnSubmitDepositBtn() {
	depositSubmitBtn.click();
	}
}

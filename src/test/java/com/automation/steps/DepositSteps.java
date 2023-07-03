package com.automation.steps;

import com.automation.pages.DepositPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepositSteps {

	DepositPage depositPage = new DepositPage();
	@Then("verify deposit into account page is displayed")
	public void verifyDepositIntoAccountPageIsDisplayed() {
		depositPage.verifyUserOnDepositPage();
	}

	@When("user select account from the dropdown")
	public void userSelectAccountFromTheDropdown() {
		depositPage.userSelectAccountFromDropBox();
	}

	@And("enter the deposit amount")
	public void enterTheDepositAmount() {
		depositPage.userEnterAmount();
	}

	@And("click on submit button on a deposit page")
	public void clickOnSubmitButtonOnADepositPage() {
		depositPage.clickOnSubmitDepositBtn();
	}
	@And("verify deposit entry is displayed in the transaction history")
	public void verifyDepositEntryIsDisplayedInTheTransactionHistory() {
		depositPage.verifyDepositIsDisplayed();
	}
}

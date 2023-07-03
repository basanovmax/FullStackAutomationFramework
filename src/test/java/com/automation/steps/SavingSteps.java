package com.automation.steps;

import com.automation.pages.SavingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SavingSteps {

	SavingPage savingPage = new SavingPage();

	@When("user click on savings tab")
	public void user_click_on_savings_tab() {
		savingPage.userClickOnSavings();
	}
	@Then("verify new savings account page is displayed")
	public void verify_new_savings_account_page_is_displayed() {
	savingPage.verifyCreateSavingPage();

	}
	@When("user enters new savings account details")
	public void user_enters_new_savings_account_details() {
	savingPage.enterUserDetails();

	}
	@Then("verify view savings account page is displayed")
	public void verify_view_savings_account_page_is_displayed() {
	savingPage.verifyUserOnViewSavingsAccount();
	}

	@And("click on submit button on new savings account page")
	public void clickOnSubmitButtonOnNewSavingsAccountPage() {
		savingPage.clickOnSubmitBtn();
	}
}

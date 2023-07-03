package com.automation.steps;

import com.automation.pages.CheckingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckingSteps {

	CheckingPage checkingPage = new CheckingPage();
	@Then("verify new checking account page is displayed")
	public void verify_new_checking_account_page_is_displayed() {
		checkingPage.verifyCreateCheckingPage();

	}
	@ When("user enters new checking account details")
	public void user_enters_new_checking_account_details() {
		checkingPage.enterUserDetails();

	}
	@When("click on submit button on new checking account page")
	public void click_on_submit_checking_button() {
	checkingPage.clickOnSubmitCheckingBtn();
	}



}

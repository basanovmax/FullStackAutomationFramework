package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();
	@Given("user open website")
	public void user_open_website() {
		loginPage.openWebsite();
	}


	@When("user login with valid credentials username {string} and password {string}")
	public void userLoginWithValidCredentialsUsernameAndPassword(String usernameKey, String passwordKey) {
		loginPage.doLogin(ConfigReader.getProperty(usernameKey) , ConfigReader.getProperty(passwordKey));
	}
}

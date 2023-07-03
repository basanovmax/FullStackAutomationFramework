package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy(id = "username")
	WebElement usernameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "submit")
	WebElement submitBtn;

	public void openWebsite() {
		driver.get(ConfigReader.getProperty("application.url"));
	}

	public void doLogin(String username, String password) {
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		submitBtn.click();
	}
}

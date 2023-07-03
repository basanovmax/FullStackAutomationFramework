package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DatabaseUtils;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp(){
		ConfigReader.initProperties();
		DriverUtils.createDriver();
		DatabaseUtils.initDatabase();
	}

	@After
	public void cleanUp() {
		DriverUtils.getDriver().quit();
	}
}

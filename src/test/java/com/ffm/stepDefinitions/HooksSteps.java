package com.ffm.stepDefinitions;

import com.ffm.pages.FFM_Platform_Login_POM;
import com.ffm.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class HooksSteps extends TestBase {
	FFM_Platform_Login_POM loginPOM;

	// Global hooks
	@Before
	public void setup() {
		initializeDriver();

	}

	@Before("@AfterLogin")
	public void loginFFMOTMember() {
		loginPOM = new FFM_Platform_Login_POM();
		loginPOM.verifyLoginPage();
		loginPOM.loginOTMember(prop.getProperty("email"), prop.getProperty("password"));
		loginPOM.clickLoginBtn();

	}

	@After
	public void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}

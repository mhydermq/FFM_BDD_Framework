package com.ffm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ffm.utils.TestBase;

public class FFM_Platform_Login_POM extends TestBase{

	// Email Field
	@FindBy(id = "login")
	WebElement emailFieldElement;

	// Password Field
	@FindBy(id = "password")
	WebElement passFieldElement;

	// Login Button
	@FindBy(xpath = "//*[@id=\"formContent\"]/form/input[3]")
	WebElement loginButtonElement;

	// FFM login panel header
	@FindBy(xpath = "//*[@id=\"formContent\"]/div/h3")
	WebElement loginPanelHeaderElement;

	
	// Constructor of this login POM class
	public FFM_Platform_Login_POM() {

		//This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}
	
	public void loginOTMember(String email, String password) {
		emailFieldElement.sendKeys(email);
		passFieldElement.sendKeys(password);
		//loginButtonElement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	public void clickLoginBtn() {
		loginButtonElement.click();
	}
	
	public void verifyLoginPage() {
		loginPanelHeaderElement.isEnabled();
	}

}

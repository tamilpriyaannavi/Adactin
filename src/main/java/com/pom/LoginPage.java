package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//Webelement f =driver.findelement(by.id("username"));
	
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	
	
	
	
	
	
	

}

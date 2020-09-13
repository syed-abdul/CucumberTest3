package org.stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassPage1 extends BaseClass {
	public PomClassPage1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usrname;
	
	@FindBy(id="password")
	private WebElement psw;
	
	@FindBy(id="login")
	private WebElement lgnbtn;

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPsw() {
		return psw;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	
	
	}



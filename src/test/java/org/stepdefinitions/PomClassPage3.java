package org.stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassPage3 extends BaseClass {
	public  PomClassPage3(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0") 
    private WebElement rdbtn ;
	
	@FindBy(id="continue") 
    private WebElement cntbtn ;

	public WebElement getRdbtn() {
		return rdbtn;
	}

	public WebElement getCntbtn() {
		return cntbtn;
	}

}

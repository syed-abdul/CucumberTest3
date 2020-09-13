package org.stepdefinitions;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassPage2 extends BaseClass {
	public  PomClassPage2() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location") 
    private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement htl;
	 
	@FindBy(id="room_type")
	private WebElement rmtp;
	
	@FindBy(id="room_nos")
	private WebElement rmnos;
	
	@FindBy(id="adult_room")
	private WebElement adprrm;
	
    @FindBy(id="child_room")
	private WebElement chldrm;
	
	@FindBy(id="Submit")
	private WebElement srch;
	
	@FindBy(id="datepick_in")
	private WebElement ci;
	
	@FindBy(id="datepick_out")
	private WebElement co;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHtl() {
		return htl;
	}

	public WebElement getRmtp() {
		return rmtp;
	}

	public WebElement getRmnos() {
		return rmnos;
	}

	public WebElement getAdprrm() {
		return adprrm;
	}

	public WebElement getChldrm() {
		return chldrm;
	}

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getCi() {
		return ci;
	}

	public WebElement getCo() {
		return co;
	}


	
}

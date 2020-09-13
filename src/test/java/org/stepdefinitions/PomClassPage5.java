package org.stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassPage5 extends BaseClass {
	public PomClassPage5(){
		PageFactory.initElements(driver, this);
	}

		 
		    
         @FindBy(id="order_no")
         private WebElement orderno;
		
         @FindBy(id="logout") 
		 private WebElement log;


		public WebElement getOrderno() {
			return orderno;
		}


		public WebElement getLog() {
			return log;
		}


		
		
	}


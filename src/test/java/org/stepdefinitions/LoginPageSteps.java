package org.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends  BaseClass {
	 
	@Given("user is on the adactin hotel booking page")
	public void user_is_on_the_adactin_hotel_booking_page() {
		launchApp("http://adactinhotelapp.com/");
		}

	@When("user should enter the {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_the_and(String username, String password,String location, String hotels, String roomtype, String nor, String checkind, String checkoutd, String apr, String cpr, String firstname, String lastname, String billingaddress, String cardno, String cardtype, String exdatemonth, String exdateyear, String cvv) throws InterruptedException {
		PomClassPage1 pcp1=new PomClassPage1();
		fill(pcp1.getUsrname(),username);
		fill(pcp1.getPsw(), password);
        click(pcp1.getLgnbtn());
        Thread.sleep(5000);
        PomClassPage2 pcp2=new PomClassPage2();
        dropDown(pcp2.getLoc(),location);
        dropDown(pcp2.getHtl(),hotels );
        dropDown(pcp2.getRmtp(), roomtype);
        dropDown(pcp2.getRmnos(), nor);
        fill(pcp2.getCi(), checkind);
        fill(pcp2.getCo(), checkoutd);
        dropDown(pcp2.getAdprrm(),apr );
        dropDown(pcp2.getChldrm(), cpr);
        click(pcp2.getSrch());
        
        PomClassPage3 pcp3=new PomClassPage3();
        click(pcp3.getRdbtn());
        click(pcp3.getCntbtn());
        
        PomClassPage4 pcp4=new PomClassPage4();
        fill(pcp4.getFstnm(), firstname);
        fill(pcp4.getLstnm(), lastname);
        fill(pcp4.getAdd(), billingaddress);
        fill(pcp4.getCcdno(),cardno );
       dropDown(pcp4.getCcdtyp(), cardtype);
       dropDown(pcp4.getCcdexmon(), exdatemonth);
       dropDown(pcp4.getCcdexyr(), exdateyear);
       fill(pcp4.getCvvno(), cvv);
        click(pcp4.getBknwbtn());
	}

	@When("print the order number")
	public void print_the_order_number() throws InterruptedException {
		Thread.sleep(9000);
		PomClassPage5 pcp5=new PomClassPage5();
		
	getId(pcp5.getOrderno());
		
	}

	@Then("user should click the log out button")
	public void user_should_click_the_log_out_button() throws InterruptedException {
		 PomClassPage5 pcp5=new PomClassPage5();
		click(pcp5.getLog());
	}


}


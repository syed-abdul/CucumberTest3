package org.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	static WebDriver driver;
	public static void launchApp(String s) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\div m\\\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get(s);
		 driver.manage().window().maximize();
	}
	
	public static  void fill(WebElement web,String s) {
		web.sendKeys(s);
	}
	
	public static void click(WebElement web) {
		web.click();
	}
	
	public static void dropDown(WebElement web,String s) {
		Select sc=new Select(web);
       sc.selectByVisibleText(s);
	}

	public static void getId(WebElement web) {
		String name = web.getAttribute("value");
         System.out.println( "MY ORDER ID IS:"+name);
         
	}
	
}

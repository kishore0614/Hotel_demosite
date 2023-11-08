package com.pombooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	public static WebDriver driver; // null driver
	
     public PomPage01(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
	
	public WebElement getUsername() {
		return username;
		
	}
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	
	}	
	
	@FindBy(xpath = "//input[@id='username']" )
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']" )
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='login']" )
	private WebElement login;
	
		

}

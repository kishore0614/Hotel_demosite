package com.pombooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	
	public static WebDriver driver; // null driver
	
    public PomPage03(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
	
	public WebElement getCheckbox() {
		return checkbox;
		
	}
	public WebElement getSubmit() {
		return submit;
		
	}	
	
	@FindBy(xpath = "//input[@id='radiobutton_0']" )
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@id='continue']" )
	private WebElement submit;
	
	
}

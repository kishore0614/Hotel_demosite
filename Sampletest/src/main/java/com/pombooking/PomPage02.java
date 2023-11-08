package com.pombooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
	public static WebDriver driver; // null driver
	
    public PomPage02(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
	
	public WebElement getLocation() {
		return location;
		
	}
	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getType() {
		return type;
	}
		
	public WebElement getSubmit() {
		return submit;
	}	
	
	@FindBy(xpath = "//select[@id='location']" )
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']" )
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']" )
	private WebElement type;

	@FindBy(xpath = "//input[@id='Submit']" )
	private WebElement submit;

	

}

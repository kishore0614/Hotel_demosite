package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pombooking.Page_object_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	
	Page_object_manager pom = new Page_object_manager(driver);
	
	@Given("User Launch the url")
	public void user_launch_the_url() throws InterruptedException {
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		
	}
	@When("User Enter the Username")
	public void user_enter_the_username() {
		pom.getPomPage01().getUsername().sendKeys("Lucky2902");
		
	}
	@When("User Enter the Password")
	public void user_enter_the_password() {
		pom.getPomPage01().getPassword().sendKeys("563P47");
		
	}
	@When("User Click the Login")
	public void user_click_the_login() throws InterruptedException {
		pom.getPomPage01().getLogin().click();
		Thread.sleep(2000);
		
	}
	@Then("Next page shown \\(Page02)")
	public void next_page_shown_page02() {
	    System.out.println("Page Next");
	}
//	@When("User enter Location")
//	public void user_enter_location() {
//		Select s = new Select(pom.getPomPage02().getLocation());
//		s.selectByValue("Los Angeles");
//	    
//	}
//	@When("User enter Select Hotal Type")
//	public void user_enter_select_hotal_type() {
//		Select s1 = new Select(pom.getPomPage02().getHotels());
//		s1.selectByValue("Hotel Hervey");
//	    
//	}
//	@When("User enter Room type")
//	public void user_enter_room_type() throws InterruptedException {
//		Select s2 = new Select(pom.getPomPage02().getType());
//		s2.selectByValue("Super Deluxe");
//		
//		
//	}
//	@When("User Click Search")
//	public void user_click_search() throws InterruptedException {
//		pom.getPomPage02().getSubmit().click();
//		Thread.sleep(2000);	
//	
//		
//	}
//	@Then("Next Page Shown \\(Page03)")
//	public void next_page_shown_page03() {
//	
//	}
//	@When("User click the Checkbox")
//	public void user_click_the_checkbox() {
//		pom.getPomPage03().getCheckbox().click();
//		
//	}
//	@When("User click the Continue")
//	public void user_click_the_continue() throws InterruptedException {
//		pom.getPomPage03().getSubmit().click();
//		Thread.sleep(2000);
//		
//	}
//	@Then("Next Page Shown \\(Page04)")
//	public void next_page_shown_page04() {
//	    
//	}
//	@When("User Enter the Firstname")
//	public void user_enter_the_firstname() {
//		pom.getPomPage04().getFirstname().sendKeys("Lucky");
//         	
//	}
//	@When("User enter Lastname")
//	public void user_enter_lastname() {
//		pom.getPomPage04().getLastname().sendKeys("bo");
//
//	}
//	@When("User enter Address")
//	public void user_enter_address() {
//		pom.getPomPage04().getAddress().sendKeys("Brekeley CA 94702");
//		
//	}
//	@When("User enter Credit Card Number")
//	public void user_enter_credit_card_number() {
//		pom.getPomPage04().getCardnum().sendKeys("098761234566734");
//
//	}
//	@When("User Select Credit Card Type")
//	public void user_select_credit_card_type() {
//		Select s3 = new Select(pom.getPomPage04().getCardtype());
//		s3.selectByValue("MAST");
//
//	}
//	@When("User enter Expiry month")
//	public void user_enter_expiry_month() {
//		Select s4 = new Select(pom.getPomPage04().getExpmonth());
//		s4.selectByValue("5");
//
//	}
//	@When("User enter Expiry year")
//	public void user_enter_expiry_year() {
//		pom.getPomPage04().getExpyear().click();
//		Select s5 = new Select(pom.getPomPage04().getExpyear());
//		s5.selectByIndex(16);
//		
//	}
//	@When("User enter CVV Number")
//	public void user_enter_cvv_number() {
//		pom.getPomPage04().getCvvnumber().sendKeys("258");
//	
//	}
//	@When("User Click Booknow")
//	public void user_click_booknow() throws InterruptedException {
//		pom.getPomPage04().getBooknow().click();
//		Thread.sleep(8000);
//		driver.quit();
//	    
//	}


}

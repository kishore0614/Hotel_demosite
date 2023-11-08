package com.pombooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Hotal_booking {
  public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				                 "C:\\Users\\DIVI\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		PomPage01 a = new PomPage01(driver);
		PomPage02 b = new PomPage02(driver);
		PomPage03 c = new PomPage03(driver);
		PomPage04 d = new PomPage04(driver);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		a.getUsername().sendKeys("Lucky2902");
		a.getPassword().sendKeys("563P47");
		a.getLogin().click();
		Thread.sleep(2000);
		
		
		Select s = new Select(b.getLocation());
		s.selectByValue("Los Angeles");
		
		Select s1 = new Select(b.getHotels());
		s1.selectByValue("Hotel Hervey");
		
		Select s2 = new Select(b.getType());
		s2.selectByValue("Super Deluxe");
		b.getSubmit().click();
		
		
		Thread.sleep(2000);
		c.getCheckbox().click();
		c.getSubmit().click();
		Thread.sleep(2000);
		
		
		d.getFirstname().sendKeys("Lucky");
		d.getLastname().sendKeys("bo");
		d.getAddress().sendKeys("Brekeley CA 94702");
		d.getCardnum().sendKeys("098761234566734");
		
		Select s3 = new Select(d.getCardtype());
		s3.selectByValue("MAST");
		
		Select s4 = new Select(d.getExpmonth());
		s4.selectByValue("5");
		
		d.getExpyear().click();
		Select s5 = new Select(d.getExpyear());
		s5.selectByIndex(16);
		
		d.getCvvnumber().sendKeys("258");
		d.getBooknow().click();
		
		Thread.sleep(5000);
		driver.quit();
		
  }

}

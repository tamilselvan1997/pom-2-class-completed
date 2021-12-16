package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confrom {
	
	public WebDriver driver;
	
	public Booking_Confrom(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick5() {
		return click5;
	}

	@FindBy(name="logout")
	private WebElement click5;
	
	

}

package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_1 {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement element1;

	public Home_Page_1(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getElement1() {
		return element1;
	}

	public WebElement getElement2() {
		return element2;
	}

	public WebElement getclick1() {
		return click1;
	}

	@FindBy(id = "password")
	private WebElement element2;
	
	@FindBy(name="login")
	private WebElement click1;

}

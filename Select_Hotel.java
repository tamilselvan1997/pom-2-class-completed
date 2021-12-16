package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement click3;

	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick3() {
		return click3;
	}

	public WebElement getElement11() {
		return element11;
	}

	@FindBy(id = "continue")
	private WebElement element11;

}

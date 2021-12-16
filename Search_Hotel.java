package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getElement3() {
		return element3;
	}

	public WebElement getElement4() {
		return element4;
	}

	public WebElement getElement5() {
		return element5;
	}

	public WebElement getElement6() {
		return element6;
	}

	public WebElement getElement7() {
		return element7;
	}

	public WebElement getElement8() {
		return element8;
	}

	public WebElement getElement9() {
		return element9;
	}

	public WebElement getElement10() {
		return element10;
	}

	public WebElement getClick2() {
		return click2;
	}

	@FindBy(name = "location")
	private WebElement element3;

	@FindBy(id = "hotels")
	private WebElement element4;

	@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
	private WebElement element5;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement element6;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement element7;

	@FindBy(xpath = "(//input[@class='date_pick'])[2]")
	private WebElement element8;

	@FindBy(xpath = "//form[@id='search_form']/table/tbody/tr[8]/td[2]/select")
	private WebElement element9;

	@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
	private WebElement element10;
	
	@FindBy(name="Submit")
	private WebElement click2;
	
	
	
	
	

}

package com.pom_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement element12;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getElement12() {
		return element12;
	}

	public WebElement getElement13() {
		return element13;
	}

	public WebElement getElement14() {
		return element14;
	}

	public WebElement getElement15() {
		return element15;
	}

	public WebElement getElement16() {
		return element16;
	}

	public WebElement getElement17() {
		return element17;
	}

	public WebElement getElement18() {
		return element18;
	}

	public WebElement getElement19() {
		return element19;
	}

	public WebElement getClick4() {
		return click4;
	}

	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement element13;
	
	@FindBy(xpath="//form[@id='book_hotel_form']/table/tbody/tr[14]/td[2]/textarea")
	private WebElement element14;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement element15;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement element16;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement element17;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement element18;
	
	@FindBy(xpath="(//input[contains(@onkeypress,'return')])[2]")
	private WebElement element19;
	
	@FindBy(xpath="(//input[@type='button'])[ 1]")
	private WebElement click4;
	
	
	
	
	
	
	
	
	

}

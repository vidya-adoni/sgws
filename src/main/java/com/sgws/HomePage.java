package com.sgws;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends TestBaseClass {

	
	@FindBy(xpath="//input[@type='text']")
	WebElement stateDropdown;

	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public void selectState()
	{

			Select dropDown=new Select(stateDropdown);
			//dropDown.selectByValue("");
			//dropDown.selectByVisibleText("");
			dropDown.selectByIndex(4);
	
	}
	public void verifyHomePageDisplay() {
		
	}




}

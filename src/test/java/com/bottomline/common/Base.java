package com.bottomline.common;

import org.openqa.selenium.WebElement;

//BASE CLASS CONTAINS ALL NECCESSARY AND REPETITIVE ACTIONS NEEDED TO INTERACT WITH ANY PAGE
public class Base {

	// region Actions
	protected boolean Click(WebElement element) {
		element.click();
		return true;
	}

	protected boolean Write(WebElement element, String value) {
		element.sendKeys(value);
		return true;
	}
	// end region

}

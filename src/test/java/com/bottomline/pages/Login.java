package com.bottomline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.bottomline.common.Base;
import com.bottomline.objects.LoginObject;

//Login page used to authenticate to our version 2 application

public class Login extends Base {

	LoginObject obj = new LoginObject();

	public Login(WebDriver driver) {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, obj);
	}

	public void fillInfo() {
		Click(obj.username);
		Write(obj.username, "samuser");
		Write(obj.password, "P@ssw0rd");
	}

	public void login() {
		Click(obj.loginButton);
	}
}

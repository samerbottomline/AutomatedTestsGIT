package com.bottomline.tests;

import org.testng.annotations.Test;

import com.bottomline.common.Fundamental;
import com.bottomline.pages.Login;

public class LoginTest extends Fundamental {

	Login login;

	@Test
	public void login() {
		login = new Login(driver);
		login.fillInfo();
		login.login();
	}

}

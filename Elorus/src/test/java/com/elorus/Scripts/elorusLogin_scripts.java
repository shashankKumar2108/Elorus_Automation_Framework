package com.elorus.Scripts;

import org.testng.annotations.Test;

import com.elorus.generic.baseTest;
import com.elorus.pages.initialisePages;

public class elorusLogin_scripts extends baseTest{
	
	@Test
	public void elorusLogin_scripts()
	{
		initialisePages pages = new initialisePages(driver);
		pages.elorusLogin.setUsername(prop.getProperty("username"));
		pages.elorusLogin.setPassword(prop.getProperty("password"));
		pages.elorusLogin.clickSignIn();
		actionUtil.validateTitle("Elo");
		actionUtil.validateUrl("https://ss-technology.elorus.com/");
//		actionUtil.validateUrl("https://app.elorus.com/login/");
	}
}
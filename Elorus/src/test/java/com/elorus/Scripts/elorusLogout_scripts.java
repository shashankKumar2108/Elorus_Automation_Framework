package com.elorus.Scripts;

import org.testng.annotations.Test;

import com.elorus.generic.baseTest;
import com.elorus.pages.initialisePages;

public class elorusLogout_scripts extends baseTest{
	
	@Test
	public void elorusLogin_scripts()
	{
		initialisePages pages = new initialisePages(driver);
		pages.elorusLogin.setUsername("agastya5@gmail.com");
		pages.elorusLogin.setPassword("Sky#8088933584");
		pages.elorusLogin.clickSignIn();
		pages.elorusHome.clickUserMenu();
		pages.elorusHome.clickLogOut();
	}
	

}
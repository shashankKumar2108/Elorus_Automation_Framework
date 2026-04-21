package com.elorus.pages;

import org.openqa.selenium.WebDriver;
/*Class to initialize POM pages*/
public class initialisePages {
	
	public elorusLogin_page elorusLogin;
	public elorusHome_page elorusHome;
	public elorusContact_page elorusContact;
	public elorusAddContact_page elorusAddContact;
	
	public initialisePages(WebDriver driver)
	{
		this.elorusLogin = new elorusLogin_page(driver);
		this.elorusHome = new elorusHome_page(driver);
		this.elorusContact = new elorusContact_page(driver);
		this.elorusAddContact = new elorusAddContact_page(driver);
	}

}

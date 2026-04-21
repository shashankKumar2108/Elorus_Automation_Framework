package com.elorus.Scripts;

import org.testng.annotations.Test;

import com.elorus.dataproviders.elorusDataProvider;
import com.elorus.generic.baseTest;
import com.elorus.pages.initialisePages;

public class elorusAddContact_scripts extends baseTest{
	
	@Test(dataProviderClass = elorusDataProvider.class,dataProvider = "elorusAddContactData")
	public void elorusAddContact_script(String un, String pw, String fn,String ln, String com,String prof)
	{
		initialisePages pages = new initialisePages(driver);
		pages.elorusLogin.setUsername(un);
		pages.elorusLogin.setPassword(pw);
		pages.elorusLogin.clickSignIn();
		pages.elorusHome.clickContacts();
		pages.elorusContact.clickAdd();
		pages.elorusAddContact.setFirstName(fn);
		pages.elorusAddContact.setLastName(ln);
		pages.elorusAddContact.setCompany(com);
		pages.elorusAddContact.setProfession(prof);
		pages.elorusAddContact.clickSave();
	}

}
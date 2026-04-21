package com.elorus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class of Elorus Login Page*/
public class elorusLogin_page {
	
	/*Identifies  username*/
	@FindBy(name="email")
	private WebElement tbUsername;
	
	/*Identifies  password*/
	@FindBy(id="id_password")
	private WebElement tbPassword;
	
	/*Identifies Sign In*/
	@FindBy(xpath="//input[@value='SIGN IN']")
	private WebElement btnSignIN;
	
	/*Method to set username*/
	public void setUsername(String un)
	{
		this .tbUsername.sendKeys(un);
	}
	
	/*Method to set password*/
	public void setPassword(String pw)
	{
		this.tbPassword.sendKeys(pw);
	}
	
	/*Method to click sign in*/
	public void clickSignIn()
	{
		this.btnSignIN.click();
	}
	
	/*Constructor*/
	public elorusLogin_page(WebDriver driver)
	{
		/*initializes the webelement*/
		PageFactory.initElements(driver, this);
	}
}
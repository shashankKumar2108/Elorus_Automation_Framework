package com.elorus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class of Elorus Add Contact page*/
public class elorusAddContact_page {
	
	/*Identifies first name*/
	@FindBy(name="first_name")
	private WebElement tbFirstName;

	/*Identifies last name*/
	@FindBy(name="last_name")
	private WebElement tbLastName;
	
	/*Identifies company */
	@FindBy(name="company")
	private WebElement tbCompany;
	
	/*Identifies profession*/
	@FindBy(name="profession")
	private WebElement tbProfession;
	
	/*Identifies Save*/
	@FindBy(xpath="//span[text()='Save']/parent::a")
	private WebElement btnSave;
	
	
	
	/*Method to click sign in*/
	public void setFirstName(String fn)
	{
		this.tbFirstName.sendKeys(fn);;
	}
	/*Method to click sign in*/
	public void setLastName(String ln)
	{
		this.tbLastName.sendKeys(ln);
	}
	
	/*Method to click sign in*/
	public void setCompany(String comp)
	{
		this.tbCompany.sendKeys(comp);
	}
	
	/*Method to click sign in*/
	public void setProfession(String prof)
	{
		this.tbProfession.sendKeys(prof);
	}
	
	/*Method to click sign in*/
	public void clickSave()
	{
		this.btnSave.click();
	}
	
	/*Constructor*/
	public elorusAddContact_page(WebDriver driver)
	{
		/*initializes the webelement*/
		PageFactory.initElements(driver, this);
	}
	
}
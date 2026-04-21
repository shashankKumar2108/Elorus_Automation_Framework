package com.elorus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*POM class of Elorus Home Page*/
public class elorusHome_page {
	
	/*Identifies  Invoices*/
	@FindBy(xpath="//a[@title='Invoices']")
	private WebElement lnkInvoices;
	
	/*Identifies  Expenses*/
	@FindBy(xpath="//a[@title='Expenses']")
	private WebElement lnkExpenses;
	
	/*Identifies  Projects*/
	@FindBy(xpath="//a[@title='Projects']")
	private WebElement lnkProjects;
	
	/*Identifies  Time*/
	@FindBy(xpath="//a[@title='Time']")
	private WebElement lnkTime;
	
	/*Identifies  Contacts*/
	@FindBy(xpath="//a[@title='Contacts']")
	private WebElement lnkContacts;
	
	/*Identifies  Estimates*/
	@FindBy(xpath="//a[@title='Estimates']")
	private WebElement lnkEstimates;
	
	/*Identifies  User menu*/
	@FindBy(xpath="//a[@title='User menu']")
	private WebElement btnUsermenu;
	
	/*Identifies  User menu*/
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement btnLogOut;
	
	/*Method to click Invoices*/
	public void clickInvoices()
	{
		this.lnkInvoices.click();
	}
	
	/*Method to click Expenses*/
	public void clickExpenses()
	{
		this.lnkExpenses.click();
	}
	
	/*Method to click Projects*/
	public void clickProjects()
	{
		this.lnkProjects.click();
	}
	
	/*Method to click Time*/
	public void clickTime()
	{
		this.lnkTime.click();
	}
	
	/*Method to click Contacts*/
	public void clickContacts()
	{
		this.lnkContacts.click();
	}
	
	/*Method to click Estimates*/
	public void clickEstimates()
	{
		this.lnkEstimates.click();
	}
	
	/*Method to click UserMenu*/
	public void clickUserMenu()
	{
		this.btnUsermenu.click();
	}
	
	/*Method to click LogOut*/
	public void clickLogOut()
	{
		this.btnLogOut.click();
	}
	
	/*Constructor*/
	public elorusHome_page(WebDriver driver)
	{
		/*initializes the webelement*/
		PageFactory.initElements(driver, this);
	}

}

package com.elorus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*POM class of Elorus Contact page*/
public class elorusContact_page {
	
	/*Identifies  Add*/
	@FindBy(xpath="//span[text()='Add']/parent::a")
	private WebElement btnAdd;
	
	/*Identifies  Bulk import*/
	@FindBy(xpath="//span[text()='Bulk import']/parent::a")
	private WebElement btnBulkImport;
	
	/*Method to click add*/
	public void clickAdd()
	{
		this.btnAdd.click();
	}
	
	/*Method to click Bulk Import*/
	public void clickBulkImport()
	{
		this.btnBulkImport.click();
	}
	
	/*Constructor*/
	public elorusContact_page(WebDriver driver)
	{
		/*initializes the webelement*/
		PageFactory.initElements(driver, this);
	}

}
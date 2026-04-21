package com.elorus.generic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/* class for utility methods */
public class webActionutil {
	
	WebDriver driver;
	
	public webActionutil(WebDriver driver) {
		this.driver=driver;
	}

	/* Method to read the data from excel */
	public static String getData(String excelPath, String sn, int r, int c)  {
		try {
		FileInputStream f = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
		return d;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	/* Method to handle file upload pop up */
	public static void fileUpload(String Location) throws Throwable {
		StringSelection data = new StringSelection(Location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(data, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/* Method to do the validation wrt title */
	public void validateTitle(String expectedTitle)
	{
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		System.out.println("Pass:title is matching");
		}
		catch (Exception e) {
			System.out.println("Fail:title is not matching");
			Assert.fail();
		}
	}
	
	/* Method to do the validation wrt URL */
	public void validateUrl(String expectedUrl)
	{
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
		System.out.println("Pass:url is matching");
		}
		catch (Exception e) {
			System.out.println("Fail:url is not matching");
			Assert.fail();
		}
	}
	
	/* Method to do the validation wrt URL */
	public void validateVisibility(WebElement element)
	{
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Pass:Element is visible");
		}
		catch (Exception e) {
			System.out.println("Fail:Element is not visible");
			Assert.fail();
		}
	}
	
	/* Method to handle multiple window */
	public void multipleWindow(){
		String MainWindow = driver.getWindowHandle();
		Set<String> AllWindow = driver.getWindowHandles();
		for(String lv:AllWindow) {
			driver.switchTo().window(lv);
		    if (!lv.contentEquals(MainWindow)) {
		    	driver.close();
		    }
		}
	}
	
	/* Method to handle multiple tabs */
	public void multipleTabs() {
	    String oldTab = driver.getWindowHandle();
		Set<String> allTab = driver.getWindowHandles();
		for(String lv:allTab) {
		    driver.switchTo().window(lv);
		    if(lv.contentEquals(oldTab)) {
		    	driver.close();
		    }
		}
	}
	
	/* Method to capture screen shot */
	public void captureScreenshot(String scriptName) {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(baseTest.userdir + "\\screenshot\\" + scriptName + ".png");
		try {
		FileUtils.copyFile(src, dest);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
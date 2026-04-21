package com.elorus.generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest {

	/* All the constants are defined */
	public static final String userdir = System.getProperty("user.dir");
	public static final String chromeKey = "webdriver.chrome.driver";
	public static final String geckoKey = "webdriver.gecko.driver";
	public static final String edgeKey = "webdriver.edge.driver";
	public static final String chromeValue = userdir + "\\driver\\chromedriver.exe";
	public static final String geckoValue = userdir + "\\driver\\geckodriver.exe";
	public static final String edgeValue = userdir + "\\driver\\msedgedriver.exe";
	public static final String excelPath = userdir + "\\data\\ElorusData.xlsx";
	public static final String propertyPath = userdir + "\\data\\ElorusData.properties";
	public WebDriver driver;
	public Properties prop;
	public static webActionutil actionUtil;

	/* Sets the path to the drivers */
	@BeforeClass
	public void setPath() {
		try {
		FileInputStream f = new FileInputStream(propertyPath);
			prop = new Properties();
			prop.load(f);
		} catch (Exception e) {

		}
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
		System.setProperty(edgeKey, edgeValue);
	}

	/* Launches the Browser */
	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String BN) {
		if (BN.equalsIgnoreCase("Chrome"))
			this.driver = new ChromeDriver();
		else if (BN.equalsIgnoreCase("Firefox"))
			this.driver = new FirefoxDriver();
		else if (BN.equalsIgnoreCase("Edge"))
			this.driver = new EdgeDriver();
        
		actionUtil=new webActionutil(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

	/* Closes the Broswer */
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	/* Kills the drivers */
	@AfterSuite
	public void killDrivers() {
		try {
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM msedgedriver.exe /F");
		} catch (Exception e) {

		}
	}

}
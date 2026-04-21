package com.elorus.dataproviders;

import org.testng.annotations.DataProvider;

import com.elorus.generic.baseTest;
import com.elorus.generic.webActionutil;

/* class for Dataproviders of Elorus Project */

public class elorusDataProvider {

	@DataProvider
	public Object[] sampleDataProvider() {
		
		Object[] data = {"Disha", 500, 25.5f, true};
		return data;
	}
	
	@DataProvider
	public Object[][] elorusLoginData() 
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "agastya21@gmail.com";
		data[0][1] = "Sky#8088933584";
		data[1][0] = "rocky@gmail.com";
		data[1][1] = "Sky#8088933584";
		data[2][0] = "shiva@gmail.com";
		data[2][1] = "Sky#8088933584";
		return data;
	}
	
	@DataProvider
	public Object[][] elorusAddContactData() throws Throwable 
	{
		String elorusExcel = baseTest.excelPath;
		Object[][] data = new Object[1][6];
		data[0][0] = webActionutil.getData(elorusExcel, "Elorus", 1, 1);
		data[0][1] = webActionutil.getData(elorusExcel, "Elorus", 1, 2);
		data[0][2] = webActionutil.getData(elorusExcel, "Elorus", 1, 3);
		data[0][3] = webActionutil.getData(elorusExcel, "Elorus", 1, 4);
		data[0][4] = webActionutil.getData(elorusExcel, "Elorus", 1, 5);
		data[0][5] = webActionutil.getData(elorusExcel, "Elorus", 1, 6);
		return data;
	}
}

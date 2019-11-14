package com.adac;

import java.io.IOException;

import org.openqa.selenium.Alert;

public class LaunchWebsite extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser("https://adactin.com/HotelApp/index.php");
		AdacLocator ad = new AdacLocator();
		type(ad.getTxtUsername(),"naveenkumart46");
		type(ad.getTxtPass(),"naveen46");
		click(ad.getBtnLogin());
		driver.manage().window().maximize();
		screenShot("C:\\Users\\PIGGU\\Desktop\\Selenium\\Adac\\afterlogin.jpg");
		selectText(ad.getTxtLocation(),"Paris");
		selectText(ad.getTxtHotels(),"Hotel Sunshine");
		selectText(ad.getTxtRoomtype(),"Super Deluxe");
		selectText(ad.getTxtRoomnos(),"1 - One");
		type(ad.getTxtInDatepick(),"08/11/2019");
		type(ad.getTxtOutDatepick(),"10/11/2019");
		selectText(ad.getDropAdultRoom(),"2 - Two");
		screenShot("C:\\Users\\PIGGU\\Desktop\\Selenium\\Adac\\afterdetails.jpg");
		click(ad.getBtnSubmit());
		Thread.sleep(3000);
		click(ad.getBtnRadio());
		click(ad.getBtnContinue());
		Thread.sleep(3000);
		type(ad.getTxtFirstName(),"Naveen");
		type(ad.getTxtLastname(),"Tippa");
		type(ad.getTxtAddress(),"093,Dlf GardenCity,Semmanchery, Chennai 600119");
		type(ad.getTxtCreditCardno(),"3234545678923454");
		selectText(ad.getDropCCType(),"VISA");
		selectText(ad.getDropCCMonth(),"January");
		selectText(ad.getDropCCYear(),"2022");
		type(ad.getTxtCVV(),"123");
		click(ad.getBtnBookNow());
		Thread.sleep(5000);
		scrollDown(ad.getScrollOrder());
		screenShot("C:\\Users\\PIGGU\\Desktop\\Selenium\\Adac\\afterbooking.jpg");
		click(ad.getBtnMyItinerary());
		click(ad.getBtnSelectBook());
		click(ad.getBtnCancelSelected());
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		screenShot("C:\\Users\\PIGGU\\Desktop\\Selenium\\Adac\\aftercancelling.jpg");
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}

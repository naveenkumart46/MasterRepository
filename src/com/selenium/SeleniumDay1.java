package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Naveen\\driver\\chromedriver.exe" );
		WebDriver wd = new ChromeDriver();
		wd.get("http://www.greenstechnologys.com/selenium-course-content.html");
		wd.manage().window().maximize();
		Thread.sleep(5000);
		wd.quit();
		
	}

}

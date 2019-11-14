package com.adac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser(String url){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Naveen\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	public static void type(WebElement loc, String in){
		loc.sendKeys(in);
	}
	
	public static void click(WebElement loc){
		loc.click();
	}
	
	public static void closeBrowser(){
		driver.quit();
	}
	
	public static void screenShot(String path) throws IOException{
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
		
	}
	public static void scrollDown(WebElement loc){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", loc);
		
	}
	public static void selectText(WebElement loc, String in){
		Select s= new Select(loc);
		s.selectByVisibleText(in);
	}
	

}

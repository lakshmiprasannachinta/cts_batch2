package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonesMenuPage {
	private static By phoneloc = By.xpath("//a[text()='Smartphone']");

	public static void clickOnPhone(WebDriver driver) {
		driver.findElement(phoneloc).click();
	}
	
	 public static String getTitle (WebDriver driver)
	 {
		 String title = driver.getTitle();
		 return title;
	 }
	 
}
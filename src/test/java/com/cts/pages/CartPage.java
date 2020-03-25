package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private static By checkoutloc = By.xpath("//button[@id='checkout']");
	private static By termsloc = By.xpath("//input[@name='termsofservice']");
	
	public static void termsclick(WebDriver driver) {
		driver.findElement(termsloc).click();
	}
	public static void checkoutclick(WebDriver driver) {
		driver.findElement(checkoutloc).click();
	}
}

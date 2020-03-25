package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	private static By mailloc = By.xpath("//input[@id='Email']");
	private static By passloc = By.xpath("//input[@id='Password']");
	private static By checkoutloc = By.xpath("//button[@id='checkout']");
	private static By loginloc = By.xpath("//input[@value='Log in']");
	
	public static void mailenter(WebDriver driver, String mail) {
		driver.findElement(mailloc).sendKeys(mail);
	}
	
	public static void passwordenter(WebDriver driver, String password) {
		driver.findElement(passloc).sendKeys(password);
	}
	public static void WaitForCheckout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutloc));	
}
	public static void clickonlogin(WebDriver driver) {
		driver.findElement(loginloc).click();
	}
}

package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhishListPage {
	private static By wishlistloc = By.xpath("//input[@value='Add to wishlist']");
	private static By addedtolistloc=By.xpath("//a[text()='wishlist']");
	private static By cartloc=By.xpath("//input[@id='add-to-cart-button-43']");
	private static By addedtocartloc=By.xpath("//a[text()='shopping cart']");
	private static By shoppingloc=By.xpath("//span[contains(text(),'Shopping cart')]");
	public static void clickOnWishList(WebDriver driver) {
	driver.findElement(wishlistloc).click();
}
	public static void listpopupWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addedtolistloc));
	
}
	public static void clickOncart(WebDriver driver) {
	driver.findElement(cartloc).click();
	}

	public static void cartpopupWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addedtocartloc));
	
}
public static void clickOnShoppingList(WebDriver driver) {
	driver.findElement(shoppingloc).click();
}
public static String getTitle(WebDriver driver) {
	String title = driver.getTitle();
	 return title;
}
}
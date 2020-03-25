package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
 private static By categorycloc = By.linkText("Electronics");
 private static By cellloc=By.linkText("Cell phones");
 
 public static void selectCategory(WebDriver driver) {
	 driver.findElement(categorycloc).click();
 }
	 public static void selectCellPhones(WebDriver driver) {
	 driver.findElement(cellloc).click();
 }
 
	 public static String getTitle (WebDriver driver)
	 {
		 String title = driver.getTitle();
		 return title;
	 }
}

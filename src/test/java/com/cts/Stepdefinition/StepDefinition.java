package com.cts.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.CartPage;
import com.cts.pages.CheckoutPage;
import com.cts.pages.PhonesMenuPage;
import com.cts.pages.ProductPage;
import com.cts.pages.WhishListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver;
@Given("I have a browser with demowebshop application")

public void i_have_a_browser_with_demowebshop_application() {

System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://demowebshop.tricentis.com/");
}

@When("I click on electronis")
public void i_click_on_electronis() {
    ProductPage.selectCategory(driver);
}

@When("clcik on cell phones")
public void clcik_on_cell_phones() {
	ProductPage.selectCellPhones(driver);
}

@Then("application has to redirect to page with title as {string}")
public void application_has_to_redirect_to_page_with_title_as(String expectedTitle) {
	
	String actualTitle =ProductPage.getTitle(driver);
	Assert.assertEquals(expectedTitle, actualTitle);
}

@When("I click on product")
public void i_click_on_product() {
	
	PhonesMenuPage.clickOnPhone(driver);
}

@Then("application has to redirect to page with title  {string}")
public void application_has_to_redirect_to_page_with_title(String expectedTitle) {
	String originalTitle =ProductPage.getTitle(driver);
	Assert.assertEquals(expectedTitle, originalTitle);
}
@When("I add a product to the wishlist")
public void i_add_a_product_to_the_wishlist() {
	
	WhishListPage.clickOnWishList(driver);
}

@Then("the product must be visible in the wishlist")
public void the_product_must_be_visible_in_the_wishlist() {
	
	WhishListPage.listpopupWait(driver);;
}
@When("I add a product to the cart")
public void i_add_a_product_to_the_cart() {
	WhishListPage.clickOncart(driver);;
}

@Then("the product must be visible in the cart")
public void the_product_must_be_visible_in_the_cart() {
	WhishListPage.cartpopupWait(driver);;
}

@When("click on shopping cart")
public void click_on_shopping_cart() {
	WhishListPage.clickOnShoppingList(driver);
}

@Then("chechout is clicked")
public void chechout_is_clicked() {
	CartPage.termsclick(driver);
    CartPage.checkoutclick(driver);
}
@When("I enter <emailaddress> as {string} and password  as {string}")
public void i_enter_emailaddress_as_and_password_as(String mail, String password) {
    CheckoutPage.mailenter(driver, "mouniechinta67@gmail.com");
    CheckoutPage.passwordenter(driver, "mounica");
    CheckoutPage.clickonlogin(driver);
}

@Then("I  must able to checkout the product that i added in the wishlisted")
public void i_must_able_to_checkout_the_product_that_i_added_in_the_wishlisted() {
	CheckoutPage.WaitForCheckout(driver);
}
}


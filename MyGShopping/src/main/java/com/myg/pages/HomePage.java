package com.myg.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myg.constants.Constants;
import com.myg.utilities.GenericUtility;
import com.myg.utilities.PageUtility;
import com.myg.utilities.WaitUtility;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='search_input']")
	WebElement searchBox;

	@FindBy(xpath = "//button[@title='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//button[@id='button_cart_6507']")
	WebElement addtoCartButton;

	@FindBy(xpath = "//span[text()='Continue shopping']")
	WebElement continueShoppingButton;

	@FindBy(xpath = "//h1[text()='The product was added to your cart']")
	WebElement cartAddedConfirmMessage;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchBoxClick() {
		GenericUtility.sendValues(searchBox, Constants.productName);
	}

	public void searchButtonClick() {
		GenericUtility.clickOnElement(searchButton);
	}

	public void addtoCartButtonClick() {
		GenericUtility.clickOnElement(addtoCartButton);
	}

	public void continueShoppingButtonClick() {
		GenericUtility.clickOnElement(continueShoppingButton);
	}

	public boolean isproductAddedtoCart() {
		return cartAddedConfirmMessage.getText().equals(Constants.cartAddedConfirmText);
	}

}

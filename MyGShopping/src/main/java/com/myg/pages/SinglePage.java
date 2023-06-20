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

public class SinglePage {
	WebDriver driver;

	@FindBy(xpath = "//button[@id='button_cart_6507']")
	WebElement addtoCartButton;

	@FindBy(xpath = "//img[@class='ty-pict cm-image']")
	WebElement singleProduct;

	@FindBy(xpath = "//span[text()='Continue shopping']")
	WebElement continueShoppingButton;

	@FindBy(xpath = "//h1[text()='The product was added to your cart']")
	WebElement cartAddedConfirmMessage;

	public SinglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void singleProductClick() {
		GenericUtility.clickOnElement(singleProduct);
	}

	public void addtoCartButtonClick() {
		GenericUtility.clickOnElement(addtoCartButton);
	}

	public void continueShoppingButtonClick() {
		GenericUtility.clickOnElement(continueShoppingButton);
	}

	public boolean isproductAddedtoCartFromSinglePage() {
		return cartAddedConfirmMessage.getText().equals(Constants.cartAddedConfirmText);
	}

}

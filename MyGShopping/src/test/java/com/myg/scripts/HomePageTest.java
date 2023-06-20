package com.myg.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myg.pages.HomePage;

public class HomePageTest extends TestHelper {

	@Test
	public void verifyProductCanBeAddedToCart() throws InterruptedException {
		HomePage homepage = new HomePage(webDriver);
		homepage.searchBoxClick();
		homepage.searchButtonClick();
		homepage.addtoCartButtonClick();
		homepage.continueShoppingButtonClick();
		boolean val = homepage.isproductAddedtoCart();
		Assert.assertEquals(true, val);
		System.out.println("Product added to cart and test passed !!!");

	}

}

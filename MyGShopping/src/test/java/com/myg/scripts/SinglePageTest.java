package com.myg.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myg.pages.HomePage;
import com.myg.pages.SinglePage;

public class SinglePageTest extends TestHelper {

	@Test
	public void verifyProductCanBeAddedToCart() throws InterruptedException {
		HomePage homepage = new HomePage(webDriver);
		homepage.searchBoxClick();
		homepage.searchButtonClick();
		SinglePage sp = new SinglePage(webDriver);
		sp.singleProductClick();
		sp.addtoCartButtonClick();
		sp.continueShoppingButtonClick();
		boolean val = sp.isproductAddedtoCartFromSinglePage();
		Assert.assertEquals(true, val);
		System.out.println("Product added from single product page and test passed !!!");
	}

}

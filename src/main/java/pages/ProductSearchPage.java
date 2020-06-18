package pages;

import org.openqa.selenium.By;

import maps.ProductSearchMap;

public class ProductSearchPage extends BasePage {
	
	/**
	 * Clicks on a product by name
	 * 
	 * @param name Name of the product
	 */
	public void clickOnAProductByName(String name) {
		By link = ProductSearchMap.productLinkByName(name);
		waitForElementToBeVisible(link, MAX_TIME);
		clickElement(link);
	}
}

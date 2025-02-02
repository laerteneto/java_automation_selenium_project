package pages;

import org.openqa.selenium.By;

import maps.ProductMap;

public class ProductPage extends BasePage {
	
	/**
	 * Adds the product to the shopping basket
	 * 
	 */
	public void addProductToBasket() {
		By addToBasketButton = ProductMap.elementByTypeAndText("button", " Add to basket");
		waitForElementToBeVisible(addToBasketButton, MAX_TIME);
		clickElement(addToBasketButton);
	}
	
	/**
	 * Validates if the message "You have saved the following item in your shopping basket." is being displayed
	 * 
	 * @return True or false
	 */
	public Boolean isProductSavedMessageDisplayed() {
		By message = ProductMap.elementByTypeAndText("h2", "You have saved the following item in your shopping basket.");
		return elementExists(message, true);
	}
	
	/**
	 * Validates if the product name is shown on confirmation modal 
	 * 
	 * @return True or false
	 */
	public Boolean isProductSavedOnTheShoppingBasket(String name) {
		By productName = ProductMap.productNameOnModal(name);
		return elementExists(productName, true);
	}
	
	/**
	 * Clicks on the button to go from the modal to the shopping basket
	 * 
	 */
	public void goToShoppingBasket() {
		By goToBasketButton = ProductMap.elementByTypeAndText("button", " Go to shopping basket");
		waitForElementToBeClickable(goToBasketButton, MAX_TIME);
		clickElementJS(goToBasketButton);
	}
}

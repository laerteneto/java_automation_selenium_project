package pages;

import org.openqa.selenium.By;

import maps.BaseMap;

public class ShoppingBasketPage extends BasePage {
	
	/**
	 * Validates if a product is in the shopping basket
	 * 
	 * @return true or false
	 */
	public Boolean isProductInTheShoppingBasket(String name) {
		By productName = BaseMap.elementByTypeAndText("span", name);
		return elementExists(productName, true);
	}
}

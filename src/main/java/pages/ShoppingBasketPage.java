package pages;

import org.openqa.selenium.By;

import maps.BaseMap;

public class ShoppingBasketPage extends BasePage {
	
	/**
	 * Validates if a product is on the shopping basket
	 * 
	 * @return true or false
	 */
	public Boolean isProductOnTheShoppingBasket(String name) {
		By productName = BaseMap.spanByText(name);
		return elementExists(productName, true);
	}
}

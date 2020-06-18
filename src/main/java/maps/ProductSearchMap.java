package maps;

import org.openqa.selenium.By;

public class ProductSearchMap extends BaseMap {
	
	/**
	 * Creates a locator by xpath related to the link of a product by name
	 * 
	 * @param productName The name of the product
	 * 
	 * @return The locator by xpath
	 */
	public static By productLinkByName(String productName) {
		return By.xpath("//h3[text()='" + productName + "']/parent::a");
	}
}

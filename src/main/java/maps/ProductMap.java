package maps;

import org.openqa.selenium.By;

public class ProductMap extends BaseMap {
	
	/**
	 * Creates a locator by xpath related to the text that is present on the saved items modal
	 * 
	 * @param name The name of the product
	 * 
	 * @return The locator by xpath
	 */
	public static By productNameOnModal(String name) {
		return By.xpath("//div[@class=\"modal-content\"]//span[text()='" + name + "']");
	}
}

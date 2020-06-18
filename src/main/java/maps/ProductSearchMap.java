package maps;

import org.openqa.selenium.By;

public class ProductSearchMap extends BaseMap {
	
	public static By productLinkByName(String productName) {
		return By.xpath("//h3[text()='" + productName + "']/parent::a");
	}
}

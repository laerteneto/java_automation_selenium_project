package maps;

import org.openqa.selenium.By;

public class ProductMap extends BaseMap {
	
	public static By productNameOnModal(String name) {
		return By.xpath("//div[@class=\"modal-content\"]//span[text()='" + name + "']");
	}
}

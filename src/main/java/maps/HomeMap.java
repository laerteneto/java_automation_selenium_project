package maps;

import org.openqa.selenium.By;

public class HomeMap extends BaseMap {
	
	/**
	 * Creates a locator by xpath related to the Fashion and Beauty banners
	 * 
	 * @param kind Can be, for instance, Men, Women or Children
	 * 
	 * @return The locator by xpath
	 */
	public static By fashionAndBeautyBannerByKind(String kind) {
		return By.xpath("//img[contains(@data-ng-src, '" + kind + "')]/ancestor::a");
	}
}

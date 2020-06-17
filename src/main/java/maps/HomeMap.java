package maps;

import org.openqa.selenium.By;

public class HomeMap extends BaseMap {
	
	public static By fashionAndBeautyBannerByKind(String kind) {
		return By.xpath("//img[contains(@data-ng-src, '" + kind + "')]/ancestor::a");
	}

}

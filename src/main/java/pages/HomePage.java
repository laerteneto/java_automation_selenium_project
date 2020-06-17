package pages;

import maps.HomeMap;

public class HomePage extends BasePage {

	/**
	 * Access the main system url
	 */
	public void accessHomePage() {
		accessUrl(baseURL);
	}

	/**
	 * Open the products list by the banner
	 * 
	 * @param produtType Can be for example Woman, Men, and Children 
	 */
	public void openProductsList(String produtType) {
		clickElement(HomeMap.fashionAndBeautyBannerByKind(produtType));
	}

}
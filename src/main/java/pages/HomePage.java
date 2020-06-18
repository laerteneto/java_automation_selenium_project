package pages;

import org.openqa.selenium.By;

import maps.HomeMap;

public class HomePage extends BasePage {

	/**
	 * Access the main system url
	 */
	public void accessHomePage() {
		accessUrl(baseURL);
	}
	
	/**
	 * Agree with Cookies, if available
	 * @throws InterruptedException 
	 */
	public void agreeWithCookies() {
		By agreeWithCookiesButton = HomeMap.buttonByText("Agree");
		if (elementExists(agreeWithCookiesButton, true)) {
			clickElement(agreeWithCookiesButton);
			forcedWait(10);
		}
	}

	/**
	 * Open the products list by the banner
	 * 
	 * @param produtType Can be for example Woman, Men, and Children 
	 */
	public void openProductsList(String produtType) {
		By banner = HomeMap.fashionAndBeautyBannerByKind(produtType);
		waitForElementToBeVisible(banner, MAX_TIME);
		clickElement(banner);
	}

}
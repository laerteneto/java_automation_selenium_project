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
	 * 
	 */
	public void agreeWithCookies() {
		By agreeWithCookiesButton = HomeMap.elementByTypeAndText("button", "Agree");
		if (elementExists(agreeWithCookiesButton, true)) {
			clickElement(agreeWithCookiesButton);
			forcedWait(15); // Necessary to handle the reload the browser does after accepting the cookies
		}
	}

	/**
	 * Open the products list by the banner kind
	 * 
	 * @param produtType Can be, for example, Woman, Men, and Children
	 */
	public void openProductsList(String produtType) {
		By banner = HomeMap.fashionAndBeautyBannerByKind(produtType);
		waitForElementToBeVisible(banner, MAX_TIME);
		scrollToPageBottom();
		clickElementJS(banner);
	}

}
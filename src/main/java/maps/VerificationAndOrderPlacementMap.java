package maps;

import org.openqa.selenium.By;

public class VerificationAndOrderPlacementMap extends BaseMap {

	/**
	 * Creates a locator by xpath related to a div element that contains all the
	 * address info, and contains a specific postal code
	 * 
	 * @param addressType Can be Invoice or Delivery
	 * @param postalCode  The postal code
	 * 
	 * @return The locator by xpath
	 */
	public static By postalCodeInAddress(String addressType, String postalCode) {
		return By
				.xpath("//h3[text()='" + addressType + "']/parent::div//div[contains(text()[4],'" + postalCode + "')]");
	}

	/**
	 * Creates a locator by xpath related to a combo about Shipping or Payment type and its value
	 * 
	 * @param sectionName The name of the section can be Shipping type or Payment
	 *                    type
	 * @param value       The value is the option previously selected
	 * 
	 * @return The locator by xpath
	 */
	public static By sectionAndValue(String sectionName, String value) {
		return By.xpath("//h3[text()='" + sectionName + "']//parent::div//*[text()='" + value + "']");
	}
}

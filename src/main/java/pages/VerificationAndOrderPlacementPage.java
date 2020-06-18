package pages;

import org.openqa.selenium.By;

import maps.VerificationAndOrderPlacementMap;

public class VerificationAndOrderPlacementPage extends BasePage {

	/**
	 * Validates if a postal code is in the summary of an specific address
	 * 
	 * @param addressType The address type, can be invoice or delivery
	 * @param postalCode  The postal code
	 * @return True or false
	 */
	public boolean postalCodeInAddress(String addressType, String postalCode) {
		By postalCodeTextInAddress = VerificationAndOrderPlacementMap.postalCodeInAddress(addressType, postalCode);
		return elementExists(postalCodeTextInAddress, true);
	}

	/**
	 * Validates if a section has a specific value. For instance, sectionName =
	 * "Shipping type" and value = "Standard Delivery".
	 * 
	 * @param sectionName The name of the section can be Shipping type or Payment
	 *                    type
	 * @param value       The value is the option previously selected
	 * 
	 * 
	 * @return True or false
	 */
	public boolean doesSectionHaveTheValue(String sectionName, String value) {
		By sectionAndValueElement = VerificationAndOrderPlacementMap.sectionAndValue(sectionName, value);
		return elementExists(sectionAndValueElement, true);
	}

	/**
	 * Validate if the product is listed on the verification and order placement
	 * page
	 * 
	 * @param productName Name of the product
	 * 
	 * @return true or false
	 */
	public boolean isProductListed(String productName) {
		By productNameText = VerificationAndOrderPlacementMap.elementByTypeAndText("span", productName);
		return elementExists(productNameText, true);
	}
}

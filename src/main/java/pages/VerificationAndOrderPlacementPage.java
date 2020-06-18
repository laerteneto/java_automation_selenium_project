package pages;

import org.openqa.selenium.By;

import maps.VerificationAndOrderPlacementMap;

public class VerificationAndOrderPlacementPage extends BasePage {

	/**
	 * Validates if a postal code is in the summary of an address
	 * 
	 * @param addressType can be invoice or delivery
	 * @param postalCode  is the postal code
	 * @return true or false
	 */
	public boolean postalCodeInAddress(String addressType, String postalCode) {
		By postalCodeTextInAddress = VerificationAndOrderPlacementMap.postalCodeInAddress(addressType, postalCode);
		return elementExists(postalCodeTextInAddress, true);
	}

	/**
	 * Validates if a section has a specific value
	 * 
	 * @param sectionName the name of the section can be Shipping type or Payment
	 *                    type
	 * @param value       the value is the option previously selected
	 * 
	 *                    For instance: sectionName = "Shipping type" and value =
	 *                    "Standard Delivery"
	 * 
	 * @return true or false
	 */
	public boolean doesSectionHaveTheValue(String sectionName, String value) {
		By sectionAndValueElement = VerificationAndOrderPlacementMap.sectionAndValue(sectionName, value);
		return elementExists(sectionAndValueElement, true);
	}

	/**
	 * Validate if the product is listed on the verification and order placement
	 * page
	 * 
	 * @param productName name of the product
	 * 
	 * @return true or false
	 */
	public boolean isProductListed(String productName) {
		By productNameText = VerificationAndOrderPlacementMap.spanByText(productName);
		return elementExists(productNameText, true);
	}
}

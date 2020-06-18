package pages;

import maps.AddressAndDeliveryMap;

public class AddressAndDeliveryPage extends BasePage {

	/**
	 * Proceed as guest with email information
	 * 
	 * @param email Guest email
	 */
	public void proceedAsGuestWithEmailInformation(String email) {
		waitForElementToBeVisible(AddressAndDeliveryMap.emailField, MAX_TIME);
		writeTextInField(AddressAndDeliveryMap.emailField, email);
		clickButtonByText("Place order as guest");
	}

	/**
	 * Fill out the form with a specific postal code, and the other values
	 * 
	 * @param postalCode The postal code
	 */
	public void fillOutTheFormWithSpecificPostalCode(String postalCode) {
		waitForElementToBeVisible(AddressAndDeliveryMap.firstNameField, MAX_TIME);
		writeTextInField(AddressAndDeliveryMap.firstNameField, "Laerte");
		
		clickElementJS(AddressAndDeliveryMap.salutationRadio);
		
		writeTextInField(AddressAndDeliveryMap.lastNameField, "Neto");
		
		writeTextInField(AddressAndDeliveryMap.streetField, "Main Street");
		
		writeTextInField(AddressAndDeliveryMap.numberField, "10");
		
		writeTextInField(AddressAndDeliveryMap.postalCodeField, postalCode);
		
		writeTextInField(AddressAndDeliveryMap.townField, "London");
	}
}

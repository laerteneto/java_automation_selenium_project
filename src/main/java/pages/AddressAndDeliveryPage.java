package pages;

import org.openqa.selenium.By;

public class AddressAndDeliveryPage extends BasePage {
	
	/**
	 * Proceed as guest with email information
	 * 
	 * @return true or false
	 */
	public void proceedAsGuestWithEmailInformation(String email) {
		By emailField = By.id("dcp-login-guest-user-email");
		waitForElementToBeVisible(emailField, MAX_TIME);
		writeTextInField(emailField, email);
		clickButtonByText("Place order as guest");
	}
	
	/**
	 * Fill out the form with a specific postal code, and the other values 
	 * 
	 * @return true or false
	 */
	public void fillOutTheFormWithSpecificPostalCode(String postalCode) {
		By firstNameField = By.id("co_payment_address-firstName");
		waitForElementToBeVisible(firstNameField, MAX_TIME);
		writeTextInField(firstNameField, "Laerte");
		
		By salutationRadio = By.id("co_payment_address-salutationCode-radio-id-0");
		clickJS(salutationRadio);
		
		By lastNameField = By.id("co_payment_address-lastName");
		writeTextInField(lastNameField, "Neto");
		
		By streetField = By.id("co_payment_address-line1");
		writeTextInField(streetField, "Main Street");
		
		By numberField = By.id("co_payment_address-line2");
		writeTextInField(numberField, "10");
		
		By postalCodeField = By.id("co_payment_address-postalCode");
		writeTextInField(postalCodeField, postalCode);
		
		By townField = By.id("co_payment_address-town");
		writeTextInField(townField, "London");
	}
}

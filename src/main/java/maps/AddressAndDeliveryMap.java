package maps;

import org.openqa.selenium.By;

public class AddressAndDeliveryMap extends BaseMap {

	public static By emailField = By.id("dcp-login-guest-user-email");
	
	public static By firstNameField = By.id("co_payment_address-firstName");
	
	public static By salutationRadio = By.id("co_payment_address-salutationCode-radio-id-0");
	
	public static By lastNameField = By.id("co_payment_address-lastName");
	
	public static By streetField = By.id("co_payment_address-line1");
	
	public static By numberField = By.id("co_payment_address-line2");
	
	public static By postalCodeField = By.id("co_payment_address-postalCode");
	
	public static By townField = By.id("co_payment_address-town");
}

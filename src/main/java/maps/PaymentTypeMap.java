package maps;

import org.openqa.selenium.By;

public class PaymentTypeMap extends BaseMap {
	
	public static By creditCardRadioButton = By.id("dcp-co-payment-modes_options-CREDITCARD");
	
	public static By payPalRadioButton = By.id("dcp-co-payment-modes_options-paypal");
	
	public static By visaRadioButton = By.id("visa");
	
	public static By mastercardRadioButton = By.id("mastercard");
	
	public static By amexRadioButton = By.id("amex");
}

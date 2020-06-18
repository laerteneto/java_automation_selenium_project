package pages;

import static maps.BaseMap.elementByTypeAndText;

import org.openqa.selenium.By;

import maps.PaymentTypeMap;

public class PaymentTypePage extends BasePage {

	/**
	 * Select the payment option
	 * 
	 * @param paymentType Can be Credit Card or PayPal
	 */
	public void selectThePaymentType(String paymentType) {
		waitForElementToBeVisible(elementByTypeAndText("h3", "Your payment type"), MAX_TIME);
		
		By paymentOption;
		if (paymentType.contentEquals("Credit Card")) {
			paymentOption = PaymentTypeMap.creditCardRadioButton;
		} else { // paymentType == PayPal
			paymentOption = PaymentTypeMap.payPalRadioButton;
		}
		clickElementJS(paymentOption);
	}

	/**
	 * Select the credit card brand
	 * 
	 * @param cardBrand can be VISA, MasterCard or American Express
	 */
	public void selectTheCardBrand(String cardBrand) {
		By cardBrandOption;
		if (cardBrand.contentEquals("VISA")) {
			cardBrandOption = PaymentTypeMap.visaRadioButton;
		} else if (cardBrand.contentEquals("MasterCard")) {
			cardBrandOption = PaymentTypeMap.mastercardRadioButton;
		} else { // cardBrand == American Express
			cardBrandOption = PaymentTypeMap.amexRadioButton;
		}
		waitForElementToBeVisible(elementByTypeAndText("label", cardBrand), MAX_TIME);
		clickElementJS(cardBrandOption);
	}
}

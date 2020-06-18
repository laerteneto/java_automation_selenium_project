package pages;

import org.openqa.selenium.By;

import maps.BaseMap;

public class PaymentTypePage extends BasePage {

	/**
	 * Select the payment type
	 * 
	 * @param paymentType can be Credit Card or PayPal
	 */
	public void selectThePaymentType(String paymentType) {
		waitForElementToBeVisible(BaseMap.h3ByText("Your payment type"), MAX_TIME);
		By paymentOption;
		if (paymentType.contentEquals("Credit Card")) {
			paymentOption = By.id("dcp-co-payment-modes_options-CREDITCARD");
		} else { // paymentType == PayPal
			paymentOption = By.id("dcp-co-payment-modes_options-paypal");
		}
		clickJS(paymentOption);
	}

	/**
	 * Select the credit card brand
	 * 
	 * @param cardBrand can be VISA, MasterCard or American Express
	 */
	public void selectTheCardBrand(String cardBrand) {
		By cardBrandOption;
		if (cardBrand.contentEquals("VISA")) {
			cardBrandOption = By.id("visa");
		} else if (cardBrand.contentEquals("MasterCard")) {
			cardBrandOption = By.id("mastercard");
		} else { // cardBrand == American Express
			cardBrandOption = By.id("amex");
		}
		waitForElementToBeVisible(BaseMap.labelByText(cardBrand), MAX_TIME);
		clickJS(cardBrandOption);
	}
}

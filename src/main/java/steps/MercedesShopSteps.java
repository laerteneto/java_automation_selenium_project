package steps;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddressAndDeliveryPage;
import pages.BasePage;
import pages.HomePage;
import pages.PaymentTypePage;
import pages.ProductPage;
import pages.ProductSearchPage;
import pages.ShoppingBasketPage;
import pages.VerificationAndOrderPlacementPage;

public class MercedesShopSteps {

	BasePage basePage;
	HomePage homePage;
	ProductSearchPage productSearchPage;
	ProductPage productPage;
	ShoppingBasketPage shoppingBasketPage;
	AddressAndDeliveryPage addressAndDeliveryPage;
	PaymentTypePage paymentTypePage;
	VerificationAndOrderPlacementPage verificationAndOrderPlacementPage;

	@Before
	public void setup() {
		getDriver();
		homePage = new HomePage();
		productSearchPage = new ProductSearchPage();
		productPage = new ProductPage();
		shoppingBasketPage = new ShoppingBasketPage();
		addressAndDeliveryPage = new AddressAndDeliveryPage();
		basePage = new BasePage();
		paymentTypePage = new PaymentTypePage();
		verificationAndOrderPlacementPage = new VerificationAndOrderPlacementPage();
	}

	@After
	public void tearDown() {
		killDriver();
	}

	@Given("^I access the Mercedes Benz online shop$")
	public void i_access_the_Mercedes_Benz_online_shop() throws Throwable {
		homePage.accessHomePage();
		homePage.agreeWithCookies();
	}

	@When("^I look for Mercedes \"([^\"]*)\" Fashion & Beauty$")
	public void i_look_for_Mercedes_Fashion_Beauty(String productType) throws Throwable {
		homePage.openProductsList(productType);
	}

	@When("^I choose the \"([^\"]*)\" product$")
	public void i_choose_the_product(String productName) throws Throwable {
		productSearchPage.clickOnAProductByName(productName);
	}

	@When("^I add the product to the shopping basket$")
	public void i_add_the_product_to_the_shopping_basket() throws Throwable {
		productPage.addProductToBasket();
	}

	@Then("^The product \"([^\"]*)\" is saved on the shopping basket$")
	public void the_product_is_saved_on_the_shopping_basket(String productName) throws Throwable {
		Assert.assertTrue(productPage.isProductSavedMessageDisplayed());
		Assert.assertTrue(productPage.isProductSavedOnTheShoppingBasket(productName));
	}

	@When("^I go to the shopping basket$")
	public void i_go_to_the_shopping_basket() throws Throwable {
		productPage.goToShoppingBasket();
	}

	@Then("^The product \"([^\"]*)\" is on the shopping basket$")
	public void the_product_is_on_the_shopping_basket(String productName) throws Throwable {
		Assert.assertTrue(shoppingBasketPage.isProductOnTheShoppingBasket(productName));
	}

	@When("^I proceed to \"([^\"]*)\"$")
	public void i_proceed_to(String text) throws Throwable {
		basePage.clickButtonByText("Continue to " + text);
	}

	@When("^I proceed to place order as a guest with email \"([^\"]*)\"$")
	public void i_proceed_to_place_order_as_a_guest_with_email(String email) throws Throwable {
		addressAndDeliveryPage.proceedAsGuestWithEmailInformation(email);
	}

	@When("^I set the Postal Code as \"([^\"]*)\" and fill out the form$")
	public void i_set_the_Postal_Code_as_and_fill_out_the_form(String postalCode) throws Throwable {
		addressAndDeliveryPage.fillOutTheFormWithSpecificPostalCode(postalCode);
	}

	@When("^I select \"([^\"]*)\" as payment method$")
	public void i_select_as_payment_method(String paymentType) throws Throwable {
		paymentTypePage.selectThePaymentType(paymentType);
	}

	@When("^I select \"([^\"]*)\" as card brand$")
	public void i_select_as_card_brand(String cardBrand) throws Throwable {
		paymentTypePage.selectTheCardBrand(cardBrand);
	}

	@Then("^On the verification order and placement, the Postal Code \"([^\"]*)\" is in the \"([^\"]*)\"$")
	public void on_the_verification_order_and_placement_The_Postal_Code_is_in_the(String postalCode, String addressType)
			throws Throwable {
		Assert.assertTrue(verificationAndOrderPlacementPage.postalCodeInAddress(addressType, postalCode));
	}

	@Then("^On the verification order and placement, the \"([^\"]*)\" is \"([^\"]*)\"$")
	public void on_the_verification_order_and_placement_the_is(String sectionName, String value) throws Throwable {
		Assert.assertTrue(verificationAndOrderPlacementPage.doesSectionHaveTheValue(sectionName, value));
	}

	@Then("^On the verification order and placement, the shopping basket contains the product \"([^\"]*)\"$")
	public void on_the_verification_order_and_placement_the_shopping_basket_contains_the_product(String productName)
			throws Throwable {
		Assert.assertTrue(verificationAndOrderPlacementPage.isProductListed(productName));
	}

}

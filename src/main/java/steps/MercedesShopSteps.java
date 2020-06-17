package steps;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class MercedesShopSteps {

	HomePage homePage;

	@Before
	public void setup() {
		getDriver();
		homePage = new HomePage();
	}

	@After
	public void tearDown() {
		killDriver();
	}

	@Given("^I access the Mercedes Benz online shop$")
	public void i_access_the_Mercedes_Benz_online_shop() throws Throwable {
		homePage.accessHomePage();
	}
	
	@When("^I look for Mercedes \"([^\"]*)\" Fashion & Beauty$")
	public void i_look_for_Mercedes_Fashion_Beauty(String arg1) throws Throwable {
	    homePage.openProductsList(arg1);
	}

	@When("^I choose the \"([^\"]*)\" product$")
	public void i_choose_the_product(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I add the product to the shopping basket$")
	public void i_add_the_product_to_the_shopping_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^The product \"([^\"]*)\" is saved on the shopping basket$")
	public void the_product_is_saved_on_the_shopping_basket(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I go to the shopping basket$")
	public void i_go_to_the_shopping_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I proceed to \"([^\"]*)\"$")
	public void i_proceed_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I set the Postal Code as \"([^\"]*)\" and fill out the form$")
	public void i_set_the_Postal_Code_as_and_fill_out_the_form(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I select \"([^\"]*)\" as payment method$")
	public void i_select_as_payment_method(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I select \"([^\"]*)\" as card brand$")
	public void i_select_as_card_brand(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^On the verification order and placement, the Postal Code \"([^\"]*)\" is in the \"([^\"]*)\"$")
	public void on_the_verification_order_and_placement_the_Postal_Code_is_in_the(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^On the verification order and placement, the \"([^\"]*)\" is \"([^\"]*)\"$")
	public void on_the_verification_order_and_placement_the_is(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^On the verification order and placement, the shopping basket contains the product \"([^\"]*)\"$")
	public void on_the_verification_order_and_placement_the_shopping_basket_contains_the_product(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}

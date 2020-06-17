package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Data;

public class BasePage implements Data{
	
	public BasePage() {
		super();
	}

	/**
	 * Access the given url
	 * 
	 * @param link url to be accessed
	 */
	public void accessUrl(String link) {
		getDriver().get(link);
	}

	/**
	 * Write a text in a field
	 * 
	 * @param locator Field locator where the text will by typed
	 * @param texto   Text bo be typed
	 */
	public void writeTextInField(By locator, String texto) {
		getDriver().findElement(locator).sendKeys(texto);
	}

	/**
	 * Validates if a text is displayed in the screen
	 * 
	 * @param locator Element locator you want to verify
	 */
	public boolean validatesTextDisplayed(By locator) {
		return ((getDriver().findElements(locator).size() > 0) && (getDriver().findElement(locator).isDisplayed()));
	}

	/**
	 * Validates if a text is NOT displayed in the screen
	 * 
	 * @param locator Element locator you want to verify
	 */
	public boolean validatesTextNotDisplayed(By locator) {
		return (getDriver().findElements(locator).size() == 0);
	}

	/**
	 * Click in a element
	 * 
	 * @param locator Element locator
	 */
	public void clickElement(By locator) {
		WebElement element = getDriver().findElement(locator);
		element.click();
	}

	/**
	 * Click in a button using a JS function
	 * 
	 * @param locator Element locator
	 */
	public void clickButtonJS(By locator) {
		try {
			WebElement element = getDriver().findElement(locator);

			System.out.println("Waiting until the button is able to be clicked");
			WebDriverWait wait = new WebDriverWait(getDriver(), 30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			System.out.println("Click is done!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Forced wait
	 * 
	 * @param tempo Time is seconds
	 */
	public void esperaForcada(int tempo) {
		try {
			Thread.sleep(tempo * 1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
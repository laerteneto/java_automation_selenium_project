package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Data;
import maps.BaseMap;

public class BasePage implements Data {

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
	 * Click on a element
	 * 
	 * @param locator Element locator
	 */
	public void clickElement(By locator) {
		WebElement element = getDriver().findElement(locator);
		element.click();
	}

	/**
	 * Click on a button using a JS function
	 * 
	 * @param locator Element locator
	 */
	public void clickJS(By locator) {
		WebElement elemento = getDriver().findElement(locator);
		JavascriptExecutor ex = (JavascriptExecutor) getDriver();
		ex.executeScript("arguments[0].click()", elemento);
	}

	/**
	 * Forced wait
	 * 
	 * @param time Time is seconds
	 */
	public void forcedWait(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Wait for an element to be clickable
	 * 
	 * @param locator element locator
	 * @param time max time
	 */
	public void waitForElementToBeClickable(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Wait for an element to be visible
	 * 
	 * @param locator element locator
	 * @param time max time
	 */
	public void waitForElementToBeVisible(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * Validate if an element exists and is displayed, or if it does not exist
	 * 
	 * @param locator     element locator
	 * @param shouldExist true or false
	 * 
	 * @return true or false
	 */
	public boolean elementExists(By locator, boolean shouldExist) {
		if (shouldExist) {
			waitForElementToBeVisible(locator, MAX_TIME);
			return getDriver().findElements(locator).size() > 0 && getDriver().findElement(locator).isDisplayed();
		} else {
			waitForElementToBeVisible(locator, MIN_TIME);
			return getDriver().findElements(locator).size() == 0;
		}
	}
	
	/**
	 * Click on a button by text
	 * 
	 * @param text Text on the button
	 */
	public void clickButtonByText(String text) {
		By button = BaseMap.buttonByText(text);
		waitForElementToBeClickable(button, MAX_TIME);
		clickJS(button);
	}

}
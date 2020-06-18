package maps;

import org.openqa.selenium.By;

public class VerificationAndOrderPlacementMap extends BaseMap {

	public static By postalCodeInAddress(String addressType, String postalCode) {
		return By
				.xpath("//h3[text()='" + addressType + "']/parent::div//div[contains(text()[4],'" + postalCode + "')]");
	}

	public static By sectionAndValue(String sectionName, String value) {
		return By.xpath("//h3[text()='" + sectionName + "']//parent::div//*[text()='" + value + "']");
	}
}

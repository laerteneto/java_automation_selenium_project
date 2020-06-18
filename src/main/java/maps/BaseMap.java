package maps;

import org.openqa.selenium.By;

public class BaseMap {

	public static By buttonByText(String buttonName) {
		return By.xpath("//button[text()='" + buttonName + "']");
	}

	public static By h2ByText(String text) {
		return By.xpath("//h2[text()='" + text + "']");
	}

	public static By spanByText(String text) {
		return By.xpath("//span[text()='" + text + "']");
	}

	public static By h3ByText(String text) {
		return By.xpath("//h3[text()='" + text + "']");
	}

	public static By labelByText(String text) {
		return By.xpath("//label[text()='" + text + "']");
	}
}

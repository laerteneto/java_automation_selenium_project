package maps;

public class BaseMap {

	public static String inputField(String labelName) {
		return "//label[contains(text(), '" + labelName + "')]/following-sibling::div//input";
	}

	public static String textAreaField(String labelName) {
		return "//label[contains(text(), '" + labelName + "')]/following-sibling::div//textarea";
	}

	public static String buttonByText(String buttonName) {
		return "//button[contains(text(), '" + buttonName + "')]";
	}

	public static String successMessage() {
		return "//h1[contains(text(), 'mesageeeeeee')]";
	}

	public static String messageMandatoryField(String FieldLabel) {
		return "//div[@class='form-feedback-item help-block']/..//label[contains(text(),'" + FieldLabel + "')]";
	}

}

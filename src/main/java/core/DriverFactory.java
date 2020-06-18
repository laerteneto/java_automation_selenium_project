package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null)
			createDriver();

		return driver;
	}

	private static void createDriver() {
		// Choose driver
		switch (Configurations.browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/main/resources/driver/geckodriver");
			driver = new FirefoxDriver();
			break;
		}
		
		// Implicity wait for general driver control
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// WebDriver setup
		driver.manage().window().maximize();

	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}

package APK_Config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestConfig {
	

	public static String USERNAME="psisodia@axiphyl.com";
	public static String PASSWORD="Shaktiman@123";

	
	// Test URL
	private static final String BASE_URL = "https://testserver.medongo.com:8443/admin/control/cclogin";

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	private static Wait<WebDriver> createFluentWait(WebDriver driver) {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
	}

	// selecting
	public static void performCommonActions(WebDriver driver) {
		// Wait for the error message to be displayed
		Wait<WebDriver> wait = createFluentWait(driver);

		// select radio
		// button.........................................................................
		WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("#measurementsList > div:nth-child(5) > div > div.col-sm-4 > div > label")));
		radioButton.click();

		// Click on the "Continue" button
		WebElement continueButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("body > aside > div > div > div.card-body > div > a")));
		continueButton.click();

		WebElement hamburgerElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav\"]/div/label")));
		hamburgerElement.click();
	}

	

	public static String getBaseUrl() {
		return BASE_URL;
	}

}

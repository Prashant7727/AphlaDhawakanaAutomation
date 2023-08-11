package ManageMasterData;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ConsentInformation {

	@Test
	public void ConsentInformation () {
		WebDriver driver = TestConfig.getDriver();
		driver.get(TestConfig.getBaseUrl());
		driver.manage().window().maximize();

		driver.navigate().refresh();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

//        // Wait for the error message to be displayed
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		String username = TestConfig.USERNAME;
		String password = TestConfig.PASSWORD;
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		// Click on the submit button
		driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.btn-block.submitbtn")).click();
		//
		TestConfig.performCommonActions(driver);
				try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();

		WebElement ConsentInformation = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageConsentInformation")));
		ConsentInformation.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		WebElement ConsentMsg = wait.until(ExpectedConditions.elementToBeClickable(By.id("consentMsg")));
		ConsentMsg.sendKeys("Consent Message 365");

		driver.findElement(By.xpath("//*[@id=\"consentType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"consentType\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/input")).click();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("10021");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/a")).click();

		WebElement EditConsentMsg = wait.until(ExpectedConditions.elementToBeClickable(By.id("consentMsgU")));
		EditConsentMsg.clear();
		EditConsentMsg.sendKeys("Consent Message.......");

		driver.findElement(By.xpath("//*[@id=\"consentTypeU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"consentTypeU\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"statusU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusU\"]/option[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateService\"]/div[2]/div[1]/button")).click();

		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		WebElement patientConsentMsg = wait.until(ExpectedConditions.elementToBeClickable(By.id("consentMsg")));
		patientConsentMsg.sendKeys("Consent Message 365");

		driver.findElement(By.xpath("//*[@id=\"consentType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"consentType\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/input")).click();

		WebElement patientsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		patientsearch.sendKeys("10021");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/a")).click();

		WebElement patientEditConsentMsg = wait.until(ExpectedConditions.elementToBeClickable(By.id("consentMsgU")));
		patientEditConsentMsg.clear();
		patientEditConsentMsg.sendKeys("Consent Message.......");

		driver.findElement(By.xpath("//*[@id=\"consentTypeU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"consentTypeU\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"statusU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusU\"]/option[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateService\"]/div[2]/div[1]/button")).click();

		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		WebElement bothConsentMsg = wait.until(ExpectedConditions.elementToBeClickable(By.id("consentMsg")));
		bothConsentMsg.sendKeys("Consent Message 365");

		driver.findElement(By.xpath("//*[@id=\"consentType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"consentType\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/input")).click();

		WebElement bothsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		bothsearch.sendKeys("10021");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/a")).click();

		WebElement bothEditConsentMsg = wait.until(ExpectedConditions.elementToBeClickable(By.id("consentMsgU")));
		bothEditConsentMsg.clear();
		bothEditConsentMsg.sendKeys("Consent Message.......");

		driver.findElement(By.xpath("//*[@id=\"consentTypeU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"consentTypeU\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"statusU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusU\"]/option[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateService\"]/div[2]/div[1]/button")).click();
		driver.quit();
	}

}

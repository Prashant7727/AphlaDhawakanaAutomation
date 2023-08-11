package data;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ainaReport {

	@Test
	public  void ainaReport() {
		WebDriver driver = TestConfig.getDriver();
		driver.get(TestConfig.getBaseUrl());
		driver.navigate().refresh();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		String username = TestConfig.USERNAME;
		String password = TestConfig.PASSWORD;
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		// Click on the submit button
		driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.btn-block.submitbtn")).click();
		// Check if login is successful.................................................
		WebElement successMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("doctorfrom")));
		String expectedSuccessMessage = "Expected success message here";
		String actualSuccessMessage = successMessage.getText();
		if (actualSuccessMessage.contains(expectedSuccessMessage)) {
			System.out.println("Login successful: " + actualSuccessMessage);
		} else {
			System.out.println("Login unsuccessful. Invalid username or password.");
		}

		TestConfig.performCommonActions(driver);
		
		WebElement viewAinaReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("viewAinaReport")));
		viewAinaReport.click();
		

		// ************************select radio button Aam Aadmi Mohalla
		// Clinic****************************

		// insert date range
		WebElement startDateInput1 = driver.findElement(By.id("startDate"));
		WebElement endDateInput1 = driver.findElement(By.id("endDate"));
		startDateInput1.clear();
		endDateInput1.clear();
		startDateInput1.sendKeys("02/05/2023");
		endDateInput1.sendKeys("02/07/2023");

		// add mohalla clinic
		WebElement addClinic = driver.findElement(By.id("instId"));
		addClinic.click();
		addClinic.sendKeys("NewDel");

		// select check box in Generate
		WebElement PregnantReport = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#addSheet > div:nth-child(1) > input[type=checkbox]")));
		PregnantReport.click();
		WebElement ClinicWiseReport = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#addSheet > div:nth-child(3) > input[type=checkbox]")));
		ClinicWiseReport.click();

		// select check box in Include Failed Consults
		WebElement includeFailedConsults = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("div.col-sm-6.col-xs-6 input[type='checkbox'][name='consultStatus']")));
		includeFailedConsults.click();

		// excel button click
		WebElement excelBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#vitalSelect > div > div:nth-child(2) > div:nth-child(4) > label:nth-child(2) > input.btn.btn-primary.submitbtn")));
		excelBtn.click();
		
		//...........patient.................................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		
		WebElement patientstartDateInput1 = driver.findElement(By.id("startDate"));
		WebElement patientendDateInput1 = driver.findElement(By.id("endDate"));
		patientstartDateInput1.clear();
		patientendDateInput1.clear();
		patientstartDateInput1.sendKeys("02/05/2023");
		patientendDateInput1.sendKeys("02/07/2023");

		// add mohalla clinic
		WebElement patientaddClinic = driver.findElement(By.id("instId"));
		patientaddClinic.click();
		patientaddClinic.sendKeys("NewDel");

		// select check box in Generate
		WebElement patientPregnantReport = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#addSheet > div:nth-child(1) > input[type=checkbox]")));
		patientPregnantReport.click();
		WebElement patientClinicWiseReport = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#addSheet > div:nth-child(3) > input[type=checkbox]")));
		patientClinicWiseReport.click();

		// select check box in Include Failed Consults
		WebElement patientincludeFailedConsults = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("div.col-sm-6.col-xs-6 input[type='checkbox'][name='consultStatus']")));
		patientincludeFailedConsults.click();

		// excel button click
		WebElement patientexcelBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#vitalSelect > div > div:nth-child(2) > div:nth-child(4) > label:nth-child(2) > input.btn.btn-primary.submitbtn")));
		patientexcelBtn.click();
		
		//................both...............................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		
		
		WebElement bothstartDateInput1 = driver.findElement(By.id("startDate"));
		WebElement bothendDateInput1 = driver.findElement(By.id("endDate"));
		bothstartDateInput1.clear();
		bothendDateInput1.clear();
		bothstartDateInput1.sendKeys("02/05/2023");
		bothendDateInput1.sendKeys("02/07/2023");

		// add mohalla clinic
		WebElement bothaddClinic = driver.findElement(By.id("instId"));
		bothaddClinic.click();
		bothaddClinic.sendKeys("NewDel");

		// select check box in Generate
		WebElement bothPregnantReport = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#addSheet > div:nth-child(1) > input[type=checkbox]")));
		bothPregnantReport.click();
		WebElement bothClinicWiseReport = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#addSheet > div:nth-child(3) > input[type=checkbox]")));
		bothClinicWiseReport.click();

		// select check box in Include Failed Consults
		WebElement bothincludeFailedConsults = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("div.col-sm-6.col-xs-6 input[type='checkbox'][name='consultStatus']")));
		bothincludeFailedConsults.click();

		// excel button click
		WebElement bothexcelBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#vitalSelect > div > div:nth-child(2) > div:nth-child(4) > label:nth-child(2) > input.btn.btn-primary.submitbtn")));
		bothexcelBtn.click();
		
		driver.quit();

	}
}
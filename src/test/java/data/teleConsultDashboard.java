
package data;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class teleConsultDashboard {

	@Test
	public  void teleConsultDashboard() {
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
		
		// ***********************Teleconsult Dashboard********************************

		// OPD data...............................................
		WebElement settingsIcon = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
		settingsIcon.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement startDateInput = driver.findElement(By.id("fromDateDiseasesCls"));
		WebElement endDateInput = driver.findElement(By.id("toDateDiseasesCls"));
		startDateInput.clear();
		endDateInput.clear();
		startDateInput.sendKeys("2023-06-01");
		endDateInput.sendKeys("2023-07-01");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement radioButton1 = driver.findElement(By.id("choseselectedphccenterforPatDiseases"));
		radioButton1.click();

		WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075")));
		checkbox.click();

		WebElement submitButton = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]"));
		submitButton.click();

		// configuration submit button click
		WebElement submitButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButton1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// select date range for all
		// data...........................................................
		// Click on the settings icon
		WebElement settingsIcon1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
		settingsIcon1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement startDateInput1 = driver.findElement(By.id("fromDateDiseasesCls"));
		WebElement endDateInput1 = driver.findElement(By.id("toDateDiseasesCls"));
		// Clear the input fields
		startDateInput1.clear();
		endDateInput1.clear();
		// Fill in the start and end dates
		startDateInput1.sendKeys("2023-01-01");
		endDateInput1.sendKeys("2023-07-01");
		WebElement radioButton11 = driver.findElement(By.xpath("//*[@id='chooseAllPhcCenterforPatDiseases']"));
		radioButton11.click();

		// configuration submit button click
		WebElement submitButton11 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButton11.click();

		// AV Failed.............................................
		WebElement settingsIcon11 = driver.findElement(By.xpath("//*[@id='settingimageforDiseasesCls']"));
		settingsIcon11.click();

		// select date range of specific data
		WebElement startDateInput11 = driver.findElement(By.id("fromDateDiseasesCls"));
		WebElement endDateInput11 = driver.findElement(By.id("toDateDiseasesCls"));
		// Clear the input fields
		startDateInput11.clear();
		endDateInput11.clear();
		// Fill in the start and end dates
		startDateInput11.sendKeys("2023-01-01");
		endDateInput11.sendKeys("2023-07-01");

		// Find the radio button element
		WebElement radioButton111 = driver.findElement(By.id("choseselectedphccenterforPatDiseases"));
		radioButton111.click();

		// select check box
		WebElement checkbox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075")));
		checkbox1.click();

		// pagination submit button
		WebElement submitButton111 = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]"));
		submitButton111.click();

		// configuration submit button click
		WebElement submitButton1111 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButton1111.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// select date range for all data
		// Click on the settings icon
		WebElement settingsIcon111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
		settingsIcon111.click();

		WebElement startDateInput111 = driver.findElement(By.id("fromDateDiseasesCls"));
		WebElement endDateInput111 = driver.findElement(By.id("toDateDiseasesCls"));
		// Clear the input fields
		startDateInput111.clear();
		endDateInput111.clear();
		// Fill in the start and end dates
		startDateInput111.sendKeys("2023-01-01");
		endDateInput111.sendKeys("2023-07-07");
		WebElement radioButton1111 = driver.findElement(By.xpath("//*[@id='chooseAllPhcCenterforPatDiseases']"));
		radioButton1111.click();

		// configuration submit button click
		WebElement submitButton11111 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButton11111.click();

		// Device
		// Chart...................................................................

		// select date range for all data
		// Click on the settings icon
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"settingimageforDevice\"]")).click();

		WebElement startDateInput11111 = driver.findElement(By.id("fromDateDiseasesCls"));
		WebElement endDateInput11111 = driver.findElement(By.id("toDateDiseasesCls"));
		// Clear the input fields
		startDateInput11111.clear();
		endDateInput11111.clear();
		// Fill in the start and end dates
		startDateInput11111.sendKeys("2023-05-01");
		endDateInput11111.sendKeys("2023-07-01");
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenterforPatDiseases\"]")).click();

		// configuration submit button click
		WebElement sbtDeviceChart = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span"));
		sbtDeviceChart.click();

		// for particular clinic
		driver.findElement(By.xpath("//*[@id=\"settingimageforDevice\"]")).click();
		// select date range of specific data
		WebElement startDateInput1111 = driver.findElement(By.id("fromDateDiseasesCls"));
		WebElement endDateInput1111 = driver.findElement(By.id("toDateDiseasesCls"));
		// Clear the input fields
		startDateInput1111.clear();
		endDateInput1111.clear();
		// Fill in the start and end dates
		startDateInput1111.sendKeys("2023-01-01");
		endDateInput1111.sendKeys("2023-07-01");

		// Find the radio button element
		driver.findElement(By.id("choseselectedphccenterforPatDiseases")).click();

		// select check box
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075"))).click();

		// pagination submit button
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]")).click();

		// configuration submit button click
		WebElement sbtDeviceChart1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span"));
		sbtDeviceChart1.click();
		
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//...........patient.................................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// OPD data...............................................
				WebElement patientsettingsIcon = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
				patientsettingsIcon.click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebElement patientstartDateInput = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement patientendDateInput = driver.findElement(By.id("toDateDiseasesCls"));
				patientstartDateInput.clear();
				patientendDateInput.clear();
				patientstartDateInput.sendKeys("2023-06-01");
				patientendDateInput.sendKeys("2023-07-01");

				WebElement patientradioButton1 = driver.findElement(By.id("choseselectedphccenterforPatDiseases"));
				patientradioButton1.click();

				WebElement patientcheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075")));
				patientcheckbox.click();

				WebElement patientsubmitButton = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]"));
				patientsubmitButton.click();

				// configuration submit button click
				WebElement patientsubmitButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButton1.click();

				// select date range for all
				// data...........................................................
				// Click on the settings icon
				WebElement patientsettingsIcon1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
				patientsettingsIcon1.click();

				WebElement patientstartDateInput1 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement patientendDateInput1 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				patientstartDateInput1.clear();
				patientendDateInput1.clear();
				// Fill in the start and end dates
				patientstartDateInput1.sendKeys("2023-01-01");
				patientendDateInput1.sendKeys("2023-07-01");
				WebElement patientradioButton11 = driver.findElement(By.xpath("//*[@id='chooseAllPhcCenterforPatDiseases']"));
				patientradioButton11.click();

				// configuration submit button click
				WebElement patientsubmitButton11 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButton11.click();

				// AV Failed.............................................
				WebElement patientsettingsIcon11 = driver.findElement(By.xpath("//*[@id='settingimageforDiseasesCls']"));
				patientsettingsIcon11.click();

				// select date range of specific data
				WebElement patientstartDateInput11 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement patientendDateInput11 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				patientstartDateInput11.clear();
				patientendDateInput11.clear();
				// Fill in the start and end dates
				patientstartDateInput11.sendKeys("2023-01-01");
				patientendDateInput11.sendKeys("2023-07-01");

				// Find the radio button element
				WebElement patientradioButton111 = driver.findElement(By.id("choseselectedphccenterforPatDiseases"));
				patientradioButton111.click();

				// select check box
				WebElement patientcheckbox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075")));
				patientcheckbox1.click();

				// pagination submit button
				WebElement patientsubmitButton111 = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]"));
				patientsubmitButton111.click();

				// configuration submit button click
				WebElement patientsubmitButton1111 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButton1111.click();

				// select date range for all data
				// Click on the settings icon
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WebElement patientsettingsIcon111 = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
				patientsettingsIcon111.click();

				WebElement patientstartDateInput111 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement patientendDateInput111 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				patientstartDateInput111.clear();
				patientendDateInput111.clear();
				// Fill in the start and end dates
				patientstartDateInput111.sendKeys("2023-01-01");
				patientendDateInput111.sendKeys("2023-07-07");
				WebElement patientradioButton1111 = driver.findElement(By.xpath("//*[@id='chooseAllPhcCenterforPatDiseases']"));
				patientradioButton1111.click();

				// configuration submit button click
				WebElement patientsubmitButton11111 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButton11111.click();

				// Device
				// Chart...................................................................

				// select date range for all data
				// Click on the settings icon
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"settingimageforDevice\"]")).click();

				WebElement patientstartDateInput11111 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement patientendDateInput11111 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				patientstartDateInput11111.clear();
				patientendDateInput11111.clear();
				// Fill in the start and end dates
				patientstartDateInput11111.sendKeys("2023-05-01");
				patientendDateInput11111.sendKeys("2023-07-01");
				driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenterforPatDiseases\"]")).click();

				// configuration submit button click
				WebElement patientsbtDeviceChart = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span"));
				patientsbtDeviceChart.click();

				// for particular clinic
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"settingimageforDevice\"]")).click();
				// select date range of specific data
				WebElement patientstartDateInput1111 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement patientendDateInput1111 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				patientstartDateInput1111.clear();
				patientendDateInput1111.clear();
				// Fill in the start and end dates
				patientstartDateInput1111.sendKeys("2023-01-01");
				patientendDateInput1111.sendKeys("2023-07-01");

				// Find the radio button element
				driver.findElement(By.id("choseselectedphccenterforPatDiseases")).click();

				// select check box
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075"))).click();

				// pagination submit button
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]")).click();

				// configuration submit button click
				WebElement patientsbtDeviceChart1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span"));
				patientsbtDeviceChart1.click();
		
		//................both...............................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		
		
		// OPD data...............................................
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				WebElement bothsettingsIcon = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
				bothsettingsIcon.click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebElement bothstartDateInput = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement bothendDateInput = driver.findElement(By.id("toDateDiseasesCls"));
				bothstartDateInput.clear();
				bothendDateInput.clear();
				bothstartDateInput.sendKeys("2023-06-01");
				bothendDateInput.sendKeys("2023-07-01");

				WebElement bothradioButton1 = driver.findElement(By.id("choseselectedphccenterforPatDiseases"));
				bothradioButton1.click();

				WebElement bothcheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075")));
				bothcheckbox.click();

				WebElement bothsubmitButton = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]"));
				bothsubmitButton.click();

				// configuration submit button click
				WebElement bothsubmitButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButton1.click();

				// select date range for all
				// data...........................................................
				// Click on the settings icon
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WebElement bothsettingsIcon1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
				bothsettingsIcon1.click();

				WebElement bothstartDateInput1 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement bothendDateInput1 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				bothstartDateInput1.clear();
				bothendDateInput1.clear();
				// Fill in the start and end dates
				bothstartDateInput1.sendKeys("2023-01-01");
				bothendDateInput1.sendKeys("2023-07-01");
				WebElement bothradioButton11 = driver.findElement(By.xpath("//*[@id='chooseAllPhcCenterforPatDiseases']"));
				bothradioButton11.click();

				// configuration submit button click
				WebElement bothsubmitButton11 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButton11.click();

				// AV Failed.............................................
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WebElement bothsettingsIcon11 = driver.findElement(By.xpath("//*[@id='settingimageforDiseasesCls']"));
				bothsettingsIcon11.click();

				// select date range of specific data
				WebElement bothstartDateInput11 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement bothendDateInput11 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				bothstartDateInput11.clear();
				bothendDateInput11.clear();
				// Fill in the start and end dates
				bothstartDateInput11.sendKeys("2023-01-01");
				bothendDateInput11.sendKeys("2023-07-01");

				// Find the radio button element
				WebElement bothradioButton111 = driver.findElement(By.id("choseselectedphccenterforPatDiseases"));
				bothradioButton111.click();

				// select check box
				WebElement bothcheckbox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075")));
				bothcheckbox1.click();

				// pagination submit button
				WebElement bothsubmitButton111 = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]"));
				bothsubmitButton111.click();

				// configuration submit button click
				WebElement bothsubmitButton1111 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButton1111.click();

				// select date range for all data
				
				// Click on the settings icon
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WebElement bothsettingsIcon111 = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img#settingimageforDiseasesCls")));
				bothsettingsIcon111.click();

				WebElement bothstartDateInput111 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement bothendDateInput111 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				bothstartDateInput111.clear();
				bothendDateInput111.clear();
				// Fill in the start and end dates
				bothstartDateInput111.sendKeys("2023-01-01");
				bothendDateInput111.sendKeys("2023-07-07");
				WebElement bothradioButton1111 = driver.findElement(By.xpath("//*[@id='chooseAllPhcCenterforPatDiseases']"));
				bothradioButton1111.click();

				// configuration submit button click
				WebElement bothsubmitButton11111 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButton11111.click();

				// Device
				// Chart...................................................................

				// select date range for all data
				// Click on the settings icon
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"settingimageforDevice\"]")).click();

				WebElement bothstartDateInput11111 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement bothendDateInput11111 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				bothstartDateInput11111.clear();
				bothendDateInput11111.clear();
				// Fill in the start and end dates
				bothstartDateInput11111.sendKeys("2023-05-01");
				bothendDateInput11111.sendKeys("2023-07-01");
				driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenterforPatDiseases\"]")).click();

				// configuration submit button click
				WebElement bothsbtDeviceChart = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span"));
				bothsbtDeviceChart.click();

				// for particular clinic
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//*[@id=\"settingimageforDevice\"]")).click();
				// select date range of specific data
				WebElement bothstartDateInput1111 = driver.findElement(By.id("fromDateDiseasesCls"));
				WebElement bothendDateInput1111 = driver.findElement(By.id("toDateDiseasesCls"));
				// Clear the input fields
				bothstartDateInput1111.clear();
				bothendDateInput1111.clear();
				// Fill in the start and end dates
				bothstartDateInput1111.sendKeys("2023-01-01");
				bothendDateInput1111.sendKeys("2023-07-01");

				// Find the radio button element
				driver.findElement(By.id("choseselectedphccenterforPatDiseases")).click();

				// select check box
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("K_00075"))).click();

				// pagination submit button
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]")).click();

				// configuration submit button click
				WebElement bothsbtDeviceChart1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]/span"));
				bothsbtDeviceChart1.click();
		
		driver.quit();

	}
}

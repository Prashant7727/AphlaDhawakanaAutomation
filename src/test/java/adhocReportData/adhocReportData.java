package adhocReportData;

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

public class adhocReportData {
	@Test
	public void adhocReportData() {

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
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TestConfig.performCommonActions(driver);
		WebElement adhocReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[5]/div[1]/a")));
		adhocReport.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement adhocConsultReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"adHocReport\"]")));
		adhocConsultReport.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ................................clinic
		// App.................................................................................//
		
		// date select
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is for all clinics.........
		// Clinic Information check box
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[2]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[4]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[5]/div/label/span[1]/span")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Doctor Information
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[2]/div/label/span[1]/span")).click();
		// Patient Demographics
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[4]/label/span[1]/span")).click();
		// Consultation Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		// Vital Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[4]/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consultation Metrics
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[4]/div/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is selected clinic.........................................
		driver.navigate().refresh();
		// date select
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		// select clinic
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("label:nth-child(2) > .circle")).click();
		driver.findElement(By.xpath("//*[@id=\"instName\"]")).click();
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")));
		selectClinic.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is particular selected clinics.........
		// Clinic Information check box
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[2]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[4]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[5]/div/label/span[1]/span")).click();
		// Doctor Information
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[2]/div/label/span[1]/span")).click();
		// Patient Demographics
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[4]/label/span[1]/span")).click();
		// Consultation Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		// Vital Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[4]/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consultation Metrics
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[4]/div/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ................................Patient
		// App......................................................................................................//
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// date select
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is all clinics.........
		// Clinic Information check box
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[2]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[4]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[5]/div/label/span[1]/span")).click();
		// Doctor Information
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[2]/div/label/span[1]/span")).click();
		// Patient Demographics
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[4]/label/span[1]/span")).click();
		// Consultation Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		// Vital Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[4]/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consultation Metrics
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[4]/div/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is selected clinic.........................................
		driver.navigate().refresh();
		// date select
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		// select clinic
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("label:nth-child(2) > .circle")).click();
		driver.findElement(By.xpath("//*[@id=\"instName\"]")).click();
		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")));
		selectClinic1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is particular selected clinics.........
		// Clinic Information check box
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[2]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[4]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[5]/div/label/span[1]/span")).click();
		// Doctor Information
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[2]/div/label/span[1]/span")).click();
		// Patient Demographics
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[4]/label/span[1]/span")).click();
		// Consultation Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		// Vital Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[4]/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consultation Metrics
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[4]/div/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ................................Patient App and
		// clinic(both)......................................................................................................//
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// date select
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is all clinics.........
		// Clinic Information check box
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[2]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[4]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[5]/div/label/span[1]/span")).click();
		// Doctor Information
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[2]/div/label/span[1]/span")).click();
		// Patient Demographics
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[4]/label/span[1]/span")).click();
		// Consultation Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		// Vital Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[4]/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consultation Metrics
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[4]/div/label/span[1]/span")).click();
		// click generate excel button
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is selected clinic.........................................
		driver.navigate().refresh();
		// date select
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		// select clinic
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("label:nth-child(2) > .circle")).click();
		driver.findElement(By.xpath("//*[@id=\"instName\"]")).click();
		WebElement selectClinic3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")));
		selectClinic3.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this is particular selected clinics.........
		// Clinic Information check box
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[2]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[4]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"clinicdetails\"]/div[5]/div/label/span[1]/span")).click();
		// Doctor Information
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[1]/div/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"doctorDetails\"]/div[2]/div/label/span[1]/span")).click();
		// Patient Demographics
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"patientDetails\"]/div[1]/div[4]/label/span[1]/span")).click();
		// Consultation Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"consultDetails\"]/div[2]/div[3]/label/span[1]/span")).click();
		// Vital Details
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[2]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[3]/div[3]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"vitalsDeatils\"]/div[1]/div[4]/label/span[1]/span")).click();
		// click generate excel button
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Consultation Metrics
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[3]/div[1]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[1]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[2]/div[2]/label/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"countValues\"]/div[4]/div/label/span[1]/span")).click();
		// click generate excel button
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}

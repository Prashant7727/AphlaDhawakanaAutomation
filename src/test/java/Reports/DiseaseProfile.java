package Reports;

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

public class DiseaseProfile {

	@Test
	public void DiseaseProfile() {
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
				WebElement reports = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[4]/div[1]/a")));
		reports.click();
		WebElement DiseaseProfile = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"diseaseProfile\"]")));
		DiseaseProfile.click();

		// Disease Profile------------------------------
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

//		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// for both*********************

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		// Disease Profile------------------------------
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// for patient***********************************

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// Disease Profile------------------------------
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();

		// Delay for 10 seconds
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"diseaseType\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")).click();
		
		driver.quit();
	}

}

package UploadReport;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;


public class UploadReport {

	@Test
	public  void UploadReport() {
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
		WebElement UploadReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instReport\"]")));
		UploadReport.click();

		// ................................clinic..................................
		WebElement inputField = driver.findElement(By.xpath("//*[@id=\"kushalamId\"]"));
		inputField.sendKeys("Sandeep.patil@medongo.com");
		WebElement FindBtn = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/a")));
		FindBtn.click();
		WebElement UploadReportBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"upload\"]")));
		UploadReportBtn.click();
		WebElement ChooseFileType = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#labReportForm > div:nth-child(9) > div.col-sm-9 > div > div:nth-child(2) > div > label > span.circle")));
		ChooseFileType.click();
		WebElement Note = driver.findElement(By.xpath("//*[@id=\"note\"]"));
		Note.sendKeys(
				"The medical record is vital to patient care.  Yet, many EMR systems are cumbersome and time consuming.  On average, physicians spend one-third to half of their time writing medical notes and entering data into electronic medical records.");
		WebElement filePath = driver.findElement(By.xpath("//*[@id=\"fileName1\"]"));
		filePath.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement OK = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[11]/div/a[2]")));
		OK.click();
		WebElement Cancel = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[11]/div/a[1]")));
		Cancel.click();

		// ..........................patient......................................
		WebElement hamburger1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/label"));
		hamburger1.click();
		WebElement UploadReport1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instReport\"]")));
		UploadReport1.click();
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		WebElement inputField1 = driver.findElement(By.xpath("//*[@id=\"kushalamId\"]"));
		inputField1.sendKeys("Sandeep.patil@medongo.com");
		WebElement FindBtn1 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/a")));
		FindBtn1.click();
		WebElement UploadReportBtn1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"upload\"]")));
		UploadReportBtn1.click();
		WebElement ChooseFileType1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#labReportForm > div:nth-child(9) > div.col-sm-9 > div > div:nth-child(2) > div > label > span.circle")));
		ChooseFileType1.click();
		WebElement Note1 = driver.findElement(By.xpath("//*[@id=\"note\"]"));
		Note1.sendKeys(
				"The medical record is vital to patient care.  Yet, many EMR systems are cumbersome and time consuming.  On average, physicians spend one-third to half of their time writing medical notes and entering data into electronic medical records.");
		WebElement filePath1 = driver.findElement(By.xpath("//*[@id=\"fileName1\"]"));
		filePath1.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement OK1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[11]/div/a[2]")));
		OK1.click();
		WebElement Cancel1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[11]/div/a[1]")));
		Cancel1.click();

		// .....................both..............................................
		WebElement hamburger2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/label"));
		hamburger2.click();
		WebElement UploadReport2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instReport\"]")));
		UploadReport2.click();
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		WebElement inputField2 = driver.findElement(By.xpath("//*[@id=\"kushalamId\"]"));
		inputField2.sendKeys("Sandeep.patil@medongo.com");
		WebElement FindBtn2 = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/a")));
		FindBtn2.click();
		WebElement UploadReportBtn2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"upload\"]")));
		UploadReportBtn2.click();
		WebElement ChooseFileType2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#labReportForm > div:nth-child(9) > div.col-sm-9 > div > div:nth-child(2) > div > label > span.circle")));
		ChooseFileType2.click();
		WebElement Note2 = driver.findElement(By.xpath("//*[@id=\"note\"]"));
		Note2.sendKeys(
				"The medical record is vital to patient care.  Yet, many EMR systems are cumbersome and time consuming.  On average, physicians spend one-third to half of their time writing medical notes and entering data into electronic medical records.");
		WebElement filePath2 = driver.findElement(By.xpath("//*[@id=\"fileName1\"]"));
		filePath2.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement OK2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[11]/div/a[2]")));
		OK2.click();
		WebElement Cancel2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[11]/div/a[1]")));
		Cancel2.click();
		driver.quit();

	}

}

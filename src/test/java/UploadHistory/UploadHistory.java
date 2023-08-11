package UploadHistory;

import java.awt.AWTException;
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

public class UploadHistory {

	@Test
	public  void UploadHistory() {
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
		WebElement UploadHistory = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instReportHistory\"]")));
		UploadHistory.click();
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................
		WebElement inputField = driver.findElement(By.xpath("//*[@id=\"searchOrderBox\"]"));
		inputField.sendKeys("1369308760");
		WebElement searchBtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteBgVitals\"]/div/div/div[2]/a")));
		searchBtn.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"current\"]/div/div")).click();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"closeDiv_11144\"]/div/div/div/div[6]/div/div[1]/a/img")).click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"current\"]/div/div")).click();
		WebElement showAllBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showall\"]")));
		showAllBtn.click();
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ..........................patient......................................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement inputField1 = driver.findElement(By.xpath("//*[@id=\"searchOrderBox\"]"));
		inputField1.sendKeys("1369308760");
		WebElement searchBtn1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteBgVitals\"]/div/div/div[2]/a")));
		searchBtn1.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"current\"]/div/div")).click();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"closeDiv_11144\"]/div/div/div/div[6]/div/div[1]/a/img")).click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"current\"]/div/div")).click();
		WebElement showAllBtn1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showall\"]")));
		showAllBtn1.click();
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// .....................both..............................................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement inputField2 = driver.findElement(By.xpath("//*[@id=\"searchOrderBox\"]"));
		inputField2.sendKeys("1369308760");
		WebElement searchBtn2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"deleteBgVitals\"]/div/div/div[2]/a")));
		searchBtn2.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"current\"]/div/div")).click();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"closeDiv_11144\"]/div/div/div/div[6]/div/div[1]/a/img")).click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"current\"]/div/div")).click();
		WebElement showAllBtn2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showall\"]")));
		showAllBtn2.click();
		driver.quit();

	}

}

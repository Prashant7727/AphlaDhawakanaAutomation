package ClinicProductManagement;

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

public class ClinicProductManagement {

	@Test
	public  void ClinicProductManagement() {
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
		
		TestConfig.performCommonActions(driver);
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				WebElement ProductManagemnet = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[8]/div[1]/a")));
		ProductManagemnet.click();
		WebElement ClinicProductManagemnet = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"productManagement\"]/ul/li[3]")));
		ClinicProductManagemnet.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ................................clinic..................................
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search.sendKeys("KID_PRD_0089979");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();

		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search1 = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search1.sendKeys("KID_PRD_0089979");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic2.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search2 = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search2.sendKeys("KID_PRD_0089979");
		
		driver.quit();
		
	}

}

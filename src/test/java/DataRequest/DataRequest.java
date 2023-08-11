package DataRequest;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class DataRequest {

	@Test
	public void dataRequest() {
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

		WebElement dataRequest = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"waterMarkerPdf\"]")));
		dataRequest.click();

		// Data Request List----------------------*******************************
		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("10/07/2023");

		driver.findElement(By.xpath("//*[@id=\"requestPdfForm\"]/div/div/div[4]/a")).click();

		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#populationtab_filter > label > input[type=text]")))
				.sendKeys("prashant");
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#populationtab > tbody > tr > td:nth-child(7) > a"))).click();

		// both-------------******************************####################

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		// Data Request List----------------------*******************************
		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("10/07/2023");

		driver.findElement(By.xpath("//*[@id=\"requestPdfForm\"]/div/div/div[4]/a")).click();

		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#populationtab_filter > label > input[type=text]")))
				.sendKeys("prashant");
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#populationtab > tbody > tr > td:nth-child(7) > a"))).click();

		// patient---------------------**************************************

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();

		// Data Request List----------------------*******************************

		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("10/07/2023");

		driver.findElement(By.xpath("//*[@id=\"requestPdfForm\"]/div/div/div[4]/a")).click();

		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#populationtab_filter > label > input[type=text]")))
				.sendKeys("prashant");
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#populationtab > tbody > tr > td:nth-child(7) > a"))).click();

		driver.quit();
	}

}

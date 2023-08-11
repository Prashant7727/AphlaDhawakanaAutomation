package Analytics;

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

public class Analytics {
	@Test
	public void Analytics() {
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

		WebElement Analytics = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[6]/div[1]/a")));
		Analytics.click();
		WebElement AnalyticsReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"analyticsReport\"]")));
		AnalyticsReport.click();

		// .............................clinic...............................
		WebElement startDateInput1 = driver.findElement(By.id("startDate"));
		WebElement endDateInput1 = driver.findElement(By.id("endDate"));
		startDateInput1.clear();
		endDateInput1.clear();
		startDateInput1.sendKeys("02/05/2023");
		endDateInput1.sendKeys("02/07/2023");
		// for all clinic generate table data

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();
		WebElement search1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search1.sendKeys("10002");

		// select particular clinic
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#labReportForm > div.radio > label:nth-child(2) > span.circle")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#allInstRow > div > div.col-sm-9.col-xs-6")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(4)"))).click();
		// generate table data
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search2.sendKeys("10000");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();

	}
}

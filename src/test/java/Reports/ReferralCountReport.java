package Reports;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ReferralCountReport {
@Test
	public void ReferralCountReport() {
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
		WebElement ReferralCountReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"four\"]/ul/a")));
		ReferralCountReport.click();

		// Referral count report-------------------------------------------

//		driver.findElement(By.id("startDate")).click();
//		driver.findElement(By.cssSelector(".ui-datepicker-year")).click();
//		driver.findElement(By.cssSelector(".ui-datepicker-month")).click();
//		driver.findElement(By.linkText("6")).click();
//		driver.findElement(By.id("endDate")).click();
//		driver.findElement(By.linkText("17")).click();
//		driver.findElement(By.id("isClinic")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[6]/div[2]/input")).click();

		driver.quit();
	}

}

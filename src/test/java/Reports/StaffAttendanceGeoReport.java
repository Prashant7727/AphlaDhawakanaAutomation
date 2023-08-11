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

public class StaffAttendanceGeoReport {
@Test
	public void StaffAttendanceGeoReport() {
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
		WebElement StaffAttendanceGeoReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"StaffAttendanceGeoReport\"]")));
		StaffAttendanceGeoReport.click();

		// StaffAttendanceGeoReport--------------------------------

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[3]/label[2]")).click();
		// *[@id="ui-id-3896"]
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("a");

		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();

//        driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li")).click();

		// both***************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[3]/label[2]")).click();
		// *[@id="ui-id-3896"]
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("a");

		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic2.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();

		// patient*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[3]/label[2]")).click();
		// *[@id="ui-id-3896"]
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("a");

		WebElement selectClinic3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic3.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[6]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();

		driver.quit();
	}

}

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

public class AttendanceReport {
@Test
	public void AttendanceReport() {
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
		WebElement AttendanceReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"attendenceReport\"]")));
		AttendanceReport.click();

		// Attendance Report--------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"myselection\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"myselection\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"instIdName\"]")).click();
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();
		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[1]")).click();
		// Delay for 4 seconds
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[2]")).click();

		// both***************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		// Attendance Report--------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"myselection\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"myselection\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"instIdName\"]")).click();
		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic1.click();
		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[1]")).click();
		// Delay for 4 seconds
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[2]")).click();

		// patient*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// Attendance Report--------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"myselection\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"myselection\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"instIdName\"]")).click();
		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic2.click();
		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[1]")).click();
		// Delay for 4 seconds
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"attendenceReportForm\"]/div/div[2]/div[3]/div[2]/div/input[2]")).click();

		driver.quit();
	}

}

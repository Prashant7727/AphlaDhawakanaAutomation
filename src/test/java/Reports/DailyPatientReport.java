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

public class DailyPatientReport {
@Test
	public void DailyPatientReport() {
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
		WebElement dailyPatientReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"DailyPatientReport\"]")));
		dailyPatientReport.click();

		// daily Patient report**********-----------------------------

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("15/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("22/06/2023");
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/div/input")).click();

		// for select clinic------------------
		driver.findElement(By.xpath("//*[@id=\"allInst\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"allInst\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("Central/Burari/020601");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/div/input")).click();

		// for both*********************

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("15/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("22/06/2023");
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/div/input")).click();

		// for select clinic------------------
		driver.findElement(By.xpath("//*[@id=\"allInst\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"allInst\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("Central/Burari/020601");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/div/input")).click();

		// for patient***********************************

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("15/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("22/06/2023");
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/div/input")).click();

		// for select clinic------------------
		driver.findElement(By.xpath("//*[@id=\"allInst\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"allInst\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("Central/Burari/020601");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[7]/div/input")).click();

		driver.quit();
	}

}

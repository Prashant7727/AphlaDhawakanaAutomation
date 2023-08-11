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

public class PMPReport {
@Test
	public void PMPReport() {
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
		WebElement PMPReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"viewAAMCPmpReport\"]")));
		PMPReport.click();

		// PMP Report----------------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[5]/div/input")).click();

		driver.findElement(By.xpath("//*[@id=\"myselection\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"myselection\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div/div[5]/div/input")).click();

		driver.quit();
	}

}

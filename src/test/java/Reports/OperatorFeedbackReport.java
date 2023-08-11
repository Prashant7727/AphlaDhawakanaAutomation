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

public class OperatorFeedbackReport {
@Test
	public void OperatorFeedbackReport() {
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
		WebElement OperatorFeedbackReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"OperatorFeedBackReport\"]")));
		OperatorFeedbackReport.click();

		// Operator feedback report

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[3]/input")).click();

		// select clinic

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
//        driver.findElement(By.cssSelector("#ui-id-1 > li:nth-child(1)")).click();

		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[3]/input")).click();

		// both**************************

		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

//Operator feedback report

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[3]/input")).click();

		// select clinic

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
//        driver.findElement(By.cssSelector("#ui-id-1 > li:nth-child(1)")).click();

		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic1.click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[3]/input")).click();

		// patient************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
//Operator feedback report

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[3]/input")).click();

		// select clinic

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("01/06/2023");

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).sendKeys("01/07/2023");

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
//        driver.findElement(By.cssSelector("#ui-id-1 > li:nth-child(1)")).click();

		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic2.click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[2]/div/div[3]/input")).click();

		driver.quit();
	}

}

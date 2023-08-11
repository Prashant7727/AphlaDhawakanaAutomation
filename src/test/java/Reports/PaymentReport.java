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

public class PaymentReport {
@Test
	public void PaymentReport() {
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
		WebElement paymentReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hbtPaymentReport\"]")));
		paymentReport.click();

		// clinic*****************************
		// payment report--------------------------
		driver.findElement(By.xpath("//*[@id=\"monthText\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"districtName\"]")).click();
		WebElement selectDistrict = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectDistrict.click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div/div/div/div/div[2]/div/div[3]/input")).click();

		// choose date
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[1]/div/label[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"districtName\"]")).click();
		WebElement selectDistrictforDate = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectDistrictforDate.click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div/div/div/div/div[2]/div/div[3]/input")).click();

		// both***************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		// compiled report--------------------*******************
		driver.findElement(By.xpath("//*[@id=\"monthText\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"districtName\"]")).click();
		WebElement selectDistrict2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectDistrict2.click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div/div/div/div/div[2]/div/div[3]/input")).click();

		// choose date
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[1]/div/label[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"districtName\"]")).click();
		WebElement selectDistrictforDate1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectDistrictforDate1.click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div/div/div/div/div[2]/div/div[3]/input")).click();

		// patient*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();

		// compiled report--------------------*******************
		driver.findElement(By.xpath("//*[@id=\"monthText\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"districtName\"]")).click();
		WebElement selectDistrict3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectDistrict3.click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div/div/div/div/div[2]/div/div[3]/input")).click();

		// choose date
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[1]/div/label[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"districtName\"]")).click();
		WebElement selectDistrictforDate2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectDistrictforDate2.click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div/div/div/div/div[2]/div/div[3]/input")).click();

		driver.quit();
	}

}

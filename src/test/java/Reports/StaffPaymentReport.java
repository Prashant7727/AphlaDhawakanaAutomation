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

public class StaffPaymentReport {
@Test
	public void StaffPaymentReport() {
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
				.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\"salaryPaymentReport\"]")));
		paymentReport.click();

		// staff payment---------------------------************
		driver.findElement(By.xpath("//*[@id=\"yearpicker\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"yearpicker\"]/option[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"monthSelect\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"monthSelect\"]/option[4]")).click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[1]/div/div/div/div[2]/div/div[3]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"verifyAll\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[6]")).click();

		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[5]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[5]/input[3]")).click();

		driver.quit();
	}

}

package ManageMasterData;

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

public class Referrals {

	@Test
	public void Referrals () {
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
		
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Manage Master Data")));
		ManageMasterData.click();

		WebElement referal = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Referrals")));
		referal.click();

		driver.findElement(By.id("instId")).click();
		WebElement clinicname = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		clinicname.click();
		driver.findElement(By.id("search_rightAll")).click();

		// driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("instId")).click();
		WebElement clinicname1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		clinicname1.click();

		driver.findElement(By.id("search_leftAll")).click();

		// driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("instId")).click();
		WebElement clinicname3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		clinicname3.click();

		driver.findElement(By.id("search_leftSelected")).click();

		// driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("instId")).click();
		WebElement clinicname4 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		clinicname4.click();

		driver.findElement(By.id("search_rightSelected")).click();

		// driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("instId")).click();
		WebElement clinicname5 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		clinicname5.click();

		driver.findElement(By.id("search_leftSelected")).click();

		// driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		
		driver.quit();

	}
}

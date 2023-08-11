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

public class Speciality_Referral {

	@Test
	public void Speciality_Referral () {

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

		WebElement referalSpc = wait.until(ExpectedConditions.elementToBeClickable(By.id("manageReferralsSpeciality")));
		referalSpc.click();

		WebElement instdata = wait.until(ExpectedConditions.elementToBeClickable(By.id("instId")));
		instdata.click();

		WebElement manageSpc = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(3)")));
		referalSpc.click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
		// driver.findElement(By.id("instId")).click();
		// driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();

		driver.findElement(By.id("search_rightAll")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("instId")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();

		driver.findElement(By.id("search_leftAll")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("instId")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();

		driver.findElement(By.id("search_leftSelected")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("instId")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();

		driver.findElement(By.id("search_rightSelected")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("instId")).click();
		driver.findElement(By.cssSelector("#ui-id-1 > li:nth-child(1)")).click();

		driver.findElement(By.id("search_leftSelected")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[4]/div[2]/input")).click();
		
		driver.quit();

	}
}

package ManageMasterData;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ManageFamailyScheme {

	@Test
	public void ManageFamailyScheme () {

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

		WebElement manageFamilyScheme = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageFamilyScheme")));
		manageFamilyScheme.click();

		WebElement addArea = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("#blockDiv > div.card-heading > div.col-sm-6.col-xs-12.text-right > a")));
		addArea.click();

		driver.findElement(By.id("categoryId")).click();
		driver.findElement(By.id("categoryId")).sendKeys("medcine");

		driver.findElement(By.id("serviceType")).click();
		driver.findElement(By.id("serviceType")).sendKeys("med");

		driver.findElement(By.id("discount")).click();
		driver.findElement(By.id("discount")).sendKeys("20");

		driver.findElement(By.id("schemeCon")).click();
		driver.findElement(By.id("schemeCon")).sendKeys("normal");

		driver.findElement(By.xpath("//*[@id=\"addFamilyScheme\"]/div/div[5]/input")).click();
		
		driver.quit();

	}

}

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

public class Manage_FamilyCategory {

	@Test
	public void Manage_FamilyCategory () {

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

		WebElement manageFamilyCategory = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageFamilyCategory")));
		manageFamilyCategory.click();

		WebElement add = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div/div[1]/div[3]/a")));
		add.click();

		driver.findElement(By.id("categoryId")).click();
		driver.findElement(By.id("categoryId")).sendKeys("test");

		driver.findElement(By.id("annualIncomeFrom")).click();
		driver.findElement(By.id("annualIncomeFrom")).sendKeys("10000");

		driver.findElement(By.id("annualIncomeTo")).click();
		driver.findElement(By.id("annualIncomeTo")).sendKeys("20000");

		driver.findElement(By.id("supportedDocument")).click();
		driver.findElement(By.id("supportedDocument")).sendKeys("IncomeCast");

		driver.findElement(By.xpath("//*[@id=\"addFamilyCategory\"]/div/div[5]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}



		WebElement edite = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
		edite.click();

		driver.findElement(By.id("categoryIdU")).click();
		driver.findElement(By.id("categoryIdU")).clear();
		driver.findElement(By.id("categoryIdU")).sendKeys("test");

		driver.findElement(By.id("annualIncomeFromU")).click();
		driver.findElement(By.id("annualIncomeFromU")).clear();
		driver.findElement(By.id("annualIncomeFromU")).sendKeys("14000.00");

		driver.findElement(By.id("annualIncomeToU")).click();
		driver.findElement(By.id("annualIncomeToU")).clear();
		driver.findElement(By.id("annualIncomeToU")).sendKeys("20000.00");

		driver.findElement(By.id("supportedDocumentU")).click();
		driver.findElement(By.id("supportedDocumentU")).clear();
		driver.findElement(By.id("supportedDocumentU")).sendKeys("IncomeCasts");

		WebElement save = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateFamilyCategory\"]/div/div[5]/a[1]")));
		save.click();

		driver.quit();
	}
}

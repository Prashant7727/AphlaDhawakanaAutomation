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

public class ManagePatientInvestigation {

	@Test
	public void ManagePatientInvestigation () {
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
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.quit();
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement ManagePatientInvestigation = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageInvestigation\"]")));
		ManagePatientInvestigation.click();

		// Manage Patient Investigation------------------------------------------
		driver.findElement(By.linkText("Add Investigation")).click();
		driver.findElement(By.id("investigation")).click();
		driver.findElement(By.id("investigation")).sendKeys("demo77");
		driver.findElement(By.cssSelector(".col-sm-3 > .btn:nth-child(1)")).click();
		WebElement SearchService = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService.sendKeys("10021");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();
		driver.findElement(By.cssSelector(".dashboard-widget")).click();
		driver.findElement(By.id("investigationNameU")).clear();
		driver.findElement(By.id("investigationNameU")).sendKeys("demo7777");
		driver.findElement(By.xpath("//*[@id=\"updateInvestigation\"]/div/div[2]/a[1]")).click();
		WebElement SearchService1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService1.sendKeys("10021");
		
		driver.quit();
	}

}

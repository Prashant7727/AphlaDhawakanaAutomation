package ManageMasterData;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ManageHelpScreens {

	@Test
	public void ManageHelpScreens () {
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
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();

		WebElement ManageHelpScreens = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("helpScreenManagement")));
		ManageHelpScreens.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		WebElement filePath = driver.findElement(By.id("fileName"));
		filePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.xpath("//*[@id=\"heplScreenForm\"]/div/div[3]/input")).click();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("10047");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]/a")).click();

		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement patientbothfilePath = driver.findElement(By.id("fileName"));
		patientbothfilePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.xpath("//*[@id=\"heplScreenForm\"]/div/div[3]/input")).click();

		WebElement patientbothsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		patientbothsearch.sendKeys("10047");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]/a")).click();

		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement bothfilePath = driver.findElement(By.id("fileName"));
		bothfilePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.xpath("//*[@id=\"heplScreenForm\"]/div/div[3]/input")).click();

		WebElement bothsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		bothsearch.sendKeys("10047");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]/a")).click();
		
		driver.quit();

	}

}

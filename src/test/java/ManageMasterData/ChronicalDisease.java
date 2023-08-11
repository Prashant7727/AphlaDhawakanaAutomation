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

public class ChronicalDisease {

	@Test
	public void ChronicalDisease () {
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
		WebElement ChronicalDisease = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageDisease\"]")));
		ChronicalDisease.click();

		// Chronical Disease-----------------------
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"disName\"]")).sendKeys("demo77");
		driver.findElement(By.xpath("//*[@id=\"addRiskFactor\"]/div/div[2]/input")).click();

//        edit
		WebElement Edit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")));
		Edit.click();
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"chronicDisNameU\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"chronicDisNameU\"]")).sendKeys("demo7777");
		driver.findElement(By.xpath("//*[@id=\"updateChronicalDis\"]/div/div[2]/a[1]")).click();

		// delete

		WebElement Delete = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr/td[4]/a")));
		Delete.click();
		
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
		
		// Chronical Disease-----------------------
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"disName\"]")).sendKeys("demo77");
		driver.findElement(By.xpath("//*[@id=\"addRiskFactor\"]/div/div[2]/input")).click();

//        edit
		WebElement patientEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")));
		patientEdit.click();
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"chronicDisNameU\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"chronicDisNameU\"]")).sendKeys("demo7777");
		driver.findElement(By.xpath("//*[@id=\"updateChronicalDis\"]/div/div[2]/a[1]")).click();

		// delete

		WebElement patientDelete = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr/td[4]/a")));
		patientDelete.click();
		
		//...............................both........................
		
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		// Chronical Disease-----------------------
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"disName\"]")).sendKeys("demo77");
		driver.findElement(By.xpath("//*[@id=\"addRiskFactor\"]/div/div[2]/input")).click();

//        edit
		WebElement bothEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")));
		bothEdit.click();
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"chronicDisNameU\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"chronicDisNameU\"]")).sendKeys("demo7777");
		driver.findElement(By.xpath("//*[@id=\"updateChronicalDis\"]/div/div[2]/a[1]")).click();

		// delete
		WebElement bothDelete = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr/td[4]/a")));
		bothDelete.click();
		driver.quit();
	}

}

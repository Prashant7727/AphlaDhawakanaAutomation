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

public class Screening_Data {

	@Test
	public void Screening_Data () {

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
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();

		WebElement screening = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Screening Data")));
		screening.click();

		WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Screening")));
		add.click();

		driver.findElement(By.id("file")).sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		WebElement update = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")));
		update.click();

		// Delay for 2 seconds
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement type = wait.until(ExpectedConditions.elementToBeClickable(By.id("cancerTypeU")));
		type.click();

		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Save")));
		save.click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement delete = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[4]/td[5]/a")));
		delete.click();
		
		driver.quit();

	}
}

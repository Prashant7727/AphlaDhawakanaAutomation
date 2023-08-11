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

public class managePreventiveAreaCode {

	@Test
	public void managePreventiveAreaCode () {

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

		WebElement Area = wait.until(ExpectedConditions.elementToBeClickable(By.id("managePreventiveAreaCode")));
		Area.click();

		WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Area")));
		add.click();

		driver.findElement(By.id("areaName")).click();
		driver.findElement(By.id("areaName")).sendKeys("inst");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.id("clinicName")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[3]")).click();

		driver.findElement(By.linkText("Save")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.findElement(By.id("file")).click();
		driver.findElement(By.id("file")).sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		// driver.findElement(By.css("#updateAreaListForm >
		// input.btn.btn-primary.submitbtn")).click();
		WebElement upload = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#updateAreaListForm > input.btn.btn-primary.submitbtn")));
		upload.click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement edite = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[5]/a")));
		edite.click();

		driver.findElement(By.id("areaNameU")).click();
		driver.findElement(By.id("areaNameU")).clear();
		driver.findElement(By.id("areaNameU")).sendKeys("sirnager");

		driver.findElement(By.id("clinicNameU")).click();
		driver.findElement(By.id("clinicNameU")).clear();
		driver.findElement(By.id("#ui-id-1 > li:nth-child(2)")).click();

		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Save")));
		save.click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.click();
		search.sendKeys("inst");

		WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Delete")));
		delete.click();

		driver.quit();
	}
}

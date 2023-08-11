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

public class Vital_Range_Information {

	@Test
	public void Vital_Range_Information () {

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

		WebElement manageVitalRange = wait.until(ExpectedConditions.elementToBeClickable(By.id("manageVitalRange")));
		manageVitalRange.click();

		WebElement add = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		add.click();

		driver.findElement(By.id("vitalName")).click();
		driver.findElement(By.id("vitalName")).sendKeys("Hemogloboin");

		WebElement dropdown = driver.findElement(By.id("gender"));
		dropdown.findElement(By.xpath("//option[. = 'Male']")).click();

		driver.findElement(By.id("ageRangeMin")).click();
		driver.findElement(By.id("ageRangeMin")).sendKeys("0");

		driver.findElement(By.id("ageRangeMax")).click();
		driver.findElement(By.id("ageRangeMax")).sendKeys("1");

		driver.findElement(By.id("leastValue")).click();
		driver.findElement(By.id("leastValue")).sendKeys("11.0");

		driver.findElement(By.id("highValue")).click();
		driver.findElement(By.id("highValue")).sendKeys("12.0");

		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement seatrch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		seatrch.click();
		seatrch.sendKeys("10004");

//		WebElement edite = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
//		edite.click();
//
//		driver.findElement(By.id("vitalNameU")).click();
//		driver.findElement(By.id("vitalNameU")).clear();
//		driver.findElement(By.id("vitalNameU")).sendKeys("duhgfius");
//
//		WebElement dropdown1 = driver.findElement(By.id("genderU"));
//		dropdown1.findElement(By.xpath("//option[. = 'Female']")).click();
//
//		driver.findElement(By.id("ageRangeMinU")).click();
//		driver.findElement(By.id("ageRangeMinU")).clear();
//		driver.findElement(By.id("ageRangeMinU")).sendKeys("3");
//
//		driver.findElement(By.id("ageRangeMaxU")).click();
//		driver.findElement(By.id("ageRangeMaxU")).clear();
//		driver.findElement(By.id("ageRangeMaxU")).sendKeys("12");
//
//		driver.findElement(By.id("leastValueU")).click();
//		driver.findElement(By.id("leastValueU")).clear();
//		driver.findElement(By.id("leastValueU")).sendKeys("29.0");
//
//		driver.findElement(By.id("highValueU")).click();
//		driver.findElement(By.id("highValueU")).clear();
//		driver.findElement(By.id("highValueU")).sendKeys("35.0");
//
//		WebElement save = wait.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateService\"]/div[2]/div[1]/button")));
//		save.click();
		
		driver.quit();

	}
}

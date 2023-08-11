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

public class ManageEquipment {

	@Test
	public void ManageEquipment () {
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
		WebElement ManageEquipment = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageEquipment\"]")));
		ManageEquipment.click();

		// Manage Equipment---------------------------

		driver.findElement(By.linkText("Add Equipment")).click();
		driver.findElement(By.id("equipment")).click();
		driver.findElement(By.id("equipment")).sendKeys("demo77");
		driver.findElement(By.id("equipmentType")).click();
		{
			WebElement dropdown = driver.findElement(By.id("equipmentType"));
			dropdown.findElement(By.xpath("//option[. = 'GENERAL']")).click();
		}
		driver.findElement(By.cssSelector(".col-sm-3 > .btn:nth-child(1)")).click();

		WebElement SearchService = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService.sendKeys("demo77");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("equipmentNameU")).clear();
		driver.findElement(By.id("equipmentNameU")).sendKeys("demo7777");
		driver.findElement(By.id("equipmentTypeU")).click();
		driver.findElement(By.xpath("//*[@id=\"equipmentTypeU\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"updateEquipment\"]/div/div[3]/a[1]")).click();
		
		driver.quit();

	}

}

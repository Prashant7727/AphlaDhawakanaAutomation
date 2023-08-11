package UpdateLotInventory;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class UpdateLotInventory {

	@Test
	public  void UpdateLotInventory() {
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
		//        driver.quit();
		WebElement UpdateLotInventory = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateProductLotStock")));
		UpdateLotInventory.click();

		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic2.click();

		driver.findElement(By.xpath("//*[@id=\"getInventoryForm\"]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		driver.findElement(By.xpath("//*[@id=\"inventoryUpdateForm\"]/input[3]")).click();
		driver.quit();
	}

}

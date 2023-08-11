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

public class ManageOccupation {

	@Test
	public void ManageOccupation () {
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
		WebElement ManageOccupation = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageOccupation\"]")));
		ManageOccupation.click();

		// manage occupation--------------------------------

		driver.findElement(By.linkText("Add Occupation")).click();
		driver.findElement(By.id("occupation")).click();
		driver.findElement(By.id("occupation")).sendKeys("demo77");
		driver.findElement(By.cssSelector(".col-sm-3 > .btn:nth-child(1)")).click();

		WebElement SearchService = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService.sendKeys("Demo77");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"occupationNameU\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"occupationNameU\"]")).sendKeys("demo77");
		driver.findElement(By.xpath("//*[@id=\"updateOccupation\"]/div/div[2]/a[1]")).click();
//        
		WebElement SearchService1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService1.sendKeys("Demo77");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"occupationNameU\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"occupationNameU\"]")).sendKeys("demo7777");
		driver.findElement(By.xpath("//*[@id=\"updateOccupation\"]/div/div[2]/a[1]")).click();
		
		driver.quit();

	}

}

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

public class Analytics_Information {
	@Test
	public void Analytics_Information () {

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

		WebElement manageAnalyticsInformation = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageAnalyticsInformation")));
		manageAnalyticsInformation.click();

		WebElement add = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		add.click();

		driver.findElement(By.id("loggingType")).click();
		driver.findElement(By.id("loggingType")).sendKeys("OPERATION");

		driver.findElement(By.id("module")).click();
		driver.findElement(By.id("module")).sendKeys("0");

		driver.findElement(By.id("messageName")).click();
		driver.findElement(By.id("messageName")).sendKeys("1");

		driver.findElement(By.id("messageType")).click();
		driver.findElement(By.id("messageType")).sendKeys("11.0");

		driver.findElement(By.id("messageValue")).click();
		driver.findElement(By.id("messageValue")).sendKeys("12.0");

		// Import data of employee
				driver.findElement(By.xpath("//*[@id=\"file\"]"))
						.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement seatrch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		seatrch.click();
		seatrch.sendKeys("10000");

		WebElement edite = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
		edite.click();

		driver.findElement(By.id("loggingTypeU")).click();
		driver.findElement(By.id("loggingTypeU")).clear();
		driver.findElement(By.id("loggingTypeU")).sendKeys("OPERATION");

		driver.findElement(By.id("moduleU")).click();
		driver.findElement(By.id("moduleU")).clear();
		driver.findElement(By.id("moduleU")).sendKeys("LOGIN");

		driver.findElement(By.id("messageNameU")).click();
		driver.findElement(By.id("messageNameU")).clear();
		driver.findElement(By.id("messageNameU")).sendKeys("LOGIN");

		driver.findElement(By.id("messageTypeU")).click();
		driver.findElement(By.id("messageTypeU")).clear();
		driver.findElement(By.id("messageTypeU")).sendKeys("INFO");

		driver.findElement(By.id("messageValueU")).click();
		driver.findElement(By.id("messageValueU")).clear();
		driver.findElement(By.id("messageValueU")).sendKeys("INCORRECT USERNAME OR PASSWORD");

		WebElement save = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateService\"]/div[2]/div[1]/button")));
		save.click();
		
		driver.quit();

	}
}

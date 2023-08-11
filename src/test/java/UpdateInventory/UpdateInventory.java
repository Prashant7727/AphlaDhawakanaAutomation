package UpdateInventory;

import java.awt.AWTException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class UpdateInventory {

	@Test
	public  void UpdateInventory() {
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
		WebElement UpdateInventory = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateStaticStock")));
		UpdateInventory.click();

		// ................................clinic..................................
		// Inventory Report
		WebElement filePath = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement ImportFile = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"importFile\"]/input[2]")));
		ImportFile.click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectClinic.click();
		WebElement GenerateReport = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")));
		GenerateReport.click();
		// Adjust Balance Stock
		WebElement filePath1 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement AdjustBalance = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateBalanceStockForm\"]/input[2]")));
		AdjustBalance.click();
		// Import VM Stock
		WebElement filePath2 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath2.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement importStock = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateBalanceStockForm\"]/input[2]")));
		importStock.click();

//		
//		//..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		// Inventory Report
		WebElement filePath11 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath11.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement ImportFile1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"importFile\"]/input[2]")));
		ImportFile1.click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectClinic1.click();
		WebElement GenerateReport1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")));
		GenerateReport1.click();
		// Adjust Balance Stock
		WebElement filePath111 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath111.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement AdjustBalance1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateBalanceStockForm\"]/input[2]")));
		AdjustBalance1.click();
		// Import VM Stock
		WebElement filePath21 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath21.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement importStock1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateBalanceStockForm\"]/input[2]")));
		importStock1.click();

//	//.....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		// Inventory Report
		WebElement filePath1111 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1111.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement ImportFile1111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"importFile\"]/input[2]")));
		ImportFile1111.click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic11 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[1]")));
		selectClinic11.click();
		WebElement GenerateReport11 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"labReportForm\"]/div[2]/div[2]/input")));
		GenerateReport11.click();
		// Adjust Balance Stock
		WebElement filePath11111 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath11111.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement AdjustBalance11 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateBalanceStockForm\"]/input[2]")));
		AdjustBalance11.click();
		// Import VM Stock
		WebElement filePath211 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath211.sendKeys("C:/Users/jsingh/Desktop/jjjjjj.png");
		WebElement importStock11 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateBalanceStockForm\"]/input[2]")));
		importStock11.click();
		
		driver.quit();

	}

}

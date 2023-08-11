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

public class Physiotheraphy {

	@Test
	public void Physiotheraphy () {
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
				// Delay for 2 seconds
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// driver.quit();
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement UploadVerificationStaff = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Physiotheraphy")));
		UploadVerificationStaff.click();

		// Upload verification staff-------------------
		driver.findElement(By.linkText("Add Physio")).click();
		driver.findElement(By.id("serviceName")).click();
		driver.findElement(By.id("serviceName")).sendKeys("demoPS");
		driver.findElement(By.id("serviceFee")).click();
		driver.findElement(By.id("serviceFee")).sendKeys("200.00");
		driver.findElement(By.id("phsioType")).click();
		driver.findElement(By.id("phsioType")).sendKeys("DEGHJ");

		driver.findElement(By.xpath("//*[@id=\"addPhysio\"]/div[2]/div[1]/input")).click();
		// Delay for 2 seconds

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement filePath1 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1.click();
		filePath1.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//        WebElement click = driver.findElement(By.cssSelector("#updateRefListForm > input.btn.btn-primary.submitbtn"));

		// driver.findElement(By.xpath("//*[@id=\"file\"]")).click();
		// driver.findElement(By.xpath("//*[@id=\"file\"]")).sendKeys("C:\\fakepath\\Service_master_report.xlsx");
		// driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();

		// driver.findElement(By.cssSelector("#updateRefListForm >
		// input.btn.btn-primary.submitbtn")).click();
		// driver.findElement(By.cssSelector("#sdownloadServiceFile >
		// input.btn.btn-primary.submitbtn")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("serviceNameU")).click();
		driver.findElement(By.id("serviceNameU")).clear();
		driver.findElement(By.id("serviceNameU")).sendKeys("demoPS1");

		driver.findElement(By.id("serviceFeeU")).click();
		driver.findElement(By.id("serviceFeeU")).clear();
		driver.findElement(By.id("serviceFeeU")).sendKeys("100.00");

		driver.findElement(By.id("typePhysioU")).click();
		driver.findElement(By.id("typePhysioU")).clear();
		driver.findElement(By.id("typePhysioU")).sendKeys("demoPS1");
		driver.findElement(By.linkText("Submit")).click();
		
		driver.quit();

	}
}

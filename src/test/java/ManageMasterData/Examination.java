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

public class Examination {

	@Test
	public void Examination () {
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
		WebElement UploadVerificationStaff = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageMasterData\"]")));
		UploadVerificationStaff.click();

		// Upload verification staff-------------------
		driver.findElement(By.linkText("Add Examination")).click();
		driver.findElement(By.id("phyExamName")).click();
		driver.findElement(By.id("phyExamName")).sendKeys("demoPS");
		driver.findElement(By.id("phyType")).click();
		driver.findElement(By.id("phyType")).sendKeys("7777777");
		driver.findElement(By.id("value")).click();
		driver.findElement(By.id("value")).sendKeys("123123123");
		driver.findElement(By.id("examinationType")).click();
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.linkText("Save")).click();
		// Delay for 2 seconds
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector("#example_filter > label > input[type=text]")).click();
		driver.findElement(By.cssSelector("#example_filter > label > input[type=text]")).sendKeys("7777777");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("Test_Name")).click();
		driver.findElement(By.id("Test_Name")).sendKeys("demoPS1");
		driver.findElement(By.linkText("Save")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#example_filter > label > input[type=text]")).click();
		driver.findElement(By.cssSelector("#example_filter > label > input[type=text]")).sendKeys("7777777");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.cssSelector("#example_filter > label > input[type=text]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#example_filter > label > input[type=text]")).sendKeys("7777777");
		driver.quit();
	}

}

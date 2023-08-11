package PhoneTracking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class PhoneTracking {

	public static void main(String[] args) {
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
				WebElement PhoneTracking = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"phoneTrack\"]")));
		PhoneTracking.click();

		// Phone Tracking-----------------------------------------------------
		driver.findElement(By.id("patMobileNumber")).click();
		driver.findElement(By.id("patMobileNumber")).sendKeys("1212121212");
		driver.findElement(By.id("locGatherInterval")).click();
		driver.findElement(By.id("locGatherInterval")).sendKeys("22");
		driver.findElement(By.id("locPushInterval")).click();
		driver.findElement(By.id("locPushInterval")).sendKeys("11");
		driver.findElement(By.id("message")).click();
		driver.findElement(By.id("message")).sendKeys("aaa");
		driver.findElement(By.id("link")).click();
		driver.findElement(By.id("link")).sendKeys("https://in.medongo.com/");
		driver.findElement(By.id("type")).click();
		{
			WebElement dropdown = driver.findElement(By.id("type"));
			dropdown.findElement(By.xpath("//option[. = 'Start Tracking']")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"patientTrackNotification\"]/div[7]/div[2]/input")).click();

		// both-------------*****************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		// Phone Tracking-----------------------------------------------------
		driver.findElement(By.id("patMobileNumber")).click();
		driver.findElement(By.id("patMobileNumber")).sendKeys("1212121212");
		driver.findElement(By.id("locGatherInterval")).click();
		driver.findElement(By.id("locGatherInterval")).sendKeys("22");
		driver.findElement(By.id("locPushInterval")).click();
		driver.findElement(By.id("locPushInterval")).sendKeys("11");
		driver.findElement(By.id("message")).click();
		driver.findElement(By.id("message")).sendKeys("aaa");
		driver.findElement(By.id("link")).click();
		driver.findElement(By.id("link")).sendKeys("https://in.medongo.com/");
		driver.findElement(By.id("type")).click();
		{
			WebElement dropdown = driver.findElement(By.id("type"));
			dropdown.findElement(By.xpath("//option[. = 'Start Tracking']")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"patientTrackNotification\"]/div[7]/div[2]/input")).click();

		// patient---------------------*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();

		// Phone Tracking-----------------------------------------------------
		driver.findElement(By.id("patMobileNumber")).click();
		driver.findElement(By.id("patMobileNumber")).sendKeys("1212121212");
		driver.findElement(By.id("locGatherInterval")).click();
		driver.findElement(By.id("locGatherInterval")).sendKeys("22");
		driver.findElement(By.id("locPushInterval")).click();
		driver.findElement(By.id("locPushInterval")).sendKeys("11");
		driver.findElement(By.id("message")).click();
		driver.findElement(By.id("message")).sendKeys("aaa");
		driver.findElement(By.id("link")).click();
		driver.findElement(By.id("link")).sendKeys("https://in.medongo.com/");
		driver.findElement(By.id("type")).click();
		{
			WebElement dropdown = driver.findElement(By.id("type"));
			dropdown.findElement(By.xpath("//option[. = 'Start Tracking']")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"patientTrackNotification\"]/div[7]/div[2]/input")).click();
		driver.quit();
	}

}

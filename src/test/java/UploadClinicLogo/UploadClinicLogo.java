package UploadClinicLogo;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class UploadClinicLogo {

	@Test
	public  void UploadClinicLogo() {
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
		WebElement UploadClinicLogo = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#clinicLogo")));
		UploadClinicLogo.click();

		// Upload clinic logo--------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("A");
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();
		driver.findElement(By.xpath("//*[@id=\"printFooterText\"]")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"fileName\"]"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"uploadClinicLogoForm\"]/div[2]/div[2]/input")).click();

//      driver.findElement(By.cssSelector("#fileName")).sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
//      driver.findElement(By.xpath("//*[@id=\"uploadVideoPlaybackForm\"]/div/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"instId1\"]")).sendKeys("A");
		WebElement selectClinic5 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-2 > li:nth-child(1)")));
		selectClinic5.click();
		driver.findElement(By.cssSelector("#fileName1"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"uploadClinicUserGeoForm\"]/div/div[2]/input")).click();

		// @both-------------------------------------********************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		// Upload clinic logo--------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("A");
		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic1.click();
		driver.findElement(By.xpath("//*[@id=\"printFooterText\"]")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"fileName\"]"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"uploadClinicLogoForm\"]/div[2]/div[2]/input")).click();

//      driver.findElement(By.cssSelector("#fileName")).sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
//      driver.findElement(By.xpath("//*[@id=\"uploadVideoPlaybackForm\"]/div/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"instId1\"]")).sendKeys("A");
		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-2 > li:nth-child(1)")));
		selectClinic2.click();
		driver.findElement(By.cssSelector("#fileName1"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"uploadClinicUserGeoForm\"]/div/div[2]/input")).click();

		// @patient
		// app-------------------------------------***********************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// Upload clinic logo--------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).sendKeys("A");
		WebElement selectClinic3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic3.click();
		driver.findElement(By.xpath("//*[@id=\"printFooterText\"]")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"fileName\"]"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"uploadClinicLogoForm\"]/div[2]/div[2]/input")).click();

//      driver.findElement(By.cssSelector("#fileName")).sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
//      driver.findElement(By.xpath("//*[@id=\"uploadVideoPlaybackForm\"]/div/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"instId1\"]")).sendKeys("A");
		WebElement selectClinic4 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-2 > li:nth-child(1)")));
		selectClinic4.click();
		driver.findElement(By.cssSelector("#fileName1"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"uploadClinicUserGeoForm\"]/div/div[2]/input")).click();
		driver.quit();
	}

}

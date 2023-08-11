package ManageMasterData;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ManageClinicHubDoctor {

	@Test
	public void ManageClinicHubDoctor () {
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
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();

		WebElement ManageClinicHubDoctor = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageClinicHubDoctor")));
		ManageClinicHubDoctor.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		WebElement selectClinicName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instId\"]")));
		selectClinicName.click();
		selectClinicName.sendKeys("West/Uttam Nagar/320713");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("ui-id-1")).click();

		WebElement search = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"assignInstitutesForm\"]/div[1]/input")));
		search.sendKeys("su");

		driver.findElement(By.xpath("//*[@id=\"search_rightAll\"]/i")).click();

		WebElement search1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"assignInstitutesForm\"]/div[1]/input")));
		search1.clear();
		search1.sendKeys("a");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"search_rightSelected\"]/i")).click();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"doctorInstituteDiv\"]/div[1]/div/div[2]/a[1]")).click();

		// ..........................patient......................................

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement selectClinicName2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instId\"]")));
		selectClinicName2.click();
		selectClinicName2.sendKeys("West/Uttam Nagar/320713");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("ui-id-1")).click();

		WebElement search2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"assignInstitutesForm\"]/div[1]/input")));
		search2.sendKeys("su");

		driver.findElement(By.xpath("//*[@id=\"search_rightAll\"]/i")).click();

		WebElement search12 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"assignInstitutesForm\"]/div[1]/input")));
		search12.clear();
		search12.sendKeys("a");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"search_rightSelected\"]/i")).click();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"doctorInstituteDiv\"]/div[1]/div/div[2]/a[1]")).click();

		// .....................both..............................................

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement selectClinicName3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"instId\"]")));
		selectClinicName3.click();
		selectClinicName3.sendKeys("West/Uttam Nagar/320713");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("ui-id-1")).click();

		WebElement search3 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"assignInstitutesForm\"]/div[1]/input")));
		search3.sendKeys("su");

		driver.findElement(By.xpath("//*[@id=\"search_rightAll\"]/i")).click();

		WebElement search13 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"assignInstitutesForm\"]/div[1]/input")));
		search13.clear();
		search13.sendKeys("a");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"search_rightSelected\"]/i")).click();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"doctorInstituteDiv\"]/div[1]/div/div[2]/a[1]")).click();
		
		driver.quit();

	}

}
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

public class ManageFacilityIssue {

	@Test
	public void ManageFacilityIssue () {
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

		WebElement ManageFacilityIssue = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageFacilityIssue")));
		ManageFacilityIssue.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement FacilityType = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueType")));
		FacilityType.sendKeys("FacilityType1");

		WebElement FacilityName = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueName")));
		FacilityName.sendKeys("FacilityName1");

		driver.findElement(By.xpath("//*[@id=\"addFacilityIssueInfo\"]/div[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement FacilityType1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueType")));
		FacilityType1.sendKeys("FacilityType1");

		WebElement FacilityName1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueName")));
		FacilityName1.sendKeys("FacilityName1");

		WebElement filePath = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addFacilityIssueInfo\"]/div[5]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("11140");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement EditFacilityType = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Facility_Type\"]")));
		EditFacilityType.clear();
		EditFacilityType.sendKeys("FacilityType000");

		WebElement EditFacilityName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Facility_Name\"]")));
		EditFacilityName.clear();
		EditFacilityName.sendKeys("FacilityName000");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateFacilityIssueInfoData\"]/div/div[5]/a[1]")).click();

		// ..........................patient......................................
		try {
			TimeUnit.SECONDS.sleep(2);
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

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement FacilityType2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueType")));
		FacilityType2.sendKeys("FacilityType1");

		WebElement FacilityName2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueName")));
		FacilityName2.sendKeys("FacilityName1");

		driver.findElement(By.xpath("//*[@id=\"addFacilityIssueInfo\"]/div[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement FacilityType12 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueType")));
		FacilityType12.sendKeys("FacilityType1");

		WebElement FacilityName12 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueName")));
		FacilityName12.sendKeys("FacilityName1");

		WebElement filePath1 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addFacilityIssueInfo\"]/div[5]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement search1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search1.sendKeys("11140");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement EditFacilityType1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Facility_Type\"]")));
		EditFacilityType1.clear();
		EditFacilityType1.sendKeys("FacilityType000");

		WebElement EditFacilityName1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Facility_Name\"]")));
		EditFacilityName1.clear();
		EditFacilityName1.sendKeys("FacilityName000");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateFacilityIssueInfoData\"]/div/div[5]/a[1]")).click();

		// .....................both..............................................
		try {
			TimeUnit.SECONDS.sleep(2);
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

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement FacilityType3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueType")));
		FacilityType3.sendKeys("FacilityType1");

		WebElement FacilityName3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueName")));
		FacilityName3.sendKeys("FacilityName1");

		driver.findElement(By.xpath("//*[@id=\"addFacilityIssueInfo\"]/div[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement FacilityType13 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueType")));
		FacilityType13.sendKeys("FacilityType1");

		WebElement FacilityName13 = wait.until(ExpectedConditions.elementToBeClickable(By.id("facilityIssueName")));
		FacilityName13.sendKeys("FacilityName1");

		WebElement filePath3 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath3.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addFacilityIssueInfo\"]/div[5]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement search3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search3.sendKeys("11140");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement EditFacilityType3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Facility_Type\"]")));
		EditFacilityType3.clear();
		EditFacilityType3.sendKeys("FacilityType000");

		WebElement EditFacilityName3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Facility_Name\"]")));
		EditFacilityName3.clear();
		EditFacilityName3.sendKeys("FacilityName000");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateFacilityIssueInfoData\"]/div/div[5]/a[1]")).click();
		
		driver.quit();

	}

}

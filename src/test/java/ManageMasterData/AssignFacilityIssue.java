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

public class AssignFacilityIssue {

	@Test
	public void AssignFacilityIssue () {
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
		
		WebElement AssignFacilityIssue = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("assignFacilityIssue")));
		AssignFacilityIssue.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		WebElement Categories = wait.until(ExpectedConditions.elementToBeClickable(By.id("toCat")));
		Categories.sendKeys("MODULE");
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[4]")).click();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement SubCategories = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCat")));
		SubCategories.sendKeys("ITEM");
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[5]")).click();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement Contents = wait.until(ExpectedConditions.elementToBeClickable(By.id("toType")));
		Contents.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/li[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_rightAll")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_leftAll")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_rightAll")).click();

		driver.findElement(By.xpath("//*[@id=\"doctorInstituteDiv\"]/div[1]/div/div[2]/a[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

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

		WebElement FacilityType = driver.findElement(By.xpath("//*[@id=\"facilityIssueType\"]"));
		FacilityType.sendKeys("facilitytype1");

		WebElement FacilityName = driver.findElement(By.xpath("//*[@id=\"facilityIssueName\"]"));
		FacilityName.sendKeys("facilityName1");

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

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");


		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("11294");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement EditFacilityType = driver.findElement(By.xpath("//*[@id=\"Facility_Type\"]"));
		EditFacilityType.clear();
		EditFacilityType.sendKeys("module");

		WebElement EditFacilityName = driver.findElement(By.xpath("//*[@id=\"Facility_Name\"]"));
		EditFacilityName.clear();
		EditFacilityName.sendKeys("infrastructure111");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateFacilityIssueInfoData\"]/div/div[5]/a[1]")).click();

		// ..........................patient......................................

		WebElement hamburger1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/label"));
		hamburger1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement ManageMasterData1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData1.click();

		WebElement AssignFacilityIssue1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("assignFacilityIssue")));
		AssignFacilityIssue1.click();
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

		WebElement Categories1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("toCat")));
		Categories1.sendKeys("MODULE");
		driver.findElement(By.xpath("//*[@id=\\\"ui-id-1\\\"]/li[4]")).click();

		WebElement SubCategories1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCat")));
		SubCategories1.sendKeys("ITEM");
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[223]")).click();

		WebElement Contents1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("toType")));
		Contents1.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/li")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");


		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_rightAll")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_leftAll")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_rightAll")).click();

		driver.findElement(By.xpath("//*[@id=\"doctorInstituteDiv\"]/div[1]/div/div[2]/a[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

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

		WebElement FacilityType2 = driver.findElement(By.xpath("//*[@id=\"facilityIssueType\"]"));
		FacilityType2.sendKeys("facilitytype1");

		WebElement FacilityName2 = driver.findElement(By.xpath("//*[@id=\"facilityIssueName\"]"));
		FacilityName2.sendKeys("facilityName1");

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

		WebElement filePath21 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath21.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search2.sendKeys("11140");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement EditFacilityType2 = driver.findElement(By.xpath("//*[@id=\"Facility_Type\"]"));
		EditFacilityType2.clear();
		EditFacilityType2.sendKeys("module");

		WebElement EditFacilityName2 = driver.findElement(By.xpath("//*[@id=\"Facility_Name\"]"));
		EditFacilityName2.clear();
		EditFacilityName2.sendKeys("infrastructure111");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateFacilityIssueInfoData\"]/div/div[5]/a[1]")).click();

		// .....................both..............................................
		WebElement hamburger2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/label"));
		hamburger2.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement ManageMasterData2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData2.click();

		WebElement AssignFacilityIssue2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("assignFacilityIssue")));
		AssignFacilityIssue2.click();
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

		WebElement Categories3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("toCat")));
		Categories3.sendKeys("MODULE");
		driver.findElement(By.xpath("//*[@id=\\\"ui-id-1\\\"]/li[4]")).click();

		WebElement SubCategories3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCat")));
		SubCategories3.sendKeys("ITEM");
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[223]")).click();

		WebElement Contents3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("toType")));
		Contents3.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/li")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");


		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_rightAll")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_leftAll")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search_rightAll")).click();

		driver.findElement(By.xpath("//*[@id=\"doctorInstituteDiv\"]/div[1]/div/div[2]/a[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

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

		WebElement FacilityType3 = driver.findElement(By.xpath("//*[@id=\"facilityIssueType\"]"));
		FacilityType3.sendKeys("facilitytype1");

		WebElement FacilityName3 = driver.findElement(By.xpath("//*[@id=\"facilityIssueName\"]"));
		FacilityName3.sendKeys("facilityName1");

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

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");


		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search3.sendKeys("11140");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement EditFacilityType3 = driver.findElement(By.xpath("//*[@id=\"Facility_Type\"]"));
		EditFacilityType3.clear();
		EditFacilityType3.sendKeys("module");

		WebElement EditFacilityName3 = driver.findElement(By.xpath("//*[@id=\"Facility_Name\"]"));
		EditFacilityName3.clear();
		EditFacilityName3.sendKeys("infrastructure111");

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

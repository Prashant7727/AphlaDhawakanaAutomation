package UpdateConsultInfo;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class UpdateConsultInfo {

	@Test
	public  void UpdateConsultInfo() {
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
				WebElement UpdateConsultInfo = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateConsultationInfo")));
		UpdateConsultInfo.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		// Update Test List

		WebElement PathUpdateTestListFile = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		PathUpdateTestListFile.sendKeys("C:/Users/jsingh/Desktop/abc.xlsx");
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		// Tests
		WebElement TestCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testCode\"]")));
		TestCode.clear();
		TestCode.sendKeys("99999");

		WebElement TestName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testName\"]")));
		TestName.clear();
		TestName.sendKeys("sdhj ksd sjkdb>Sdcguys>> ss");

		WebElement Quantity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quantity\"]")));
		Quantity.clear();
		Quantity.sendKeys("50");

		WebElement SampleType = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sampleType\"]")));
		SampleType.clear();
		SampleType.sendKeys("PLAIN");

		WebElement ColorCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"colorCode\"]")));
		ColorCode.clear();
		ColorCode.sendKeys("RED TOP");

		WebElement TestCost = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testCost\"]")));
		TestCost.clear();
		TestCost.sendKeys("11111");

		WebElement Discount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testCostDis\"]")));
		Discount.clear();
		Discount.sendKeys("11");

		WebElement DiscountedRat = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testCostDisRate\"]")));
		DiscountedRat.clear();
		DiscountedRat.sendKeys("110");

		WebElement TestType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testType\"]")));
		TestType.clear();
		TestType.sendKeys("Normal");

		WebElement TAT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tat\"]")));
		TAT.clear();
		TAT.sendKeys("1 DAY");

		WebElement Loinc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loinc\"]")));
		Loinc.clear();
		Loinc.sendKeys("NaN");

		driver.findElement(By.xpath("//*[@id=\"category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"addTest\"]/div/div[13]/div[1]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement UpdateTestList = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		UpdateTestList.sendKeys("C:/Users/jsingh/Downloads/abc.xlsx");
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"downloadTestFile\"]/input[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchAgain = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchAgain.sendKeys("16474");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#example > tbody > tr > td:nth-child(14) > input[type=checkbox]")).click();

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[15]/a")).click();

		// update//
		// Tests
		WebElement updateTestCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"test_Code\"]")));
		updateTestCode.clear();
		updateTestCode.sendKeys("90009");

		WebElement updateTestName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Test_Name\"]")));
		updateTestName.clear();
		updateTestName.sendKeys("sdhj==ksd>>sjkdb>Sdcguys>>--ss");

		WebElement updateQuantity = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quantityU\"]")));
		updateQuantity.clear();
		updateQuantity.sendKeys("40");

		WebElement updateSampleType = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sampleTypeU\"]")));
		updateSampleType.clear();
		updateSampleType.sendKeys("PLAIN1");

		WebElement updateColorCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"colorCodeU\"]")));
		updateColorCode.clear();
		updateColorCode.sendKeys("BLUE TOP");

		WebElement updateTestCost = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Test_Cost\"]")));
		updateTestCost.clear();
		updateTestCost.sendKeys("100001");

		WebElement updateDiscount = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testCostDisU\"]")));
		updateDiscount.clear();
		updateDiscount.sendKeys("101");

		WebElement updateDiscountedRat = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testCostDisRateU\"]")));
		updateDiscountedRat.clear();
		updateDiscountedRat.sendKeys("1110");

		WebElement updateTestType = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"testTypeU\"]")));
		updateTestType.clear();
		updateTestType.sendKeys("Normal11");

		WebElement updateTAT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tatU\"]")));
		updateTAT.clear();
		updateTAT.sendKeys("25 DAYS");

		WebElement updateLoinc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loincU\"]")));
		updateLoinc.clear();
		updateLoinc.sendKeys("0");

		driver.findElement(By.xpath("//*[@id=\"categoryU\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"categoryU\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"updateTest\"]/div/div[13]/a[1]")).click();

		

		// ..........................patient......................................

//		 driver.findElement(By.id("appDataSessionId")).click();
//			WebElement patientApp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
//			patientApp.click();

		// .....................both..............................................

//			driver.findElement(By.id("appDataSessionId")).click();
//		    WebElement both = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
//		    both.click();
		
		driver.quit();

	}

}

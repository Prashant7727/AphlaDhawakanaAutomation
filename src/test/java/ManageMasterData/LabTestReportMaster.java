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

public class LabTestReportMaster {

	@Test
	public void LabTestReportMaster () {
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

		WebElement LabTestReportMaster = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageLabTestReportMaster")));
		LabTestReportMaster.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
//		driver.navigate().back();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("10395");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[15]/a")).click();

		WebElement LABTESTID = wait.until(ExpectedConditions.elementToBeClickable(By.id("labTestId")));
		LABTESTID.clear();
		LABTESTID.sendKeys("100.001");

		WebElement LABTESTNAME = wait.until(ExpectedConditions.elementToBeClickable(By.id("labTestName")));
		LABTESTNAME.clear();
		LABTESTNAME.sendKeys("complete bood cout 1111");

		WebElement SUBTESTID = wait.until(ExpectedConditions.elementToBeClickable(By.id("subTestId")));
		SUBTESTID.clear();
		SUBTESTID.sendKeys("100-009");

		WebElement DIAGNOSTICTEST = wait.until(ExpectedConditions.elementToBeClickable(By.id("diagnosticTest")));
		DIAGNOSTICTEST.clear();
		DIAGNOSTICTEST.sendKeys("Fever");

		WebElement APPLICABLEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("applicableMen")));
		APPLICABLEFORMEN.clear();
		APPLICABLEFORMEN.sendKeys("2.01");

		WebElement RANGEMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("rangeMen")));
		RANGEMEN.clear();
		RANGEMEN.sendKeys("300");

		WebElement MINRANGEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("minRangeMen")));
		MINRANGEFORMEN.clear();
		MINRANGEFORMEN.sendKeys("200");

		WebElement MAXRANGEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxRangeMen")));
		MAXRANGEFORMEN.clear();
		MAXRANGEFORMEN.sendKeys("400");

		WebElement APPLICABLEWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("applicableWomen")));
		APPLICABLEWOMEN.clear();
		APPLICABLEWOMEN.sendKeys("1.21");

		WebElement RANGEWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("rangeWomen")));
		RANGEWOMEN.clear();
		RANGEWOMEN.sendKeys("250");

		WebElement MINRANGEFORWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("minRangeWomen")));
		MINRANGEFORWOMEN.clear();
		MINRANGEFORWOMEN.sendKeys("200");

		WebElement MAXRANGEFORWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxRangeWomen")));
		MAXRANGEFORWOMEN.clear();
		MAXRANGEFORWOMEN.sendKeys("350");

		WebElement UNIT = wait.until(ExpectedConditions.elementToBeClickable(By.id("unit")));
		UNIT.clear();
		UNIT.sendKeys("cells");

		driver.findElement(By.xpath("//*[@id=\"updateTest\"]/div/div[14]/a[1]")).click();

		driver.navigate().back();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();

		WebElement patientsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		patientsearch.sendKeys("10395");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[15]/a")).click();

		WebElement patientLABTESTID = wait.until(ExpectedConditions.elementToBeClickable(By.id("labTestId")));
		patientLABTESTID.clear();
		patientLABTESTID.sendKeys("100.001");

		WebElement patientLABTESTNAME = wait.until(ExpectedConditions.elementToBeClickable(By.id("labTestName")));
		patientLABTESTNAME.clear();
		patientLABTESTNAME.sendKeys("complete bood cout 1111");

		WebElement patientSUBTESTID = wait.until(ExpectedConditions.elementToBeClickable(By.id("subTestId")));
		patientSUBTESTID.clear();
		patientSUBTESTID.sendKeys("100-009");

		WebElement patientDIAGNOSTICTEST = wait.until(ExpectedConditions.elementToBeClickable(By.id("diagnosticTest")));
		patientDIAGNOSTICTEST.clear();
		patientDIAGNOSTICTEST.sendKeys("Fever");

		WebElement patientAPPLICABLEFORMEN = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("applicableMen")));
		patientAPPLICABLEFORMEN.clear();
		patientAPPLICABLEFORMEN.sendKeys("2.01");

		WebElement patientRANGEMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("rangeMen")));
		patientRANGEMEN.clear();
		patientRANGEMEN.sendKeys("300");

		WebElement patientMINRANGEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("minRangeMen")));
		patientMINRANGEFORMEN.clear();
		patientMINRANGEFORMEN.sendKeys("200");

		WebElement patientMAXRANGEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxRangeMen")));
		patientMAXRANGEFORMEN.clear();
		patientMAXRANGEFORMEN.sendKeys("400");

		WebElement patientAPPLICABLEWOMEN = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("applicableWomen")));
		patientAPPLICABLEWOMEN.clear();
		patientAPPLICABLEWOMEN.sendKeys("1.21");

		WebElement patientRANGEWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("rangeWomen")));
		patientRANGEWOMEN.clear();
		patientRANGEWOMEN.sendKeys("250");

		WebElement patientMINRANGEFORWOMEN = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("minRangeWomen")));
		patientMINRANGEFORWOMEN.clear();
		patientMINRANGEFORWOMEN.sendKeys("200");

		WebElement patientMAXRANGEFORWOMEN = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("maxRangeWomen")));
		patientMAXRANGEFORWOMEN.clear();
		patientMAXRANGEFORWOMEN.sendKeys("350");

		WebElement patientUNIT = wait.until(ExpectedConditions.elementToBeClickable(By.id("unit")));
		patientUNIT.clear();
		patientUNIT.sendKeys("cells");

		driver.findElement(By.xpath("//*[@id=\"updateTest\"]/div/div[14]/a[1]")).click();

		driver.navigate().back();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();

		WebElement bothsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		bothsearch.sendKeys("10395");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[15]/a")).click();

		WebElement bothLABTESTID = wait.until(ExpectedConditions.elementToBeClickable(By.id("labTestId")));
		bothLABTESTID.clear();
		bothLABTESTID.sendKeys("100.001");

		WebElement bothLABTESTNAME = wait.until(ExpectedConditions.elementToBeClickable(By.id("labTestName")));
		bothLABTESTNAME.clear();
		bothLABTESTNAME.sendKeys("complete bood cout 1111");

		WebElement bothSUBTESTID = wait.until(ExpectedConditions.elementToBeClickable(By.id("subTestId")));
		bothSUBTESTID.clear();
		bothSUBTESTID.sendKeys("100-009");

		WebElement bothDIAGNOSTICTEST = wait.until(ExpectedConditions.elementToBeClickable(By.id("diagnosticTest")));
		bothDIAGNOSTICTEST.clear();
		bothDIAGNOSTICTEST.sendKeys("Fever");

		WebElement bothAPPLICABLEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("applicableMen")));
		bothAPPLICABLEFORMEN.clear();
		bothAPPLICABLEFORMEN.sendKeys("2.01");

		WebElement bothRANGEMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("rangeMen")));
		bothRANGEMEN.clear();
		bothRANGEMEN.sendKeys("300");

		WebElement bothMINRANGEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("minRangeMen")));
		bothMINRANGEFORMEN.clear();
		bothMINRANGEFORMEN.sendKeys("200");

		WebElement bothMAXRANGEFORMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxRangeMen")));
		bothMAXRANGEFORMEN.clear();
		bothMAXRANGEFORMEN.sendKeys("400");

		WebElement bothAPPLICABLEWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("applicableWomen")));
		bothAPPLICABLEWOMEN.clear();
		bothAPPLICABLEWOMEN.sendKeys("1.21");

		WebElement bothRANGEWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("rangeWomen")));
		bothRANGEWOMEN.clear();
		bothRANGEWOMEN.sendKeys("250");

		WebElement bothMINRANGEFORWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("minRangeWomen")));
		bothMINRANGEFORWOMEN.clear();
		bothMINRANGEFORWOMEN.sendKeys("200");

		WebElement bothMAXRANGEFORWOMEN = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxRangeWomen")));
		bothMAXRANGEFORWOMEN.clear();
		bothMAXRANGEFORWOMEN.sendKeys("350");

		WebElement bothUNIT = wait.until(ExpectedConditions.elementToBeClickable(By.id("unit")));
		bothUNIT.clear();
		bothUNIT.sendKeys("cells");

		driver.findElement(By.xpath("//*[@id=\"updateTest\"]/div/div[14]/a[1]")).click();

		driver.navigate().back();
		driver.quit();

	}

}

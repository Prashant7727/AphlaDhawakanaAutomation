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

public class DeviceInformationMaster {

	@Test
	public void DeviceInformationMaster () {
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

		WebElement DeviceInformationMaster = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageDeviceInformationMaster")));
		DeviceInformationMaster.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		WebElement DeviceName = wait.until(ExpectedConditions.elementToBeClickable(By.id("deviceName")));
		DeviceName.sendKeys("Device Name Second");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addDeviceInfo\"]/div/div[2]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("10042");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		WebElement ExaminationTestName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Device_Name\"]")));
		ExaminationTestName.sendKeys("Device Name First11");

		driver.findElement(By.xpath("//*[@id=\"updateDeviceInfoData\"]/div/div[3]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();

		WebElement ExaminationName = wait.until(ExpectedConditions.elementToBeClickable(By.id("phyExamName")));
		ExaminationName.sendKeys("Examination Name First");

		WebElement Type = wait.until(ExpectedConditions.elementToBeClickable(By.id("phyType")));
		Type.sendKeys("2");

		WebElement Value = wait.until(ExpectedConditions.elementToBeClickable(By.id("value")));
		Value.sendKeys("Normal&Abnormal");

		driver.findElement(By.xpath("//*[@id=\"examinationType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addPhysicalExamination\"]/div/div[5]/a[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		WebElement searchExaminationsDlt = wait
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
//		searchExaminationsDlt.sendKeys("10158");

//		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[5]/td[7]/a")).click();
//
//		try {
//			TimeUnit.SECONDS.sleep(2);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		WebElement searchExaminationsEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		searchExaminationsEdit.sendKeys("10392");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]/a")).click();

		WebElement EditExaminationTestName = wait.until(ExpectedConditions.elementToBeClickable(By.id("Test_Name")));
		EditExaminationTestName.clear();
		EditExaminationTestName.sendKeys("Edit Examination Test Name");

		WebElement EditTestType = wait.until(ExpectedConditions.elementToBeClickable(By.id("Test_Type")));
		EditTestType.clear();
		EditTestType.sendKeys("5");

		WebElement EditValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("Value")));
		EditValue.clear();
		EditValue.sendKeys("Normal");

		WebElement EditExaminationType = wait.until(ExpectedConditions.elementToBeClickable(By.id("examination_Type")));
		EditExaminationType.clear();
		EditExaminationType.sendKeys("General1111");

		driver.findElement(By.xpath("//*[@id=\"updateData\"]/div/div[6]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ..........................patient......................................

		WebElement patienthamburger = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/label"));
		patienthamburger.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement patientManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		patientManageMasterData.click();

		WebElement patientDeviceInformationMaster = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageDeviceInformationMaster")));
		patientDeviceInformationMaster.click();
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
		WebElement patientDeviceName = wait.until(ExpectedConditions.elementToBeClickable(By.id("deviceName")));
		patientDeviceName.sendKeys("Device Name Second");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addDeviceInfo\"]/div/div[2]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
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
		patientsearch.sendKeys("10041");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		WebElement patientExaminationTestName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Device_Name\"]")));
		patientExaminationTestName.sendKeys("Device Name First11");

		driver.findElement(By.xpath("//*[@id=\"updateDeviceInfoData\"]/div/div[3]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();

		WebElement patientExaminationName = wait.until(ExpectedConditions.elementToBeClickable(By.id("phyExamName")));
		patientExaminationName.sendKeys("Examination Name First");

		WebElement patientType = wait.until(ExpectedConditions.elementToBeClickable(By.id("phyType")));
		patientType.sendKeys("2");

		WebElement patientValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("value")));
		patientValue.sendKeys("Normal&Abnormal");

		driver.findElement(By.xpath("//*[@id=\"examinationType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addPhysicalExamination\"]/div/div[5]/a[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		WebElement searchExaminationsDlt1 = wait
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
//		searchExaminationsDlt1.sendKeys("10400");

//		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[9]/td[7]/a")).click();
//
//		try {
//			TimeUnit.SECONDS.sleep(2);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		WebElement patientsearchExaminationsEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		patientsearchExaminationsEdit.sendKeys("10392");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]/a")).click();

		WebElement patientEditExaminationTestName = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("Test_Name")));
		patientEditExaminationTestName.clear();
		patientEditExaminationTestName.sendKeys("Edit Examination Test Name");

		WebElement patientEditTestType = wait.until(ExpectedConditions.elementToBeClickable(By.id("Test_Type")));
		patientEditTestType.clear();
		patientEditTestType.sendKeys("5");

		WebElement patientEditValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("Value")));
		patientEditValue.clear();
		patientEditValue.sendKeys("Normal");

		WebElement patientEditExaminationType = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("examination_Type")));
		patientEditExaminationType.clear();
		patientEditExaminationType.sendKeys("General1111");

		driver.findElement(By.xpath("//*[@id=\"updateData\"]/div/div[6]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// .....................both..............................................

		WebElement bothhamburger = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/label"));
		bothhamburger.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement bothManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		bothManageMasterData.click();

		WebElement bothDeviceInformationMaster = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageDeviceInformationMaster")));
		bothDeviceInformationMaster.click();
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
		WebElement bothDeviceName = wait.until(ExpectedConditions.elementToBeClickable(By.id("deviceName")));
		bothDeviceName.sendKeys("Device Name Second");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addDeviceInfo\"]/div/div[2]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
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
		bothsearch.sendKeys("10041");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		WebElement bothExaminationTestName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Device_Name\"]")));
		bothExaminationTestName.sendKeys("Device Name First11");

		driver.findElement(By.xpath("//*[@id=\"updateDeviceInfoData\"]/div/div[3]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();

		WebElement bothExaminationName = wait.until(ExpectedConditions.elementToBeClickable(By.id("phyExamName")));
		bothExaminationName.sendKeys("Examination Name First");

		WebElement bothType = wait.until(ExpectedConditions.elementToBeClickable(By.id("phyType")));
		bothType.sendKeys("2");

		WebElement bothValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("value")));
		bothValue.sendKeys("Normal&Abnormal");

		driver.findElement(By.xpath("//*[@id=\"examinationType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addPhysicalExamination\"]/div/div[5]/a[1]")).click();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement bothsearchExaminationsEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		bothsearchExaminationsEdit.sendKeys("10392");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[6]/a")).click();

		WebElement bothEditExaminationTestName = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("Test_Name")));
		bothEditExaminationTestName.clear();
		bothEditExaminationTestName.sendKeys("Edit Examination Test Name");

		WebElement bothEditTestType = wait.until(ExpectedConditions.elementToBeClickable(By.id("Test_Type")));
		bothEditTestType.clear();
		bothEditTestType.sendKeys("5");

		WebElement bothEditValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("Value")));
		bothEditValue.clear();
		bothEditValue.sendKeys("Normal");

		WebElement bothEditExaminationType = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("examination_Type")));
		bothEditExaminationType.clear();
		bothEditExaminationType.sendKeys("General1111");

		driver.findElement(By.xpath("//*[@id=\"updateData\"]/div/div[6]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}

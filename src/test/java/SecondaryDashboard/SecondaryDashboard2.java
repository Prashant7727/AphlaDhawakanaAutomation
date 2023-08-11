package SecondaryDashboard;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import APK_Config.TestConfig;

public class SecondaryDashboard2 {

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
		// driver.quit();
		WebElement secondaryDashboard = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ten\"]/ul/li[1]")));
		secondaryDashboard.click();

//        clinic------------------------------------------------********************************
		// Top clinic classification---------------------------
		WebElement configButton1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"settingimageforTopClinic\"]")));
		configButton1.click();
		WebElement selectDate1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDateTopClinic\"]")));
		selectDate1.click();
		WebElement startDateInput1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDateTopClinic\"]")));
		startDateInput1.clear();
		startDateInput1.sendKeys("2023-06-22");
		WebElement endDateInput1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toDateTopClinic\"]")));
		endDateInput1.clear();
		endDateInput1.sendKeys("2023-07-06");
		driver.findElement(By.id("TopClinicDialog")).click();

		WebElement submitButton1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[14]/div[3]/div/button[1]")));
		submitButton1.click();
		WebElement configButton2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("settingimageforPatientCls")));
		configButton2.click();
		WebElement startDateInput2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDatePatientCls\"]")));
		startDateInput2.clear();
		startDateInput2.sendKeys("2023-06-22");
		WebElement endDateInput2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toDatePatientCls\"]")));
		endDateInput2.clear();
		endDateInput2.sendKeys("2023-07-06");

		driver.findElement(By.xpath("//*[@id=\"PatientClsDialog\"]/table/tbody/tr[10]/td")).click();
		driver.findElement(By.xpath("/html/body/div[11]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-21");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"DiseasesClsDialog\"]")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/button[1]")).click();

		// patient classification-----------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-21");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"DiseasesClsDialog\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"choseselectedphccenterforPatDiseases\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"K_00075\"]")).click();
		WebElement sbtClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00077\"]")));
		sbtClick.click();
		// *[@id="fromDateDiseasesCls"]

		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]/span")).click();

		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();
//        WebElement sbtClick2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")));
//        sbtClick2.click();

//        Configurations 3
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-25");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");

		driver.findElement(By.id("chooseAllPhcCenterforPatDiseases")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();

		// again for search clinic inside config3
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-25");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");

		driver.findElement(By.id("choseselectedphccenterforPatDiseases")).click();
//        driver.findElement(By.cssSelector("//*[@id=\"K_00079\"]")).click();
		WebElement sbtClick2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00077\"]")));
		sbtClick2.click();
		driver.findElement(By.xpath("//*[@id=\"exampleConsult_paginate\"]/span/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();

		// clinic performance----------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforConsultDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).sendKeys("2023-06-25");
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenter\"]")).click();
		driver.findElement(By.xpath("/html/body/div[17]/div[3]/div/button[1]")).click();
		// for select clinic
		driver.findElement(By.xpath("//*[@id=\"settingimageforConsultDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).sendKeys("2023-06-25");
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).sendKeys("2023-07-06");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"choseselectedphccenter\"]"));
		element.click();

		// Wait for the pop-up message and then hide it
		WebDriverWait alertWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			alertWait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (TimeoutException e) {
			// Pop-up didn't appear within the timeout
			// Handle the exception or continue with the next steps
		}

		WebElement sbtClick3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00150\"]")));
		sbtClick3.click();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]/div/button[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[16]/div[3]/div/button[1]/span")).click();

		// clinic snapshot-------------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforMapDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenterforClsSnp\"]")).click();
		driver.findElement(By.xpath("/html/body/div[19]/div[3]/div/button[1]")).click();

		// for search in clinic snapshot
		driver.findElement(By.xpath("//*[@id=\"settingimageforMapDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"choseselectedphccenterClsSnp\"]")).click();
//      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00079\"]"))).click();
		WebElement sbtClick4 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"exampleClsSnp\"]/tbody/tr[3]/td[1]")));
		sbtClick4.click();
		driver.findElement(By.xpath("/html/body/div[20]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]/div/button[1]/span")).click();

		// for user activity status ----------------------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforMA\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]/span")).click();

		// @both-------------------------------------********************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		// Top clinic classification---------------------------
		WebElement configButton3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"settingimageforTopClinic\"]")));
		configButton3.click();
		WebElement selectDate2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDateTopClinic\"]")));
		selectDate2.click();
		WebElement startDateInput3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDateTopClinic\"]")));
		startDateInput3.clear();
		startDateInput3.sendKeys("2023-06-22");
		WebElement endDateInput3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toDateTopClinic\"]")));
		endDateInput3.clear();
		endDateInput3.sendKeys("2023-07-06");
		driver.findElement(By.id("TopClinicDialog")).click();

		WebElement submitButton2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[14]/div[3]/div/button[1]")));
		submitButton2.click();
		WebElement configButton4 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("settingimageforPatientCls")));
		configButton4.click();
		WebElement startDateInput4 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDatePatientCls\"]")));
		startDateInput4.clear();
		startDateInput4.sendKeys("2023-06-22");
		WebElement endDateInput4 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toDatePatientCls\"]")));
		endDateInput4.clear();
		endDateInput4.sendKeys("2023-07-06");

		driver.findElement(By.xpath("//*[@id=\"PatientClsDialog\"]/table/tbody/tr[10]/td")).click();
		driver.findElement(By.xpath("/html/body/div[11]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-21");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"DiseasesClsDialog\"]")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/button[1]")).click();

		// patient classification-----------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-21");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"DiseasesClsDialog\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"choseselectedphccenterforPatDiseases\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"K_00075\"]")).click();
		WebElement sbtClick1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00077\"]")));
		sbtClick1.click();
		// *[@id="fromDateDiseasesCls"]

		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]/span")).click();

		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();
//      WebElement sbtClick2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")));
//      sbtClick2.click();

//      Configurations 3
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-25");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");

		driver.findElement(By.id("chooseAllPhcCenterforPatDiseases")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();

		// again for search clinic inside config3
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-25");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");

		driver.findElement(By.id("choseselectedphccenterforPatDiseases")).click();
//      driver.findElement(By.cssSelector("//*[@id=\"K_00079\"]")).click();
		WebElement sbtClick5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00077\"]")));
		sbtClick5.click();
		driver.findElement(By.xpath("//*[@id=\"exampleConsult_paginate\"]/span/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();

		// clinic performance----------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforConsultDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).sendKeys("2023-06-25");
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenter\"]")).click();
		driver.findElement(By.xpath("/html/body/div[17]/div[3]/div/button[1]")).click();
		// for select clinic
		driver.findElement(By.xpath("//*[@id=\"settingimageforConsultDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).sendKeys("2023-06-25");
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).sendKeys("2023-07-06");

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"choseselectedphccenter\"]"));
		element1.click();

		// Wait for the pop-up message and then hide it
		WebDriverWait alertWait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			alertWait2.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (TimeoutException e) {
			// Pop-up didn't appear within the timeout
			// Handle the exception or continue with the next steps
		}

		WebElement sbtClick6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00150\"]")));
		sbtClick6.click();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]/div/button[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[16]/div[3]/div/button[1]/span")).click();

		// clinic snapshot-------------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforMapDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenterforClsSnp\"]")).click();
		driver.findElement(By.xpath("/html/body/div[19]/div[3]/div/button[1]")).click();

		// for search in clinic snapshot
		driver.findElement(By.xpath("//*[@id=\"settingimageforMapDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"choseselectedphccenterClsSnp\"]")).click();
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00079\"]"))).click();
		WebElement sbtClick7 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"exampleClsSnp\"]/tbody/tr[3]/td[1]")));
		sbtClick7.click();
		driver.findElement(By.xpath("/html/body/div[20]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]/div/button[1]/span")).click();

		// for user activity status ----------------------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforMA\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]/span")).click();

//  @patient app-------------------------------------***********************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();

		// Top clinic classification---------------------------
		WebElement configButton5 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"settingimageforTopClinic\"]")));
		configButton5.click();
		WebElement selectDate3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDateTopClinic\"]")));
		selectDate3.click();
		WebElement startDateInput5 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDateTopClinic\"]")));
		startDateInput5.clear();
		startDateInput5.sendKeys("2023-06-22");
		WebElement endDateInput5 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toDateTopClinic\"]")));
		endDateInput5.clear();
		endDateInput5.sendKeys("2023-07-06");
		driver.findElement(By.id("TopClinicDialog")).click();

		WebElement submitButton3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[14]/div[3]/div/button[1]")));
		submitButton3.click();
		WebElement configButton6 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("settingimageforPatientCls")));
		configButton6.click();
		WebElement startDateInput6 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromDatePatientCls\"]")));
		startDateInput6.clear();
		startDateInput6.sendKeys("2023-06-22");
		WebElement endDateInput6 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toDatePatientCls\"]")));
		endDateInput6.clear();
		endDateInput6.sendKeys("2023-07-06");

		driver.findElement(By.xpath("//*[@id=\"PatientClsDialog\"]/table/tbody/tr[10]/td")).click();
		driver.findElement(By.xpath("/html/body/div[11]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-21");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"DiseasesClsDialog\"]")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/button[1]")).click();

		// patient classification-----------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-21");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"DiseasesClsDialog\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"choseselectedphccenterforPatDiseases\"]")).click();
//    driver.findElement(By.xpath("//*[@id=\"K_00075\"]")).click();
		WebElement sbtClick8 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00077\"]")));
		sbtClick8.click();
		// *[@id="fromDateDiseasesCls"]

		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]/span")).click();

		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();
//    WebElement sbtClick2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")));
//    sbtClick2.click();

//    Configurations 3
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-25");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");

		driver.findElement(By.id("chooseAllPhcCenterforPatDiseases")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();

		// again for search clinic inside config3
		driver.findElement(By.xpath("//*[@id=\"settingimageforDiseasesCls\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateDiseasesCls\"]")).sendKeys("2023-06-25");

		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateDiseasesCls\"]")).sendKeys("2023-07-06");

		driver.findElement(By.id("choseselectedphccenterforPatDiseases")).click();
//    driver.findElement(By.cssSelector("//*[@id=\"K_00079\"]")).click();
		WebElement sbtClick9 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00077\"]")));
		sbtClick9.click();
		driver.findElement(By.xpath("//*[@id=\"exampleConsult_paginate\"]/span/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/button[1]/span")).click();

		// clinic performance----------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforConsultDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).sendKeys("2023-06-25");
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).sendKeys("2023-07-06");
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenter\"]")).click();
		driver.findElement(By.xpath("/html/body/div[17]/div[3]/div/button[1]")).click();
		// for select clinic
		driver.findElement(By.xpath("//*[@id=\"settingimageforConsultDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateConsultDet\"]")).sendKeys("2023-06-25");
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"toDateConsultDet\"]")).sendKeys("2023-07-06");

		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"choseselectedphccenter\"]"));
		element2.click();

		// Wait for the pop-up message and then hide it
		WebDriverWait alertWait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			alertWait3.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (TimeoutException e) {
			// Pop-up didn't appear within the timeout
			// Handle the exception or continue with the next steps
		}

		WebElement sbtClick10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00150\"]")));
		sbtClick10.click();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]/div/button[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[16]/div[3]/div/button[1]/span")).click();

		// clinic snapshot-------------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforMapDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chooseAllPhcCenterforClsSnp\"]")).click();
		driver.findElement(By.xpath("/html/body/div[19]/div[3]/div/button[1]")).click();

		// for search in clinic snapshot
		driver.findElement(By.xpath("//*[@id=\"settingimageforMapDet\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN_M\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"choseselectedphccenterClsSnp\"]")).click();
//  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"K_00079\"]"))).click();
		WebElement sbtClick11 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"exampleClsSnp\"]/tbody/tr[3]/td[1]")));
		sbtClick11.click();
		driver.findElement(By.xpath("/html/body/div[20]/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]/div/button[1]/span")).click();

		// for user activity status ----------------------------------------
		driver.findElement(By.xpath("//*[@id=\"settingimageforMA\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"fromDateEN\"]")).sendKeys("2023-07-10");
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[1]/span")).click();
		driver.quit();
	}
}

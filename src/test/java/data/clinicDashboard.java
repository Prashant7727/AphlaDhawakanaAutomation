package data;

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

public class clinicDashboard {

	@Test
	public  void clinicDashboard() {
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
				WebElement clinicDashboard = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"clinicAnalysis\"]")));
		clinicDashboard.click();

		///// CLINIC APP.......................

		// Total Consult...............................................
		WebElement heading = driver.findElement(By.cssSelector("h4[style='margin-bottom:0px!important;']"));
		WebElement settingIcon = heading.findElement(By.cssSelector("img#settingimageforDiseasesCls"));
		settingIcon.click();
		WebElement FromdateField = driver.findElement(By.id("fromDateDiseasesCls"));
		FromdateField.sendKeys("2023-06-21");
		WebElement TodateField = driver.findElement(By.id("toDateDiseasesCls"));
		TodateField.sendKeys("2023-07-10");
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButton.click();
		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("K_210812306231153232");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement GenerateExcelButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
		GenerateExcelButton.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement closebutton = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
		closebutton.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Total Patients...............................................
		WebElement heading1 = driver.findElement(By.cssSelector("#totalCount > div:nth-child(2) > div:nth-child(1)"));
		WebElement settingIcon1 = heading1.findElement(By.cssSelector("#settingimageforDiseasesCls"));
		settingIcon1.click();
		WebElement FromdateField1 = driver.findElement(By.id("fromDateDiseasesCls"));
		FromdateField1.clear();
		FromdateField1.sendKeys("2023-06-21");
		WebElement TodateField1 = driver.findElement(By.id("toDateDiseasesCls"));
		TodateField1.clear();
		TodateField1.sendKeys("2023-07-10");
		WebElement submitButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButton1.click();
		WebElement search1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search1.sendKeys("21081591687781805671");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement GenerateExcelButton1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
		GenerateExcelButton1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement closebutton1 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
		closebutton1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Leave Approved...............................................
		WebElement headingLP = driver.findElement(By.cssSelector("#totalCount > div:nth-child(3) > div:nth-child(1)"));
		WebElement settingIconLP = headingLP.findElement(By.cssSelector("#settingimageforDiseasesCls"));
		settingIconLP.click();
		WebElement FromdateFieldLP = driver.findElement(By.id("fromDateDiseasesCls"));
		FromdateFieldLP.clear();
		FromdateFieldLP.sendKeys("2023-06-18");
		WebElement TodateFieldLP = driver.findElement(By.id("toDateDiseasesCls"));
		TodateFieldLP.clear();
		TodateFieldLP.sendKeys("2023-07-13");
		WebElement submitButtonLP = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButtonLP.click();
		WebElement searchLP = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		searchLP.sendKeys("21081591687781805671");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement GenerateExcelButtonLP = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
		GenerateExcelButtonLP.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement closebuttonLP = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
		closebuttonLP.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Total Families..........................................................
		WebElement headingTF = driver.findElement(By.cssSelector("#totalCount > div:nth-child(4) > div:nth-child(1)"));
		WebElement SettingTF = headingTF.findElement(By.cssSelector("#settingimageforDiseasesCls"));
		SettingTF.click();
		WebElement FromdateFieldTF = driver.findElement(By.id("fromDateDiseasesCls"));
		FromdateFieldTF.clear();
		FromdateFieldTF.sendKeys("2023-06-18");
		WebElement TodateFieldTF = driver.findElement(By.id("toDateDiseasesCls"));
		TodateFieldTF.clear();
		TodateFieldTF.sendKeys("2023-07-13");
		WebElement submitButtonTF = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
		submitButtonTF.click();
		WebElement searchTF = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		searchTF.sendKeys("21081591687781805671");
		WebElement GenerateExcelButtonTF = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
		GenerateExcelButtonTF.click();
		WebElement closebuttonTF = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
		closebuttonTF.click();
		
		//...........patient.................................
				driver.findElement(By.id("appDataSessionId")).click();
				WebElement patientApp = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
				patientApp.click();
				
				// Total Consult...............................................
				WebElement patientheading = driver.findElement(By.cssSelector("h4[style='margin-bottom:0px!important;']"));
				WebElement patientsettingIcon = patientheading.findElement(By.cssSelector("img#settingimageforDiseasesCls"));
				patientsettingIcon.click();
				WebElement patientFromdateField = driver.findElement(By.id("fromDateDiseasesCls"));
				patientFromdateField.sendKeys("2023-06-21");
				WebElement patientTodateField = driver.findElement(By.id("toDateDiseasesCls"));
				patientTodateField.sendKeys("2023-07-10");
				WebElement patientsubmitButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButton.click();
				WebElement patientsearch = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				patientsearch.sendKeys("K_210812306231153232");
				WebElement patientGenerateExcelButton = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				patientGenerateExcelButton.click();
				WebElement patientclosebutton = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				patientclosebutton.click();

				// Total Patients...............................................
				WebElement patientheading1 = driver.findElement(By.cssSelector("#totalCount > div:nth-child(2) > div:nth-child(1)"));
				WebElement patientsettingIcon1 = patientheading1.findElement(By.cssSelector("#settingimageforDiseasesCls"));
				patientsettingIcon1.click();
				WebElement patientFromdateField1 = driver.findElement(By.id("fromDateDiseasesCls"));
				patientFromdateField1.clear();
				patientFromdateField1.sendKeys("2023-06-21");
				WebElement patientTodateField1 = driver.findElement(By.id("toDateDiseasesCls"));
				patientTodateField1.clear();
				patientTodateField1.sendKeys("2023-07-10");
				WebElement patientsubmitButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButton1.click();
				WebElement patientsearch1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				patientsearch1.sendKeys("21081591687781805671");
				WebElement patientGenerateExcelButton1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				patientGenerateExcelButton1.click();
				WebElement patientclosebutton1 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				patientclosebutton1.click();

				// Leave Approved...............................................
				WebElement patientheadingLP = driver.findElement(By.cssSelector("#totalCount > div:nth-child(3) > div:nth-child(1)"));
				WebElement patientsettingIconLP = patientheadingLP.findElement(By.cssSelector("#settingimageforDiseasesCls"));
				patientsettingIconLP.click();
				WebElement patientFromdateFieldLP = driver.findElement(By.id("fromDateDiseasesCls"));
				patientFromdateFieldLP.clear();
				patientFromdateFieldLP.sendKeys("2023-06-18");
				WebElement patientTodateFieldLP = driver.findElement(By.id("toDateDiseasesCls"));
				patientTodateFieldLP.clear();
				patientTodateFieldLP.sendKeys("2023-07-13");
				WebElement patientsubmitButtonLP = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButtonLP.click();
				WebElement patientsearchLP = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				patientsearchLP.sendKeys("21081591687781805671");
				WebElement patientGenerateExcelButtonLP = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				patientGenerateExcelButtonLP.click();
				WebElement patientclosebuttonLP = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				patientclosebuttonLP.click();

				// Total Families..........................................................
				WebElement patientheadingTF = driver.findElement(By.cssSelector("#totalCount > div:nth-child(4) > div:nth-child(1)"));
				WebElement patientSettingTF = patientheadingTF.findElement(By.cssSelector("#settingimageforDiseasesCls"));
				patientSettingTF.click();
				WebElement patientFromdateFieldTF = driver.findElement(By.id("fromDateDiseasesCls"));
				patientFromdateFieldTF.clear();
				patientFromdateFieldTF.sendKeys("2023-06-18");
				WebElement patientTodateFieldTF = driver.findElement(By.id("toDateDiseasesCls"));
				patientTodateFieldTF.clear();
				patientTodateFieldTF.sendKeys("2023-07-13");
				WebElement patientsubmitButtonTF = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				patientsubmitButtonTF.click();
				WebElement patientsearchTF = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				patientsearchTF.sendKeys("21081591687781805671");
				WebElement patientGenerateExcelButtonTF = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				patientGenerateExcelButtonTF.click();
				WebElement patientclosebuttonTF = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				patientclosebuttonTF.click();	
				
				//................both...............................
				driver.findElement(By.id("appDataSessionId")).click();
				WebElement both = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
				both.click();
				
				
				// Total Consult...............................................
				WebElement bothheading = driver.findElement(By.cssSelector("h4[style='margin-bottom:0px!important;']"));
				WebElement bothsettingIcon = bothheading.findElement(By.cssSelector("img#settingimageforDiseasesCls"));
				bothsettingIcon.click();
				WebElement bothFromdateField = driver.findElement(By.id("fromDateDiseasesCls"));
				bothFromdateField.sendKeys("2023-06-21");
				WebElement bothTodateField = driver.findElement(By.id("toDateDiseasesCls"));
				bothTodateField.sendKeys("2023-07-10");
				WebElement bothsubmitButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButton.click();
				WebElement bothsearch = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				bothsearch.sendKeys("K_210812306231153232");
				WebElement bothGenerateExcelButton = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				bothGenerateExcelButton.click();
				WebElement bothclosebutton = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				bothclosebutton.click();

				// Total Patients...............................................
				WebElement bothheading1 = driver.findElement(By.cssSelector("#totalCount > div:nth-child(2) > div:nth-child(1)"));
				WebElement bothsettingIcon1 = bothheading1.findElement(By.cssSelector("#settingimageforDiseasesCls"));
				bothsettingIcon1.click();
				WebElement bothFromdateField1 = driver.findElement(By.id("fromDateDiseasesCls"));
				bothFromdateField1.clear();
				bothFromdateField1.sendKeys("2023-06-21");
				WebElement bothTodateField1 = driver.findElement(By.id("toDateDiseasesCls"));
				bothTodateField1.clear();
				bothTodateField1.sendKeys("2023-07-10");
				WebElement bothsubmitButton1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButton1.click();
				WebElement bothsearch1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				bothsearch1.sendKeys("21081591687781805671");
				WebElement bothGenerateExcelButton1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				bothGenerateExcelButton1.click();
				WebElement bothclosebutton1 = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				bothclosebutton1.click();

				// Leave Approved...............................................
				WebElement bothheadingLP = driver.findElement(By.cssSelector("#totalCount > div:nth-child(3) > div:nth-child(1)"));
				WebElement bothsettingIconLP = bothheadingLP.findElement(By.cssSelector("#settingimageforDiseasesCls"));
				bothsettingIconLP.click();
				WebElement bothFromdateFieldLP = driver.findElement(By.id("fromDateDiseasesCls"));
				bothFromdateFieldLP.clear();
				bothFromdateFieldLP.sendKeys("2023-06-18");
				WebElement bothTodateFieldLP = driver.findElement(By.id("toDateDiseasesCls"));
				bothTodateFieldLP.clear();
				bothTodateFieldLP.sendKeys("2023-07-13");
				WebElement bothsubmitButtonLP = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButtonLP.click();
				WebElement bothsearchLP = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				bothsearchLP.sendKeys("21081591687781805671");
				WebElement bothGenerateExcelButtonLP = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				bothGenerateExcelButtonLP.click();
				WebElement bothclosebuttonLP = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				bothclosebuttonLP.click();

				// Total Families..........................................................
				WebElement bothheadingTF = driver.findElement(By.cssSelector("#totalCount > div:nth-child(4) > div:nth-child(1)"));
				WebElement bothSettingTF = bothheadingTF.findElement(By.cssSelector("#settingimageforDiseasesCls"));
				bothSettingTF.click();
				WebElement bothFromdateFieldTF = driver.findElement(By.id("fromDateDiseasesCls"));
				bothFromdateFieldTF.clear();
				bothFromdateFieldTF.sendKeys("2023-06-18");
				WebElement bothTodateFieldTF = driver.findElement(By.id("toDateDiseasesCls"));
				bothTodateFieldTF.clear();
				bothTodateFieldTF.sendKeys("2023-07-13");
				WebElement bothsubmitButtonTF = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/button[1]"));
				bothsubmitButtonTF.click();
				WebElement bothsearchTF = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
				bothsearchTF.sendKeys("21081591687781805671");
				WebElement bothGenerateExcelButtonTF = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"showButton\"]/div/input")));
				bothGenerateExcelButtonTF.click();
				WebElement bothclosebuttonTF = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button"));
				bothclosebuttonTF.click();
						
		
		
//		driver.quit();

	}
}
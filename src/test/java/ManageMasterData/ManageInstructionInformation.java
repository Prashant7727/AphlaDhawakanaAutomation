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

public class ManageInstructionInformation {

	@Test
	public void ManageInstructionInformation () {
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

		WebElement ManageInstructionInformation = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageInstructionInformation")));
		ManageInstructionInformation.click();
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

		WebElement InstructionName = wait.until(ExpectedConditions.elementToBeClickable(By.id("instructionName")));
		InstructionName.clear();
		InstructionName.sendKeys(
				"Eat a healthy breakfast every morning ( avoid eating toast /khari, pav along with tea) and drink water 3 ltr per day");

		driver.findElement(By.xpath("//*[@id=\"addInstructionInfo\"]/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();

		WebElement filePath = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/div[2]/input")).click();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("10120");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[4]/a")).click();

		WebElement EditInstructionName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Instruction_Name\"]")));
		EditInstructionName.clear();
		EditInstructionName.sendKeys(
				"Eat a healthy breakfast every morning ( avoid eating toast /khari, pav along with tea) and drink water 3 ltr per day00000000000000000000000");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateInstructionInfoData\"]/div/div[4]/a[1]")).click();

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

		WebElement InstructionName1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("instructionName")));
		InstructionName1.clear();
		InstructionName1.sendKeys(
				"Eat a healthy breakfast every morning ( avoid eating toast /khari, pav along with tea) and drink water 3 ltr per day");

		driver.findElement(By.xpath("//*[@id=\"addInstructionInfo\"]/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();

		WebElement filePath1 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/div[2]/input")).click();

		WebElement search1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search1.sendKeys("10120");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[4]/a")).click();

		WebElement EditInstructionName1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Instruction_Name\"]")));
		EditInstructionName1.clear();
		EditInstructionName1.sendKeys(
				"Eat a healthy breakfast every morning ( avoid eating toast /khari, pav along with tea) and drink water 3 ltr per day00000000000000000000000");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateInstructionInfoData\"]/div/div[4]/a[1]")).click();

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

		WebElement InstructionName2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("instructionName")));
		InstructionName2.clear();
		InstructionName2.sendKeys(
				"Eat a healthy breakfast every morning ( avoid eating toast /khari, pav along with tea) and drink water 3 ltr per day");

		driver.findElement(By.xpath("//*[@id=\"addInstructionInfo\"]/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")).click();

		WebElement filePath2 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath2.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

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
		search2.sendKeys("10120");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[4]/a")).click();

		WebElement EditInstructionName2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Instruction_Name\"]")));
		EditInstructionName2.clear();
		EditInstructionName2.sendKeys(
				"Eat a healthy breakfast every morning ( avoid eating toast /khari, pav along with tea) and drink water 3 ltr per day00000000000000000000000");

		driver.findElement(By.xpath("//*[@id=\"Status\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Status\"]/option[2]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateInstructionInfoData\"]/div/div[4]/a[1]")).click();
		
		driver.quit();

	}

}
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

public class ManageCamChiefComplain {

	@Test
	public void ManageCamChiefComplain () {
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

		WebElement ManageCamChiefComplain = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageCamChiefComplain")));
		ManageCamChiefComplain.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		WebElement filePath = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("15602");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		WebElement SymptomName = wait.until(ExpectedConditions.elementToBeClickable(By.id("Symptom_Name")));
		SymptomName.clear();
		SymptomName.sendKeys("clinic inventory report 111");

		driver.findElement(By.xpath("//*[@id=\"updateSymptom\"]/div/div[3]/a[1]")).click();
		driver.navigate().back();

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
		WebElement patientfilePath = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		patientfilePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();

		WebElement patientsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		patientsearch.sendKeys("15602");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		WebElement patientSymptomName = wait.until(ExpectedConditions.elementToBeClickable(By.id("Symptom_Name")));
		patientSymptomName.clear();
		patientSymptomName.sendKeys("clinic inventory report 111");

		driver.findElement(By.xpath("//*[@id=\"updateSymptom\"]/div/div[3]/a[1]")).click();
		driver.navigate().back();

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
		WebElement bothfilePath = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		bothfilePath.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();

		WebElement bothsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		bothsearch.sendKeys("15602");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[3]/a")).click();

		WebElement bothSymptomName = wait.until(ExpectedConditions.elementToBeClickable(By.id("Symptom_Name")));
		bothSymptomName.clear();
		bothSymptomName.sendKeys("clinic inventory report 111");

		driver.findElement(By.xpath("//*[@id=\"updateSymptom\"]/div/div[3]/a[1]")).click();
		driver.navigate().back();
		
		driver.quit();

	}

}

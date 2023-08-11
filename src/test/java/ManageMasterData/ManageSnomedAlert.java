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

public class ManageSnomedAlert {

	@Test
	public void ManageSnomedAlert () {
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

		WebElement ManageSnomedAlert = wait.until(ExpectedConditions.elementToBeClickable(By.id("manageSnomedAlert")));
		ManageSnomedAlert.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		WebElement ConceptId = wait.until(ExpectedConditions.elementToBeClickable(By.id("conceptid")));
		ConceptId.sendKeys("101010");

		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();

		WebElement MinAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("minAgeGroup1")));
		MinAgeGroup1.sendKeys("20");

		WebElement MaxAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxAgeGroup1")));
		MaxAgeGroup1.sendKeys("40");

		WebElement MinAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("minAgeGroup2")));
		MinAgeGroup2.sendKeys("25");

		WebElement MaxAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxAgeGroup2")));
		MaxAgeGroup2.sendKeys("35");

		WebElement Message = wait.until(ExpectedConditions.elementToBeClickable(By.id("message")));
		Message.sendKeys("hyy this first msg");

		driver.findElement(By.xpath("//*[@id=\"addSnomedAlert\"]/div/div[8]/input")).click();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("101010");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[7]/a")).click();

		WebElement EditConceptId = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateconceptid")));
		EditConceptId.clear();
		EditConceptId.sendKeys("1010001");

		driver.findElement(By.xpath("//*[@id=\"updategender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"updategender\"]/option[3]")).click();

		WebElement EditMinAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateminAgeGroup1")));
		EditMinAgeGroup1.clear();
		EditMinAgeGroup1.sendKeys("30");

		WebElement EditMaxAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("updatemaxAgeGroup1")));
		EditMaxAgeGroup1.clear();
		EditMaxAgeGroup1.sendKeys("50");

		WebElement EditMinAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateminAgeGroup2")));
		EditMinAgeGroup2.clear();
		EditMinAgeGroup2.sendKeys("26");

		WebElement EditMaxAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("updatemaxAgeGroup2")));
		EditMaxAgeGroup2.clear();
		EditMaxAgeGroup2.sendKeys("37");

		WebElement EditMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("updatemessage")));
		EditMessage.clear();
		EditMessage.sendKeys("hyy this first msg..........");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateSnomedAlert\"]/div/div[8]/a[1]")).click();

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

		WebElement patientConceptId = wait.until(ExpectedConditions.elementToBeClickable(By.id("conceptid")));
		patientConceptId.sendKeys("101010");

		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();

		WebElement patientMinAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("minAgeGroup1")));
		patientMinAgeGroup1.sendKeys("20");

		WebElement patientMaxAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxAgeGroup1")));
		patientMaxAgeGroup1.sendKeys("40");

		WebElement patientMinAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("minAgeGroup2")));
		patientMinAgeGroup2.sendKeys("25");

		WebElement patientMaxAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxAgeGroup2")));
		patientMaxAgeGroup2.sendKeys("35");

		WebElement patientMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("message")));
		patientMessage.sendKeys("hyy this first msg");

		driver.findElement(By.xpath("//*[@id=\"addSnomedAlert\"]/div/div[8]/input")).click();

		WebElement patientsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		patientsearch.sendKeys("101010");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[7]/a")).click();

		WebElement patientEditConceptId = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateconceptid")));
		patientEditConceptId.clear();
		patientEditConceptId.sendKeys("1010001");

		driver.findElement(By.xpath("//*[@id=\"updategender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"updategender\"]/option[3]")).click();

		WebElement patientEditMinAgeGroup1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateminAgeGroup1")));
		patientEditMinAgeGroup1.clear();
		patientEditMinAgeGroup1.sendKeys("30");

		WebElement patientEditMaxAgeGroup1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updatemaxAgeGroup1")));
		patientEditMaxAgeGroup1.clear();
		patientEditMaxAgeGroup1.sendKeys("50");

		WebElement patientEditMinAgeGroup2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateminAgeGroup2")));
		patientEditMinAgeGroup2.clear();
		patientEditMinAgeGroup2.sendKeys("26");

		WebElement patientEditMaxAgeGroup2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updatemaxAgeGroup2")));
		patientEditMaxAgeGroup2.clear();
		patientEditMaxAgeGroup2.sendKeys("37");

		WebElement patientEditMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("updatemessage")));
		patientEditMessage.clear();
		patientEditMessage.sendKeys("hyy this first msg..........");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateSnomedAlert\"]/div/div[8]/a[1]")).click();

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

		WebElement bothConceptId = wait.until(ExpectedConditions.elementToBeClickable(By.id("conceptid")));
		bothConceptId.sendKeys("101010");

		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();

		WebElement bothMinAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("minAgeGroup1")));
		bothMinAgeGroup1.sendKeys("20");

		WebElement bothMaxAgeGroup1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxAgeGroup1")));
		bothMaxAgeGroup1.sendKeys("40");

		WebElement bothMinAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("minAgeGroup2")));
		bothMinAgeGroup2.sendKeys("25");

		WebElement bothMaxAgeGroup2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("maxAgeGroup2")));
		bothMaxAgeGroup2.sendKeys("35");

		WebElement bothMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("message")));
		bothMessage.sendKeys("hyy this first msg");

		driver.findElement(By.xpath("//*[@id=\"addSnomedAlert\"]/div/div[8]/input")).click();

		WebElement bothsearch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		bothsearch.sendKeys("101010");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[7]/a")).click();

		WebElement bothEditConceptId = wait.until(ExpectedConditions.elementToBeClickable(By.id("updateconceptid")));
		bothEditConceptId.clear();
		bothEditConceptId.sendKeys("1010001");

		driver.findElement(By.xpath("//*[@id=\"updategender\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"updategender\"]/option[3]")).click();

		WebElement bothEditMinAgeGroup1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateminAgeGroup1")));
		bothEditMinAgeGroup1.clear();
		bothEditMinAgeGroup1.sendKeys("30");

		WebElement bothEditMaxAgeGroup1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updatemaxAgeGroup1")));
		bothEditMaxAgeGroup1.clear();
		bothEditMaxAgeGroup1.sendKeys("50");

		WebElement bothEditMinAgeGroup2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updateminAgeGroup2")));
		bothEditMinAgeGroup2.clear();
		bothEditMinAgeGroup2.sendKeys("26");

		WebElement bothEditMaxAgeGroup2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updatemaxAgeGroup2")));
		bothEditMaxAgeGroup2.clear();
		bothEditMaxAgeGroup2.sendKeys("37");

		WebElement bothEditMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("updatemessage")));
		bothEditMessage.clear();
		bothEditMessage.sendKeys("hyy this first msg..........");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"updateSnomedAlert\"]/div/div[8]/a[1]")).click();

		
		driver.quit();
	}

}

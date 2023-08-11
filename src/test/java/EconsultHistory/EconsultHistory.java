package EconsultHistory;

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

public class EconsultHistory {

	@Test
	public  void EconsultHistory() {
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
		
		WebElement EconsultHistory = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"totalRegPatient\"]")));
		EconsultHistory.click();

		// ................................clinic..................................
		driver.findElement(By.xpath("//*[@id=\"selectPhcId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectPhcId\"]/option[2]")).click();
		driver.findElement(By.id("selectSubCenterId")).click();
		driver.findElement(By.xpath("//*[@id=\"selectSubCenterId\"]/option[4]")).click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement inputField = driver.findElement(By.xpath("//*[@id=\"searchBox\"]"));
		inputField.sendKeys("Nazan");
		WebElement searchBtn = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[2]/div/div[2]/div[1]")));
		searchBtn.click();
		WebElement showAllBtn = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[2]/div/div[2]/div[2]")));
		showAllBtn.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"docDropDown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"docDropDown\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusDropDown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusDropDown\"]/option[3]")).click();

		WebElement showAllBtn1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("showall")));
		showAllBtn1.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ..........................patient......................................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"selectPhcId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectPhcId\"]/option[2]")).click();
		driver.findElement(By.id("selectSubCenterId")).click();
		driver.findElement(By.xpath("//*[@id=\"selectSubCenterId\"]/option[4]")).click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement inputField1 = driver.findElement(By.xpath("//*[@id=\"searchBox\"]"));
		inputField1.sendKeys("Nazan");
		WebElement searchBtn1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[2]/div/div[2]/div[1]")));
		searchBtn1.click();
		WebElement showAllBtn11 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[2]/div/div[2]/div[2]")));
		showAllBtn11.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"docDropDown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"docDropDown\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusDropDown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusDropDown\"]/option[3]")).click();

		WebElement showAllBtn12 = wait.until(ExpectedConditions.elementToBeClickable(By.id("showall")));
		showAllBtn12.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// .....................both..............................................
		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"selectPhcId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectPhcId\"]/option[2]")).click();
		driver.findElement(By.id("selectSubCenterId")).click();
		driver.findElement(By.xpath("//*[@id=\"selectSubCenterId\"]/option[4]")).click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement inputField12 = driver.findElement(By.xpath("//*[@id=\"searchBox\"]"));
		inputField12.sendKeys("Nazan");
		WebElement searchBtn12 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[2]/div/div[2]/div[1]")));
		searchBtn12.click();
		WebElement showAllBtn111 = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[2]/div/div[2]/div[2]")));
		showAllBtn111.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"docDropDown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"docDropDown\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusDropDown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"statusDropDown\"]/option[3]")).click();

		WebElement showAllBtn13 = wait.until(ExpectedConditions.elementToBeClickable(By.id("showall")));
		showAllBtn13.click();
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}

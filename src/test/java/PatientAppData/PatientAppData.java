package PatientAppData;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class PatientAppData {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
				WebElement UpdateConsultInfo = wait.until(ExpectedConditions.elementToBeClickable(By.id("patientAppData")));
		UpdateConsultInfo.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.id("zoomOut")).click();
		driver.findElement(By.xpath("//*[@id=\"zoomOut\"]/option[2]")).click();

		driver.findElement(By.id("zoomIn")).click();
		driver.findElement(By.xpath("//*[@id=\"zoomIn\"]/option[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"storeMapFocusLevel\"]/div/div[3]/input")).click();

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

		driver.findElement(By.id("zoomOut")).click();
		driver.findElement(By.xpath("//*[@id=\"zoomOut\"]/option[2]")).click();

		driver.findElement(By.id("zoomIn")).click();
		driver.findElement(By.xpath("//*[@id=\"zoomIn\"]/option[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"storeMapFocusLevel\"]/div/div[3]/input")).click();

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

		driver.findElement(By.id("zoomOut")).click();
		driver.findElement(By.xpath("//*[@id=\"zoomOut\"]/option[2]")).click();

		driver.findElement(By.id("zoomIn")).click();
		driver.findElement(By.xpath("//*[@id=\"zoomIn\"]/option[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"storeMapFocusLevel\"]/div/div[3]/input")).click();
		driver.quit();
	}

}

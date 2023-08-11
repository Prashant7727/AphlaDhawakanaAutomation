package PHCProductManagement;

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

public class PHCProductManagement {

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
				WebElement ProductManagemnet = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[13]/div[1]/a")));
		ProductManagemnet.click();
		WebElement MasterProductManagemnet = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"productManagement\"]/ul/li[2]")));
		MasterProductManagemnet.click();

		// ................................clinic..................................
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")));
		selectClinic.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search.sendKeys("KID_PRD_0089997");

		WebElement slot = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"KID_PRD_0089997slot\"]")));
		slot.click();
		slot.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/label/span[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td[5]/label/span[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")));
		selectClinic1.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search1 = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search1.sendKeys("KID_PRD_0089997");

		WebElement slot1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"KID_PRD_0089997slot\"]")));
		slot1.click();
		slot1.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/label/span[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td[5]/label/span[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();

		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();
		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")));
		selectClinic2.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search2 = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search2.sendKeys("KID_PRD_0089997");

		WebElement slot11 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"KID_PRD_0089997slot\"]")));
		slot11.click();
		slot11.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[5]/label/span[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td[5]/label/span[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

	}

}

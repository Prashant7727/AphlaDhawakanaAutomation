package ManageMasterData;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class Diagnosis {

	@Test
	public void Diagnosis () {
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
				WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement Diagnosis = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageDiagnosis\"]")));
		Diagnosis.click();

		// Diagnosis---------------
		driver.findElement(By.linkText("Add Diagnosis")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
//        driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")).click();

		WebElement edit = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#example > tbody > tr:nth-child(1) > td:nth-child(4) > a")));
		edit.click();
		driver.findElement(By.id("Diagnosis_Name")).clear();
		driver.findElement(By.id("Diagnosis_Name")).sendKeys("Abnormal and pelvic pain");
//        driver.findElement(By.id("categoryName")).click();
		driver.findElement(By.linkText("Save")).click();

		// both-------------*****************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();

		// Diagnosis---------------
		driver.findElement(By.linkText("Add Diagnosis")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
//        driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")).click();

		WebElement edit1 = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#example > tbody > tr:nth-child(1) > td:nth-child(4) > a")));
		edit1.click();
		driver.findElement(By.id("Diagnosis_Name")).clear();
		driver.findElement(By.id("Diagnosis_Name")).sendKeys("Abnormal and pelvic pain");
//        driver.findElement(By.id("categoryName")).click();
		driver.findElement(By.linkText("Save")).click();

		// patient---------------------*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();

		// Diagnosis---------------
		driver.findElement(By.linkText("Add Diagnosis")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
//        driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")).click();

		WebElement edit2 = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#example > tbody > tr:nth-child(1) > td:nth-child(4) > a")));
		edit2.click();
		driver.findElement(By.id("Diagnosis_Name")).clear();
		driver.findElement(By.id("Diagnosis_Name")).sendKeys("Abnormal and pelvic pain");
//        driver.findElement(By.id("categoryName")).click();
		driver.findElement(By.linkText("Save")).click();
		driver.quit();
	}

}

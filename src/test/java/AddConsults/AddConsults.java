package AddConsults;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class AddConsults {
	
	@Test
	public void addConsults() {
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
		WebElement AddConsults = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addConsults\"]")));
		AddConsults.click();

		// search Patient ................
		WebElement search1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search1.sendKeys("1369283612");

//		//click Add Consult button
		driver.findElement(By.linkText("Add Consult")).click();
		driver.findElement(By.id("date")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".col-sm-6 > .btn"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector(".col-sm-6 > .btn")).click();

		// camera allow

		// Switch to the popup window
//	     Robot robot = new Robot();
//	     robot.keyPress(KeyEvent.VK_TAB);
//	     robot.keyRelease(KeyEvent.VK_TAB);
//	     robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);

//	     {
//	       WebElement element = driver.findElement(By.tagName("body"));
//	       Actions builder = new Actions(driver);
//	       builder.moveToElement(element, 0, 0).perform();
//	     }

		driver.findElement(By.cssSelector(".modal-footer > button:nth-child(1)")).click();
		driver.findElement(By.id("USER_FIRST_NAME")).click();
		driver.findElement(By.id("age")).click();
		driver.findElement(By.id("age")).sendKeys("22");
		driver.findElement(By.id("MARITAL_STATUS")).click();
		{
			WebElement dropdown = driver.findElement(By.id("MARITAL_STATUS"));
			dropdown.findElement(By.xpath("//option[. = 'Single']")).click();
		}
		driver.findElement(By.id("PREGNANCY_STATUS")).click();
		driver.findElement(By.id("NUMOF_CHILDRENS")).click();
		driver.findElement(By.id("ANNUAL_INCOME")).click();
		driver.findElement(By.id("ANNUAL_INCOME")).sendKeys("1200000");
		driver.findElement(By.id("AADHAR_UID")).click();
		driver.findElement(By.id("AADHAR_UID")).sendKeys("4758735463376387");
		driver.findElement(By.id("BPLCARD_NUMBER")).click();
		driver.findElement(By.id("BPLCARD_NUMBER")).sendKeys("734578367527");
		driver.findElement(By.id("qualification")).click();
		{
			WebElement dropdown = driver.findElement(By.id("qualification"));
			dropdown.findElement(By.xpath("//option[. = 'Graduate']")).click();
		}
		driver.findElement(By.id("MOBILE_COUNTRY_CODE")).click();
		driver.findElement(By.id("MOBILE_COUNTRY_CODE")).sendKeys("9198");
		driver.findElement(By.id("CONTACT_NUMBER")).click();
		driver.findElement(By.id("CONTACT_NUMBER")).sendKeys("3453287627");
		driver.findElement(By.linkText("Patient Health Information")).click();
		driver.findElement(By.id("systolic")).click();
		driver.findElement(By.id("systolic")).sendKeys("23");
		driver.findElement(By.id("diastolic")).click();
		driver.findElement(By.id("diastolic")).sendKeys("12");
		driver.findElement(By.id("pulse")).click();
		driver.findElement(By.id("pulse")).sendKeys("14");
		driver.findElement(By.id("height")).click();
		driver.findElement(By.cssSelector("html")).click();
		driver.findElement(By.id("height")).sendKeys("117");
		driver.findElement(By.id("weight")).click();
		driver.findElement(By.id("weight")).sendKeys("67");
		driver.findElement(By.id("spo2")).click();
		driver.findElement(By.id("spo2")).sendKeys("14");
		driver.findElement(By.id("bodyTemperature")).click();
		driver.findElement(By.id("bodyTemperature")).sendKeys("17");
		driver.findElement(By.cssSelector("#two .row:nth-child(3) > .col-sm-12")).click();
		driver.findElement(By.id("respiratoryRate")).sendKeys("76");
		driver.findElement(By.id("BGRandom")).click();
		driver.findElement(By.id("BGRandom")).sendKeys("43");
		driver.findElement(By.id("hemoglobin")).click();
		driver.findElement(By.id("hemoglobin")).sendKeys("122");
		driver.findElement(By.id("WAISTCIRCUM")).click();
		driver.findElement(By.id("WAISTCIRCUM")).sendKeys("23");
		driver.findElement(By.id("HEAD_CIRCUM")).click();
		driver.findElement(By.id("HEAD_CIRCUM")).sendKeys("46");
		driver.findElement(By.id("GLUCOSE")).click();
		driver.findElement(By.id("GLUCOSE")).sendKeys("87");
		driver.findElement(By.id("MUAC")).click();
		driver.findElement(By.id("MUAC")).sendKeys("34");
		driver.findElement(By.id("file")).click();
		driver.findElement(By.id("file")).sendKeys("C:\\fakepath\\Screenshot (4).png");
		driver.findElement(By.linkText("Upload")).click();

	}
}
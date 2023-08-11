package UpdatePatientContent;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class UpdatePatientContent {

	@Test
	public  void UpdatePatientContent() {
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
		WebElement UpdatePatientContent = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("updatePatientContent")));
		UpdatePatientContent.click();

		// ................................clinic..................................
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[1]/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		WebElement ContentText = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contentText\"]")));
		ContentText.sendKeys(
				"Now, this input can be entered with the help of sendKeys(“input_text”) method in Selenium Webdriver.");

		driver.findElement(By.xpath("//*[@id=\"ContentType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ContentType\"]/option[3]")).click();

		WebElement ContentWebURL = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contentWebUrl\"]")));
		ContentWebURL.sendKeys("https://medlineplus.gov/encyclopedia.html");
		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[4]")).click();

		WebElement Question = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question.sendKeys("The injection of anti-toxin is given to prevent");

		WebElement Answer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer.sendKeys("Tetanus");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();
		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[3]")).click();

		WebElement Question1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question1.sendKeys("Who is considered the father of Surgery?");

		WebElement Answer1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer1.sendKeys("Susruta");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();

		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[2]")).click();

		WebElement Question3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question3.sendKeys("Who invented chloroform as anaesthetic?");

		WebElement Answer3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer3.sendKeys("James Simpson");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"1\"]/i")).click();

//		driver.findElement(By.xpath("//*[@id=\"add\"]/div/div/div/div[2]/div[2]/div/a[2]")).click();

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
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[1]/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		WebElement ContentText1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contentText\"]")));
		ContentText1.sendKeys(
				"Now, this input can be entered with the help of sendKeys(“input_text”) method in Selenium Webdriver.");

		driver.findElement(By.xpath("//*[@id=\"ContentType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ContentType\"]/option[3]")).click();

		WebElement ContentWebURL1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contentWebUrl\"]")));
		ContentWebURL1.sendKeys("https://medlineplus.gov/encyclopedia.html");
		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[4]")).click();

		WebElement Question11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question11.sendKeys("The injection of anti-toxin is given to prevent");

		WebElement Answer11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer11.sendKeys("Tetanus");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();
		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[3]")).click();

		WebElement Question111 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question111.sendKeys("Who is considered the father of Surgery?");

		WebElement Answer111 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer111.sendKeys("Susruta");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();

		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[2]")).click();

		WebElement Question31 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question31.sendKeys("Who invented chloroform as anaesthetic?");

		WebElement Answer31 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer31.sendKeys("James Simpson");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"1\"]/i")).click();

//			driver.findElement(By.xpath("//*[@id=\"add\"]/div/div/div/div[2]/div[2]/div/a[2]")).click();

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
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/div/div/div/div[1]/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\"file\"]"))
		.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		WebElement ContentTextboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contentText\"]")));
		ContentTextboth.sendKeys(
				"Now, this input can be entered with the help of sendKeys(“input_text”) method in Selenium Webdriver.");

		driver.findElement(By.xpath("//*[@id=\"ContentType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ContentType\"]/option[3]")).click();

		WebElement ContentWebURLboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contentWebUrl\"]")));
		ContentWebURLboth.sendKeys("https://medlineplus.gov/encyclopedia.html");
		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[4]")).click();

		WebElement Questionboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Questionboth.sendKeys("The injection of anti-toxin is given to prevent");

		WebElement Answerboth = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answerboth.sendKeys("Tetanus");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();
		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[3]")).click();

		WebElement Question1both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question1both.sendKeys("Who is considered the father of Surgery?");

		WebElement Answer1both = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer1both.sendKeys("Susruta");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();

		// ...
		driver.findElement(By.xpath("//*[@id=\"questionType\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionType\"]/option[2]")).click();

		WebElement Question3both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Question\"]")));
		Question3both.sendKeys("Who invented chloroform as anaesthetic?");

		WebElement Answer3both = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Answer\"]")));
		Answer3both.sendKeys("James Simpson");

		driver.findElement(By.xpath("//*[@id=\"createContent\"]/div[5]/div/div[3]/div[5]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"1\"]/i")).click();

		driver.findElement(By.xpath("//*[@id=\"add\"]/div/div/div/div[2]/div[2]/div/a[2]")).click();
		driver.quit();
	}

}

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

public class Immunizations {

	@Test
	public void Immunizations () {
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
		WebElement Immunizations = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageImmunizations\"]")));
		Immunizations.click();

		// Immunizations------------------------------
		driver.findElement(By.linkText("Add")).click();
		driver.findElement(By.id("immunizationName")).click();
		driver.findElement(By.id("immunizationName")).sendKeys("Demo777");
		driver.findElement(By.id("startDuration")).click();
		driver.findElement(By.id("startDuration")).sendKeys("1");
		driver.findElement(By.id("endDuration")).click();
		driver.findElement(By.id("endDuration")).sendKeys("3");
		driver.findElement(By.id("durationType")).click();
		{
			WebElement dropdown = driver.findElement(By.id("durationType"));
			dropdown.findElement(By.xpath("//option[. = 'WEEK']")).click();
		}
		driver.findElement(By.id("immunizationType")).click();
		{
			WebElement dropdown = driver.findElement(By.id("immunizationType"));
			dropdown.findElement(By.xpath("//option[. = 'ORAL']")).click();
		}
		driver.findElement(By.id("stringDuration")).click();
		driver.findElement(By.id("stringDuration")).sendKeys("1");
		driver.findElement(By.id("dose")).click();
		driver.findElement(By.id("dose")).sendKeys("2");
		driver.findElement(By.id("route")).click();
		driver.findElement(By.id("route")).sendKeys("1");
		driver.findElement(By.cssSelector(".row:nth-child(2) .btn")).click();
		driver.findElement(By.id("site")).click();
		driver.findElement(By.id("site")).sendKeys("aaa");
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		driver.findElement(By.linkText("Cancel")).click();

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[11]/a")).click();

		WebElement ImmunizationName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Immunization_Name\"]")));
		ImmunizationName.clear();
		ImmunizationName.sendKeys("BCG");
		driver.findElement(By.xpath("//*[@id=\"updateImmunization\"]/div/div[10]/a[1]")).click();

		
		
		driver.quit();
	}

}

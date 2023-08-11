package Reports;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class CatchmentReport {
@Test
	public void CatchmentReport() {
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
				WebElement reports = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[4]/div[1]/a")));
		reports.click();
		WebElement CatchmentReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"four\"]/ul/li[25]")));
		CatchmentReport.click();

		// CatchMent Report--------------------
		WebElement SearchInput = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"populationtab_filter\"]/label/input")));
		SearchInput.sendKeys("aaaa");

		// both***************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		// CatchMent Report--------------------
		WebElement SearchInput1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"populationtab_filter\"]/label/input")));
		SearchInput1.sendKeys("aaaa");

		// patient*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// CatchMent Report--------------------
		WebElement SearchInput2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"populationtab_filter\"]/label/input")));
		SearchInput2.sendKeys("aaaa");

		
		driver.quit();
	}

}

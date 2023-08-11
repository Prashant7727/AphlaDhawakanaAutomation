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

public class ViewHealthHazardImages {
@Test
	public void ViewHealthHazardImages() {
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
		//        driver.quit();
		WebElement reports = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[4]/div[1]/a")));
		reports.click();
		WebElement ViewHealthHazardImages = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"viewImageLink\"]")));
		ViewHealthHazardImages.click();

		// Total Balance Stock Report--------------------

		WebElement remark = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NOTE12452\"]")));
		remark.sendKeys("abcd");

		driver.findElement(By.xpath("//*[@id=\"status12452\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"status12452\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile12452\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"addStatusForm12452\"]/div/div[4]/div/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"12452\"]/i")).click();

		WebElement remove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"12452\"]/i")));
		remove.click();

		// both**************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		// Total Balance Stock Report--------------------

		WebElement remark1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NOTE12452\"]")));
		remark1.sendKeys("abcd");

		driver.findElement(By.xpath("//*[@id=\"status12452\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"status12452\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile12452\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"addStatusForm12452\"]/div/div[4]/div/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"12452\"]/i")).click();

		WebElement remove1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"12452\"]/i")));
		remove1.click();

		// patient*******************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// Total Balance Stock Report--------------------

		WebElement remark2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"NOTE12452\"]")));
		remark2.sendKeys("abcd");

		driver.findElement(By.xpath("//*[@id=\"status12452\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"status12452\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile12452\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"addStatusForm12452\"]/div/div[4]/div/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"12452\"]/i")).click();

		WebElement remove2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"12452\"]/i")));
		remove2.click();
		
		driver.quit();

	}

}

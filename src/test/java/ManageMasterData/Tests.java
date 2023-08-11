package ManageMasterData;

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

public class Tests {

	@Test
	public void Tests () {
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
		// driver.quit();
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement Tests = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageTests\"]")));
		Tests.click();

		// Tests---------------
		driver.findElement(By.linkText("Add Tests")).click();

		driver.findElement(By.id("testCode")).click();
		driver.findElement(By.id("testCode")).sendKeys("1111");
		driver.findElement(By.id("testName")).click();
		driver.findElement(By.id("testName")).sendKeys("demo777");
//        driver.findElement(By.id("file")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		driver.findElement(By.cssSelector("#downloadTestFile > .btn")).click();
		driver.findElement(By.linkText("Save")).click();
		driver.findElement(By.cssSelector("label > input")).click();
		driver.findElement(By.cssSelector("#updateRefListForm > a")).click();

		driver.findElement(By.cssSelector("label > input")).sendKeys("demo777");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[15]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"Test_Name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Test_Name\"]")).sendKeys("demo77777");

		driver.findElement(By.xpath("//*[@id=\"updateTest\"]/div/div[13]/a[1]")).click();
		
		driver.quit();

	}

}

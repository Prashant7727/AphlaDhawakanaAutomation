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

public class FamailyCategoryReason {
	
	@Test
	public void FamailyCategoryReason () {
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
				// Delay for 2 seconds
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// driver.quit();
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement Upload = wait.until(ExpectedConditions.elementToBeClickable(By.id("manageReasons")));
		Upload.click();

		WebElement addcat = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div/div[2]/a")));
		addcat.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		WebElement click = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")));
		click.click();
		
		driver.quit();

	}
}

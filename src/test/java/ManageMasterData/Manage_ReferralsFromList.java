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

public class Manage_ReferralsFromList {

	@Test
	public void Manage_ReferralsFromList () {

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
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Manage Master Data")));
		ManageMasterData.click();

		WebElement manageReferralFromList = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageReferralFromList")));
		manageReferralFromList.click();

		WebElement add = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div/div[2]/a")));
		add.click();

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div/div[2]/a"))
				.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement seatrch = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		seatrch.click();
		seatrch.sendKeys("10000");

		WebElement edite = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
		edite.click();

		driver.findElement(By.id("editRefName")).click();
		driver.findElement(By.id("editRefName")).clear();
		driver.findElement(By.id("editRefName")).sendKeys("DGD");

		driver.findElement(By.id("editRefName")).click();
		driver.findElement(By.id("editRefName")).clear();
		driver.findElement(By.id("editRefName")).sendKeys("FROM");

		WebElement save = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateReferralOption\"]/div/div[3]/a[1]")));
		save.click();

		
		driver.quit();
	}
}

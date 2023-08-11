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

public class Manage_Referral_Reason {

	@Test
	public void Manage_Referral_Reason () {

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

		WebElement manageReferralReason = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageReferralReason")));
		manageReferralReason.click();

		WebElement addArea = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("#blockDiv > div.card-heading > div.col-sm-6.col-xs-12.text-right > a")));
		addArea.click();

		driver.findElement(By.id("referralOption")).click();
		driver.findElement(By.id("referralOption")).sendKeys("Consultation (Other Govt)");

		driver.findElement(By.xpath("//*[@id=\"addReferralReason\"]/div/div[2]/a")).click();

		driver.findElement(By.id("file")).sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");

		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();
		driver.navigate().back();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement edite = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")));
		edite.click();

		WebElement referralOPtionU = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("referralOPtionU")));
		referralOPtionU.click();
		referralOPtionU.clear();
		referralOPtionU.sendKeys("Consultation (Other Govt)");

		driver.findElement(By.xpath("//*[@id=\"updateReferralOption\"]/div/div[2]/a[1]")).click();
		
		driver.quit();

	}
}

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

public class manage_Speciality {

	@Test
	public void manage_Speciality () {

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
				.until(ExpectedConditions.elementToBeClickable(By.id("manageSpeciality")));
		manageReferralReason.click();

		WebElement addSpeciality = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		addSpeciality.click();

		driver.findElement(By.id("specialityName")).click();
		driver.findElement(By.id("specialityName")).sendKeys("Orthopedic");

		driver.findElement(By.xpath("//*[@id=\"addSpeciality\"]/div/div[2]/input")).click();

		driver.findElement(By.id("file")).sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.cssSelector("#updateRefListForm > input.btn.btn-primary.submitbtn")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//
//		WebElement search = wait.until(
//				ExpectedConditions.elementToBeClickable(By.cssSelector("#example_filter > label > input[type=text]")));
//		search.click();
//		search.sendKeys("Orthopedic");

		// edites
		WebElement edite = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[17]/td[3]/a")));
		edite.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement specialityNameU = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("specialityNameU")));
		specialityNameU.click();
		specialityNameU.clear();
		specialityNameU.sendKeys("Orthopedic123456");

		driver.findElement(By.id("//*[@id=\"updateSpeciality\"]/div/div[2]/a[1]")).click();
		
		driver.quit();

	}
}

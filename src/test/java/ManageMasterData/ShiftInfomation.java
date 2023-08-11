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

public class ShiftInfomation {

	@Test
	public void ShiftInfomation () {

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

		WebElement manageShiftInformation = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageShiftInformation")));
		manageShiftInformation.click();

		WebElement addshift = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		addshift.click();

		driver.findElement(By.id("shiftId")).click();
		driver.findElement(By.id("shiftId")).sendKeys("4");

		driver.findElement(By.id("shiftName")).click();
		WebElement shiftname = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(2)")));
		shiftname.click();

		// driver.findElement(By.id("//*[@id=\"ui-id-1\"]/li[2]")).click();

		driver.findElement(By.id("startTime")).click();
		driver.findElement(By.id("startTime")).sendKeys("18:36");

		driver.findElement(By.id("endTime")).click();
		driver.findElement(By.id("endTime")).sendKeys("21:36");

		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement search = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("#example_filter > label > input[type=text]")));
		search.click();

		WebElement edite = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[5]/a")));
		edite.click();

		driver.findElement(By.id("shiftNameU")).click();
		driver.findElement(By.id("shiftNameU")).clear();
		driver.findElement(By.id("shiftNameU")).sendKeys("s1");

		driver.findElement(By.id("startTimeU")).click();
		driver.findElement(By.id("startTimeU")).clear();
		driver.findElement(By.id("startTimeU")).sendKeys("15:30");

		driver.findElement(By.id("endTimeU")).click();
		driver.findElement(By.id("endTimeU")).clear();
		driver.findElement(By.id("endTimeU")).sendKeys("18:30");

		WebElement submit = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateService\"]/div[2]/div[1]/button")));
		submit.click();
		
		driver.quit();

	}
}

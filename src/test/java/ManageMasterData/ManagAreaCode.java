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

public class ManagAreaCode {

	@Test
	public void ManagAreaCode () {
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

		WebElement Area = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Manage Area Code")));
		Area.click();

		WebElement add = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		add.click();

		driver.findElement(By.id("siteName")).click();
		driver.findElement(By.id("siteName")).sendKeys("inst");

		driver.findElement(By.id("siteCode")).click();
		driver.findElement(By.id("siteCode")).sendKeys("10");

		driver.findElement(By.id("clinicName")).click();
		driver.findElement(By.id("clinicName")).sendKeys("clinic");

		driver.findElement(By.linkText("Save")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.findElement(By.id("file")).click();
		WebElement add1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		add1.click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		// driver.findElement(By.css("#updateAreaListForm >
		// input.btn.btn-primary.submitbtn")).click();
		WebElement upload = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#updateAreaListForm > input.btn.btn-primary.submitbtn")));
		upload.click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement edite = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[6]/a")));
		edite.click();

		driver.findElement(By.id("siteNameU")).click();
		driver.findElement(By.id("siteNameU")).sendKeys("inst");

		driver.findElement(By.id("siteCodeU")).click();
		driver.findElement(By.id("siteCodeU")).sendKeys("test");

		driver.findElement(By.id("clinicNameU")).click();
		driver.findElement(By.id("clinicNameU")).sendKeys("clinic");

		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Save")));
		save.click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.click();
		search.sendKeys("inst");

		WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Delete")));
		delete.click();
		driver.quit();

	}
}

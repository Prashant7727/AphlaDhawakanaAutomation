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

public class Manage_Education {

	@Test
	public void Manage_Education () {

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

		WebElement manageEducation = wait.until(ExpectedConditions.elementToBeClickable(By.id("manageEducation")));
		manageEducation.click();

		WebElement addQulification = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")));
		addQulification.click();

		driver.findElement(By.id("qualificationName")).click();
		driver.findElement(By.id("qualificationName")).sendKeys("MBBS");
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
        .sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

//        driver.findElement(By.xpath("//*[@id=\"addQualification\"]/div/div[2]/input")).click();

		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement search = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("#example_filter > label > input[type=text]")));
		search.click();
		search.sendKeys("undefined");

		// edites
		WebElement edite = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[3]/a")));
		edite.click();
		
		WebElement edite1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("qualificationNameU")));
		edite1.click();
		edite1.clear();
		edite1.sendKeys("aaaa");
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#updateQualification > div > div.col-sm-2.col-xs-6 > a:nth-child(1)")).click();

		
		driver.quit();
	}
}

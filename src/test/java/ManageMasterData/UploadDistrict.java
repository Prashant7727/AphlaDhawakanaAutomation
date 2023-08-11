package ManageMasterData;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class UploadDistrict {

	@Test
	public void UploadDistrict () {
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
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement UploadDistricts = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageDistricts\"]")));
		UploadDistricts.click();

		// upload districts--------
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.xpath("//*[@id=\"updateDistrictListForm\"]/input[3]")).click();

		// both-------------*****************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		// upload districts--------
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.xpath("//*[@id=\"updateDistrictListForm\"]/input[3]")).click();

		// patient---------------------*************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// upload districts--------
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.findElement(By.xpath("//*[@id=\"updateDistrictListForm\"]/input[3]")).click();
		
		driver.quit();

	}

}

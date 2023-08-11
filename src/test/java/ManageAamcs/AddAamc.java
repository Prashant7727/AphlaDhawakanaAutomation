package ManageAamcs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class AddAamc {

	public static void main(String[] args) {
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
				WebElement ManageAamc = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageInstDivisions\"]")));
		ManageAamc.click();

		// Manage Aamc's-----------------------------------

		driver.findElement(By.linkText("Add AAMC")).click();
		driver.findElement(By.id("storeName")).click();
		driver.findElement(By.id("storeName")).sendKeys("Demo");
		driver.findElement(By.id("storeShortName")).click();
		driver.findElement(By.id("storeShortName")).sendKeys("demo");
		driver.findElement(By.id("teleConsult")).click();
		{
			WebElement dropdown = driver.findElement(By.id("teleConsult"));
			dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
		}
		driver.findElement(By.id("phcClinicType")).click();
		{
			WebElement dropdown = driver.findElement(By.id("phcClinicType"));
			dropdown.findElement(By.xpath("//option[. = 'Yes']")).click();
		}
		driver.findElement(By.id("address")).click();
		driver.findElement(By.id("address")).sendKeys("srinagar");
		driver.findElement(By.id("zipCode")).click();
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		driver.findElement(By.id("newuserform_stateProvinceGeoId")).click();
		{
			WebElement dropdown = driver.findElement(By.id("newuserform_stateProvinceGeoId"));
			dropdown.findElement(By.xpath("//option[. = 'UTTARANCHAL']")).click();
		}
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("srinagar");
		driver.findElement(By.id("vmId")).click();
		driver.findElement(By.id("vmId")).sendKeys("12345");
		driver.findElement(By.id("vmAvailability")).click();
		{
			WebElement dropdown = driver.findElement(By.id("vmAvailability"));
			dropdown.findElement(By.xpath("//option[. = 'Enable']")).click();
		}
		driver.findElement(By.id("medStkUpdatedStatus")).click();
		driver.findElement(By.xpath("//*[@id=\"medStkUpdatedStatus\"]/option[3]")).click();

		driver.findElement(By.id("labFacility")).click();
		driver.findElement(By.xpath("//*[@id=\"labFacility\"]/option[3]")).click();

		driver.findElement(By.id("EREFCLOSURE")).click();
		driver.findElement(By.xpath("//*[@id=\"EREFCLOSURE\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"add\"]/div/div/div/div[2]/div[2]/div/a[2]")).click();

	}

}

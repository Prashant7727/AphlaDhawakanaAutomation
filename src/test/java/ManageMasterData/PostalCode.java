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

public class PostalCode {

	@Test
	public void PostalCode () {
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
		WebElement PostalCode = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"managePostalCode\"]")));
		PostalCode.click();

		// Postal code------------------
		driver.findElement(By.linkText("Add PostalCode")).click();
		driver.findElement(By.id("zipCode")).sendKeys("232323");
		driver.findElement(By.id("stateProvinceGeoId")).sendKeys("1111");
		driver.findElement(By.id("district")).sendKeys("udham singh nagar");
		driver.findElement(By.id("city")).sendKeys("Jaspur");
		driver.findElement(By.id("locality")).sendKeys("Uttarakhand");
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:/Users/jsingh/Downloads/testpdf.xlsx");
		driver.findElement(By.xpath("//*[@id=\"updateCountryPostalCode\"]/input[3]")).click();

//        driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[6]/a")).click();
		WebElement Edit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[6]/a")));
		Edit.click();

		driver.findElement(By.xpath("//*[@id=\"Diagnosis_ZipCode\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_ZipCode\"]")).sendKeys("121212");
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_StateProvinceGeoId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_StateProvinceGeoId\"]")).sendKeys("bbbbb");
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_District\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_District\"]")).sendKeys("ccccc");
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_City\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_City\"]")).sendKeys("ddddd");
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_Locality\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Diagnosis_Locality\"]")).sendKeys("eeeee");
		driver.findElement(By.xpath("//*[@id=\"updatePostalCode\"]/div/div[6]/a[1]")).click();

		driver.quit();
	}

}

package ManageAamcs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;



public class EditAamc {

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
				WebElement EditAamc = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageInstDivisions\"]")));
		EditAamc.click();

		// edit aamcs---------------------------------------------------

		// Delay for 10 seconds
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("demo77");
		driver.findElement(By.xpath("//*[@id=\"popoverelement\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"popoverelement\"]/i")).click();

		driver.findElement(By.cssSelector(".odd:nth-child(1) .mdi-navigation-more-vert")).click();
		driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".odd:nth-child(1) .mdi-navigation-more-vert")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(3)"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}

	}

}

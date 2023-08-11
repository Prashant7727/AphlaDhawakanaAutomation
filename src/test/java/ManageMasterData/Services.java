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

public class Services {

	@Test
	public void Services () {
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
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// driver.quit();
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();
		WebElement Services = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"manageServices\"]")));
		Services.click();

		// services-------------------------------
//        driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();
		driver.findElement(By.linkText("Add Service")).click();
		driver.findElement(By.id("serviceName")).click();
		driver.findElement(By.id("ui-id-9")).click();
		driver.findElement(By.id("roleName")).click();
		driver.findElement(By.id("ui-id-21")).click();
		driver.findElement(By.id("serviceFee")).click();
		driver.findElement(By.id("ui-id-27")).click();
		driver.findElement(By.id("description")).click();
		driver.findElement(By.id("ui-id-33")).click();
		driver.findElement(By.id("incentive")).click();
//        driver.findElement(By.id("incentive")).sendKeys("demoo");
		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[2]/div[1]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"createName\"]")).sendKeys("demo1");
		driver.findElement(By.xpath("//*[@id=\"createValue\"]")).sendKeys("demo1");
		driver.findElement(By.xpath("//*[@id=\"displayCreateData\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"criteria1\"]/div/div[3]/a/img")).click();

		driver.findElement(By.xpath("//*[@id=\"createName\"]")).sendKeys("demo1");
		driver.findElement(By.xpath("//*[@id=\"createValue\"]")).sendKeys("demo1");
		driver.findElement(By.xpath("//*[@id=\"displayCreateData\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")).click();

		driver.findElement(By.xpath("//*[@id=\"downloadServiceFile\"]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"file\"]"))
				.sendKeys("C:\\Users\\psisodia\\Pictures\\Screenshots\\Screenshot (4).png");

		driver.findElement(By.xpath("//*[@id=\"addService\"]/div[3]/div[1]/input")).click();

//        driver.findElement(By.xpath("//*[@id=\"addService\"]/div[3]/div[1]/input")).sendKeys("PPP");

		WebElement SearchService = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService.sendKeys("10210");
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"serviceNameU\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"serviceNameU\"]")).sendKeys("PPP");
		driver.findElement(By.id("roleNameU")).click();
		driver.findElement(By.id("ui-id-23")).click();
		driver.findElement(By.id("descriptionU")).clear();
		driver.findElement(By.id("descriptionU")).sendKeys("hsadkshd");
		driver.findElement(By.cssSelector(".row:nth-child(3) > .col-sm-2:nth-child(1) > .btn")).click();

		WebElement SearchService1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		SearchService1.sendKeys("10210");
		
		driver.quit();

	}

}

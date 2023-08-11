package ManageMasterData;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class ManageRoleInformation {

	@Test
	public void ManageRoleInformation () {
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
		WebElement ManageMasterData = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[19]/div[1]/a")));
		ManageMasterData.click();

		WebElement ManageRoleInformation = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("manageRoleInformation")));
		ManageRoleInformation.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("roleId")).click();
		WebElement RoleId = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-5\"]/li[25]")));
		RoleId.click();

		driver.findElement(By.id("roleName")).click();
		WebElement ActualRoleName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")));
		ActualRoleName.click();

		driver.findElement(By.id("dispName")).click();
		WebElement DisplayRoleName = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-3\"]/li[7]")));
		DisplayRoleName.click();

		driver.findElement(By.xpath("//*[@id=\"addRoleInfo\"]/div[2]/div[1]/input")).click();

		WebElement search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search.sendKeys("END_USER_CUSTOMER");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")).click();

		driver.findElement(By.id("roleNameU")).click();
		WebElement ActualRoleNameEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-2\"]/li[1]")));
		ActualRoleNameEdit.click();

		driver.findElement(By.id("dispNameU")).click();
		WebElement DisplayRoleNameEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-4\"]/li[8]")));
		DisplayRoleNameEdit.click();

		driver.findElement(By.xpath("//*[@id=\"updateRole\"]/div[2]/div[1]/a")).click();

		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("roleId")).click();
		WebElement RoleId1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-5\"]/li[25]")));
		RoleId1.click();

		driver.findElement(By.id("roleName")).click();
		WebElement ActualRoleName1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")));
		ActualRoleName1.click();

		driver.findElement(By.id("dispName")).click();
		WebElement DisplayRoleName1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-3\"]/li[7]")));
		DisplayRoleName1.click();

		driver.findElement(By.xpath("//*[@id=\"addRoleInfo\"]/div[2]/div[1]/input")).click();

		WebElement search1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search1.sendKeys("END_USER_CUSTOMER");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")).click();

		driver.findElement(By.id("roleNameU")).click();
		WebElement ActualRoleNameEdit1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-2\"]/li[1]")));
		ActualRoleNameEdit1.click();

		driver.findElement(By.id("dispNameU")).click();
		WebElement DisplayRoleNameEdit1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-4\"]/li[8]")));
		DisplayRoleNameEdit1.click();

		driver.findElement(By.xpath("//*[@id=\"updateRole\"]/div[2]/div[1]/a")).click();

		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div[1]/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.id("roleId")).click();
		WebElement RoleId2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-5\"]/li[25]")));
		RoleId2.click();

		driver.findElement(By.id("roleName")).click();
		WebElement ActualRoleName2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")));
		ActualRoleName2.click();

		driver.findElement(By.id("dispName")).click();
		WebElement DisplayRoleName2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-3\"]/li[7]")));
		DisplayRoleName2.click();

		driver.findElement(By.xpath("//*[@id=\"addRoleInfo\"]/div[2]/div[1]/input")).click();

		WebElement search2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"example_filter\"]/label/input")));
		search2.sendKeys("END_USER_CUSTOMER");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[4]/a")).click();

		driver.findElement(By.id("roleNameU")).click();
		WebElement ActualRoleNameEdit2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-2\"]/li[1]")));
		ActualRoleNameEdit2.click();

		driver.findElement(By.id("dispNameU")).click();
		WebElement DisplayRoleNameEdit2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-4\"]/li[8]")));
		DisplayRoleNameEdit2.click();

		driver.findElement(By.xpath("//*[@id=\"updateRole\"]/div[2]/div[1]/a")).click();

		driver.quit();
	}

}

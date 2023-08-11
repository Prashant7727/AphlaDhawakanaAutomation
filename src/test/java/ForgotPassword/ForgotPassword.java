package ForgotPassword;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {

	@Test
	public  void ForgotPassword() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://testserver.medongo.com:8443/admin/control/cclogin");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.navigate().refresh();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		driver.findElement(By.xpath("//*[@id=\"loginform\"]/a")).click();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement MedongoId = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kushalamId\"]")));
		MedongoId.sendKeys("4387GF675");
		driver.findElement(By.xpath("//*[@id=\"forgotform\"]/div[2]/div[2]/button")).click();

		WebElement Email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"emailId\"]")));
		Email.sendKeys("Praveen.G@medongo.com");
		driver.findElement(By.xpath("//*[@id=\"forgotform\"]/div[2]/div[2]/button")).click();

		WebElement MobileNumber = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mobileId\"]")));
		MobileNumber.sendKeys("9528968142");
		driver.findElement(By.xpath("//*[@id=\"forgotform\"]/div[2]/div[2]/button")).click();
		driver.quit();
	}

}

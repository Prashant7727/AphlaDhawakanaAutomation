package MasterProductManagement;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class MasterProductManagement {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
				WebElement ProductManagemnet = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[13]/div[1]/a")));
		ProductManagemnet.click();
		WebElement MasterProductManagemnet = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"facilityProducts\"]")));
		MasterProductManagemnet.click();

		// ................................clinic..................................
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div/div/div[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"addProductName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")).click();

		driver.findElement(By.id("addmedicineCategory")).click();
		driver.findElement(By.cssSelector("#addmedicineCategory > option:nth-child(6)")).click();

		WebElement Dosage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addDosage")));
		Dosage.sendKeys("10");

		WebElement PacketSize = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addpacketsize")));
		PacketSize.clear();
		PacketSize.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"producttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"producttype\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]/option")).click();

		WebElement ProductCost = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addProductCost")));
		ProductCost.sendKeys("1200");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[2]/div/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button[2]")).click();

		WebElement MedicineCategory = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#medCategory1")));
		MedicineCategory.clear();
		MedicineCategory.sendKeys("sgdjsdjks");

		WebElement ProductName = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#prdName1")));
		ProductName.clear();
		ProductName.sendKeys("productName_hbsdhv");

		WebElement DosageUpdate = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dosage1")));
		DosageUpdate.clear();
		DosageUpdate.sendKeys("16");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"strText1\"]/img")).click();
		// ..................................................................//

		driver.findElement(By.xpath("//*[@id=\"addProductName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")).click();

		driver.findElement(By.xpath("//*[@id=\"addmedicineCategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addmedicineCategory\"]/option[4]")).click();

		WebElement Dosage1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addDosage")));
		Dosage1.clear();
		Dosage1.sendKeys("10");

		WebElement PacketSize1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addpacketsize")));
		PacketSize1.clear();
		PacketSize1.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"producttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"producttype\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]/option")).click();

		WebElement ProductCost1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addProductCost")));
		ProductCost1.clear();
		ProductCost1.sendKeys("1200");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[2]/div/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button[2]")).click();

		WebElement MedicineCategory1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#medCategory2")));
		MedicineCategory1.clear();
		MedicineCategory1.sendKeys("update-sdgs-sdguis");

		WebElement ProductName1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prdName2\"]")));
		ProductName1.clear();
		ProductName1.sendKeys("productName_hbsdhv-ydsjvjs-shgdh");

		WebElement DosageUpdate1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dosage2\"]")));
		DosageUpdate1.clear();
		DosageUpdate1.sendKeys("999");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement filePath1 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1.sendKeys("C:/Users/jsingh/Desktop/jkjk.xlsx");

		WebElement UpdateProductList = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")));
		UpdateProductList.click();

		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[3]/div/a[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		// search from table
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search.sendKeys("KID_PRD_0089984");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[9]/a")).click();

		WebElement ProductName11 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prod_Name\"]")));
		ProductName11.clear();
		ProductName11.sendKeys("productName_1234_trhj_23");

		driver.findElement(By.xpath("//*[@id=\"editMedicineCategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editMedicineCategory\"]/option[8]")).click();

		WebElement DosageEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"editDosage\"]")));
		DosageEdit.clear();
		DosageEdit.sendKeys("1111111");

		WebElement PacketSizeEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editpacketsize")));
		PacketSizeEdit.clear();
		PacketSizeEdit.sendKeys("55");

		driver.findElement(By.xpath("//*[@id=\"editproducttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editproducttype\"]/option[2]")).click();

		WebElement ProductCostEdit = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prod_cost\"]")));
		ProductCostEdit.clear();
		ProductCostEdit.sendKeys("120099");

		driver.findElement(By.xpath("//*[@id=\"moha_Prod\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"moha_Prod\"]/option[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateProduct\"]/div[2]/div/div[4]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchAgain = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchAgain.sendKeys("KID_PRD_0089984");
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[4]/div/div[2]/div/a")).click();

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
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div/div/div[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"addProductName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")).click();

		driver.findElement(By.id("addmedicineCategory")).click();
		driver.findElement(By.cssSelector("#addmedicineCategory > option:nth-child(6)")).click();

		WebElement Dosage11 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addDosage")));
		Dosage11.sendKeys("10");

		WebElement PacketSize11 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addpacketsize")));
		PacketSize11.clear();
		PacketSize11.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"producttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"producttype\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]/option")).click();

		WebElement ProductCost11 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addProductCost")));
		ProductCost11.sendKeys("1200");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[2]/div/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button[2]")).click();

		WebElement MedicineCategory11 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#medCategory1")));
		MedicineCategory11.clear();
		MedicineCategory11.sendKeys("sgdjsdjks");

		WebElement ProductName111 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#prdName1")));
		ProductName111.clear();
		ProductName111.sendKeys("productName_hbsdhv");

		WebElement DosageUpdate11 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dosage1")));
		DosageUpdate11.clear();
		DosageUpdate11.sendKeys("16");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"strText1\"]/img")).click();
		// ..................................................................//

		driver.findElement(By.xpath("//*[@id=\"addProductName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")).click();

		driver.findElement(By.xpath("//*[@id=\"addmedicineCategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addmedicineCategory\"]/option[4]")).click();

		WebElement Dosage111 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addDosage")));
		Dosage111.clear();
		Dosage111.sendKeys("10");

		WebElement PacketSize111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addpacketsize")));
		PacketSize111.clear();
		PacketSize111.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"producttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"producttype\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]/option")).click();

		WebElement ProductCost111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addProductCost")));
		ProductCost111.clear();
		ProductCost111.sendKeys("1200");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[2]/div/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button[2]")).click();

		WebElement MedicineCategory111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#medCategory2")));
		MedicineCategory111.clear();
		MedicineCategory111.sendKeys("update-sdgs-sdguis");

		WebElement ProductName1111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prdName2\"]")));
		ProductName1111.clear();
		ProductName1111.sendKeys("productName_hbsdhv-ydsjvjs-shgdh");

		WebElement DosageUpdate111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dosage2\"]")));
		DosageUpdate111.clear();
		DosageUpdate111.sendKeys("999");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement filePath11 = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath11.sendKeys("C:/Users/jsingh/Desktop/jkjk.xlsx");

		WebElement UpdateProductList1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")));
		UpdateProductList1.click();

		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[3]/div/a[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		// search from table
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement search1 = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		search1.sendKeys("KID_PRD_0089984");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[9]/a")).click();

		WebElement ProductName11111 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prod_Name\"]")));
		ProductName11111.clear();
		ProductName11111.sendKeys("productName_1234_trhj_23");

		driver.findElement(By.xpath("//*[@id=\"editMedicineCategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editMedicineCategory\"]/option[8]")).click();

		WebElement DosageEdit1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"editDosage\"]")));
		DosageEdit1.clear();
		DosageEdit1.sendKeys("1111111");

		WebElement PacketSizeEdit1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editpacketsize")));
		PacketSizeEdit1.clear();
		PacketSizeEdit1.sendKeys("55");

		driver.findElement(By.xpath("//*[@id=\"editproducttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editproducttype\"]/option[2]")).click();

		WebElement ProductCostEdit1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prod_cost\"]")));
		ProductCostEdit1.clear();
		ProductCostEdit1.sendKeys("120099");

		driver.findElement(By.xpath("//*[@id=\"moha_Prod\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"moha_Prod\"]/option[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateProduct\"]/div[2]/div/div[4]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchAgain1 = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchAgain1.sendKeys("KID_PRD_0089984");
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[4]/div/div[2]/div/a")).click();

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
		driver.findElement(By.xpath("//*[@id=\"blockDiv\"]/div/div/div[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"addProductName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")).click();

		driver.findElement(By.id("addmedicineCategory")).click();
		driver.findElement(By.cssSelector("#addmedicineCategory > option:nth-child(6)")).click();

		WebElement Dosageboth = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addDosage")));
		Dosageboth.sendKeys("10");

		WebElement PacketSizeboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addpacketsize")));
		PacketSizeboth.clear();
		PacketSizeboth.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"producttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"producttype\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]/option")).click();

		WebElement ProductCostboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addProductCost")));
		ProductCostboth.sendKeys("1200");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[2]/div/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button[2]")).click();

		WebElement MedicineCategoryboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#medCategory1")));
		MedicineCategoryboth.clear();
		MedicineCategoryboth.sendKeys("sgdjsdjks");

		WebElement ProductNameboth = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#prdName1")));
		ProductNameboth.clear();
		ProductNameboth.sendKeys("productName_hbsdhv");

		WebElement DosageUpdateboth = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dosage1")));
		DosageUpdateboth.clear();
		DosageUpdateboth.sendKeys("16");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"strText1\"]/img")).click();
		// ..................................................................//

		driver.findElement(By.xpath("//*[@id=\"addProductName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[6]")).click();

		driver.findElement(By.xpath("//*[@id=\"addmedicineCategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addmedicineCategory\"]/option[4]")).click();

		WebElement Dosage1both = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addDosage")));
		Dosage1both.clear();
		Dosage1both.sendKeys("10");

		WebElement PacketSize1both = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addpacketsize")));
		PacketSize1both.clear();
		PacketSize1both.sendKeys("5");

		driver.findElement(By.xpath("//*[@id=\"producttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"producttype\"]/option[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"addMohaProd\"]/option")).click();

		WebElement ProductCost1both = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#addProductCost")));
		ProductCost1both.clear();
		ProductCost1both.sendKeys("1200");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[2]/div/div[3]/a")).click();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button[2]")).click();

		WebElement MedicineCategory1both = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#medCategory2")));
		MedicineCategory1both.clear();
		MedicineCategory1both.sendKeys("update-sdgs-sdguis");

		WebElement ProductName1both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prdName2\"]")));
		ProductName1both.clear();
		ProductName1both.sendKeys("productName_hbsdhv-ydsjvjs-shgdh");

		WebElement DosageUpdate1both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dosage2\"]")));
		DosageUpdate1both.clear();
		DosageUpdate1both.sendKeys("999");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement filePath1both = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		filePath1both.sendKeys("C:/Users/jsingh/Desktop/jkjk.xlsx");

		WebElement UpdateProductListboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"updateRefListForm\"]/input[3]")));
		UpdateProductListboth.click();

		driver.findElement(By.xpath("//*[@id=\"addProduct\"]/div[2]/div[3]/div/a[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

		// search from table
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchboth = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchboth.sendKeys("KID_PRD_0089984");

		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr/td[9]/a")).click();

		WebElement ProductName11both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prod_Name\"]")));
		ProductName11both.clear();
		ProductName11both.sendKeys("productName_1234_trhj_23");

		driver.findElement(By.xpath("//*[@id=\"editMedicineCategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editMedicineCategory\"]/option[8]")).click();

		WebElement DosageEditboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"editDosage\"]")));
		DosageEditboth.clear();
		DosageEditboth.sendKeys("1111111");

		WebElement PacketSizeEditboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#editpacketsize")));
		PacketSizeEditboth.clear();
		PacketSizeEditboth.sendKeys("55");

		driver.findElement(By.xpath("//*[@id=\"editproducttype\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editproducttype\"]/option[2]")).click();

		WebElement ProductCostEditboth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"prod_cost\"]")));
		ProductCostEditboth.clear();
		ProductCostEditboth.sendKeys("120099");

		driver.findElement(By.xpath("//*[@id=\"moha_Prod\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"moha_Prod\"]/option[2]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"updateProduct\"]/div[2]/div/div[4]/a[1]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchAgainboth = driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input"));
		searchAgainboth.sendKeys("KID_PRD_0089984");
		driver.findElement(By.xpath("/html/body/aside/div[2]/div[4]/div/div[2]/div/a")).click();

	}

}

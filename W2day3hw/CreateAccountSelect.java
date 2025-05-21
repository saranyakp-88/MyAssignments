package week2.day3hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TESTACCB");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement indId = driver.findElement(By.name("industryEnumId"));
		Select dd = new Select(indId);
		dd.selectByIndex(4);
		
		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select dd1 = new Select(own);
		dd1.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select dd2 = new Select(source);
		dd2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement ecomm = driver.findElement(By.name("marketingCampaignId"));
		Select dd3 = new Select(ecomm);
		dd3.selectByIndex(7);
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd4 = new Select(state);
		dd4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	Thread.sleep(3000);
	driver.close();

	}

}

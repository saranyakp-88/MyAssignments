package week2.day4hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.id("ext-gen266")).sendKeys("23");
		driver.findElement(By.id("ext-gen270")).sendKeys("234432");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(4000);
		String value = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		int leadID = Integer.parseInt(value);
		System.out.println(leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen246")).sendKeys(value);
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(3000);
		String display = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(display);
	}

}

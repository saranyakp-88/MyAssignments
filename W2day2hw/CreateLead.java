package week2.day2hw;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTACC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(4000);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(4000);
		driver.close();
	}

}

package week2.day4hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	
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
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TEST COMPANY");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("TEST FIRST");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TEST LAST");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TEST LAST");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TEST DEPARTMENT");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("TEST DESCRIPTION");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
			
			WebElement dd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select option = new Select(dd);
			option.selectByVisibleText("Alabama");
			
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("NOTE important");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			Thread.sleep(4000);
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			Thread.sleep(2000);
			driver.close();
			
			
			
			
			


	}

}

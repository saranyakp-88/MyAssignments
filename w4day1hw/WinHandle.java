package week4.day1hw;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WinHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
				
		//login		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//From Contact
		driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']/following::img")).click();
		Thread.sleep(3000);
		//handle window - widget and child window
		Set<String> winH=driver.getWindowHandles();
		List<String> childW= new ArrayList<String>(winH);
		driver.switchTo().window(childW.get(1));
		driver.findElement(By.xpath("//a[text()='DemoPrivilegedCust']")).click();
		//parent window and widget
		driver.switchTo().window(childW.get(0));
		//To Contact
		driver.findElement(By.xpath("(//div[@id='sectionHeaderTitle_contacts']/following::img)[2]")).click();
		
		Thread.sleep(3000);
		Set<String> winHd=driver.getWindowHandles();
		List<String> childWd= new ArrayList<String>(winHd);
		driver.switchTo().window(childWd.get(1));
		driver.findElement(By.xpath("//a[text()='FrenchCustomer']")).click();
		driver.switchTo().window(childWd.get(0));
		
		//Parent window - Merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		String title = driver.getTitle();
		System.out.println("Title of the page is :" +title);
		
		
		
		
		
		

	}

}
